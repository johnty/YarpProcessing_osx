
import processing.core.*;
import yarp.Port;
import yarp.Bottle;


public class ProcessingApp extends PApplet {

	/**
	 * Sample processing app with yarp interfaces
	 * Johnty Wang 2014 johntywang@gmail.com
	 * HPlusTech
	 */
	
	final static int screen_width = 640;
	final static int screen_height = 480;
	private Port port;
	private Bottle bot;
	private PFont font;
	private int mX;
	private int mY;
	private boolean mDown;
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		System.loadLibrary("jyarp");
		yarp.Network.init();
		PApplet.main(new String[] {"ProcessingApp"}); //windowed mode

	}
	
	public void setup() {
		font = loadFont("Tahoma-32.vlw");
		textFont(font, 32);

		size(screen_width, screen_height);
		background(0);
		port = new Port();
		bot = new Bottle();
		port.open("/yarpProc");
		mX = 0;
		mY = 0;
		mDown = false;

	}

	public void draw() {

		background(0);	
		fill(255);
		String str = "yarp port at "+ port.getName() + "; press esc to quit";
		text(str, 10, 25);
		if (mDown)
			fill(255,0,0);
		else
			fill(255);
		str = "sending pointer location "+ mX + ":" + mY;
		text(str, 10, 75);
	}

	public void keyPressed() {
		if (key == ESC) {
			println("closing port...");
			port.close();
			exit();
		}
	}

	public void mouseDragged() {
		mX = mouseX;
		mY = mouseY;
		conditionVals();
		sendBot();

	}

	public void mousePressed() {
		mX = mouseX;
		mY = mouseY;
		mDown = true;
		conditionVals();
		sendBot();
	}

	public void mouseReleased() {
		mDown = false;
	}
	
	private void conditionVals() {
		//check values and clip them if necessary
		if (mX < 0) mX = 0;
		if (mY < 0) mY = 0;
		if (mX > screen_width) mX = screen_width;
		if (mY > screen_height) mY = screen_height;
	}
	
	private void sendBot() {
		//update and send bottle
		bot.clear();
		bot.addString("/mouse");
		bot.addDouble((float)mX/screen_width);
		bot.addDouble((float)mY/screen_height);
		port.write(bot);
	}


}
