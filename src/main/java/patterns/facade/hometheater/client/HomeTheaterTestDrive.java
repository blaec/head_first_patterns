package patterns.facade.hometheater.client;

import patterns.facade.hometheater.facade.HomeTheaterFacade;
import patterns.facade.hometheater.subsystem.*;

import java.util.Collections;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier("Amplifier");
		Tuner tuner = new Tuner("AM/FM Tuner", amp);
		StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
		CdPlayer cd = new CdPlayer("CD Player", amp);
		Projector projector = new Projector("Projector", player);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
 
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, screen, lights, popper);
 
		homeTheater.watchMovie("Raiders of the Lost Ark");
		System.out.printf("%n%s%n%n", String.join("", Collections.nCopies(50, "=")));
		homeTheater.endMovie();
	}
}
