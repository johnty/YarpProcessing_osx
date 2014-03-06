Yarp interface for Processing, OSX universal

Includes all the libraries required to run. may need to copy libACE into /usr/lib (or similar system path), but I think Eclipse handles it on runtime...

The sample project does the following:
- initialize yarp
- opens a port called /yarpProc
- sends mouse drag values (as a float between 0.0-1.0 mapped to window size) through the port.

To test, do the following:
- start nameserver
- run app. open a receive port
- connect receive port (this can of course be done in code if necessary using Network.connect("/src", "/dest")
- see values received on the other side when mouse is dragged.

2014 HPlusTech
Johnty Wang johntywang@gmail.com