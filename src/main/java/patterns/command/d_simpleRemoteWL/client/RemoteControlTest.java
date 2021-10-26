package patterns.command.d_simpleRemoteWL.client;

import patterns.command.d_simpleRemoteWL.invoker.SimpleRemoteControl;
import patterns.command.d_simpleRemoteWL.receiver.GarageDoor;
import patterns.command.d_simpleRemoteWL.receiver.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		remote.setCommand(light::on);
		remote.buttonWasPressed();
		remote.setCommand(garageDoor::up);
		remote.buttonWasPressed();
		remote.setCommand(garageDoor::lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageDoor::lightOff);
		remote.buttonWasPressed();
    }

}
