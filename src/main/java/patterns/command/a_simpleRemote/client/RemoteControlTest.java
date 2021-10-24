package patterns.command.a_simpleRemote.client;

import patterns.command.a_simpleRemote.receiver.GarageDoor;
import patterns.command.a_simpleRemote.receiver.Light;
import patterns.command.a_simpleRemote.command.GarageDoorOpenCommand;
import patterns.command.a_simpleRemote.command.LightOnCommand;
import patterns.command.a_simpleRemote.invoker.SimpleRemoteControl;

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
