package patterns.command.c_simpleRemote.client;

import patterns.command.c_simpleRemote.receiver.GarageDoor;
import patterns.command.c_simpleRemote.receiver.Light;
import patterns.command.c_simpleRemote.command.GarageDoorOpenCommand;
import patterns.command.c_simpleRemote.command.LightOnCommand;
import patterns.command.c_simpleRemote.invoker.SimpleRemoteControl;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
 
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
    }
	
}
