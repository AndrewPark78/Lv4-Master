package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings.
	// One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot r1 = new Robot(400, 600);
		Robot r2 = new Robot(500, 700);
		Robot r3 = new Robot(600, 600);
		Robot r4 = new Robot(700, 700);
		Robot r5 = new Robot(800, 600);
		r1.setSpeed(100);
		r2.setSpeed(100);
		r3.setSpeed(100);
		r4.setSpeed(100);
		r5.setSpeed(100);
		r1.penDown();
		r2.penDown();
		r3.penDown();
		r4.penDown();
		r5.penDown();
		r1.setPenColor(Color.BLUE);
		r2.setPenColor(Color.YELLOW);
		r3.setPenColor(Color.BLACK);
		r4.setPenColor(Color.GREEN);
		r5.setPenColor(Color.RED);
		new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r1.move(2);
				r1.turn(1);
			}
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r2.move(2);
				r2.turn(1);
			}
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r3.move(2);
				r3.turn(1);
			}
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r4.move(2);
				r4.turn(1);
			}
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r5.move(2);
				r5.turn(1);
			}
		}).start();
	}
}
