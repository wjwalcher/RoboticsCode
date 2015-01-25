package org.usfirst.frc.team4511.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4511.robot.commands.Extend;
import org.usfirst.frc.team4511.robot.commands.LiftDown;
import org.usfirst.frc.team4511.robot.commands.LiftStop;
import org.usfirst.frc.team4511.robot.commands.LiftUp;
import org.usfirst.frc.team4511.robot.commands.Retract;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
	public double deadzone;
	
	//public Button button6;
	public Button button1;
	public Button button3;
	public Button button2;
	public Button button8;
	public Button button10;
	public Joystick joystick1;
	public Joystick joystick2;

	// // CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	public OI() {
		joystick1 = new Joystick(0);
		joystick2 = new Joystick(1);
		button3 = new JoystickButton(joystick1, 3);
		button2 = new JoystickButton(joystick1, 2);
		button1 = new JoystickButton(joystick1, 1);
		//button6 = new JoystickButton(joystick1, 6);
		button10 = new JoystickButton(joystick2, 1);
		deadzone = .1;
	
		button3.whenPressed(new Extend());		
		button2.whenPressed(new Retract());
		button1.whileHeld(new LiftUp());
		button1.whenReleased(new LiftStop());
		button10.whileHeld(new LiftDown());
		button10.whenReleased(new LiftStop());
		//button6.whileHeld(new LiftDown());
		//button6.whenReleased(new LiftStop());
	}

	public double getXInput() {
		double x = joystick1.getX();
    		if (x > deadzone) {
    			return x * x;
    		}
    	
    		else if (x < deadzone) {
    			return -x * x;
    		}
    	
    		else {
    			return 0;
    		}
    	}
	public double getYInput() {
    	double y = joystick1.getY();
    		if (y > deadzone) {
    			return y * y;
    		}
    	
    		else if (y < deadzone) {
    			return -y * y;
    		}
    	
    		else {
    			return 0;
    		}
    	}
	public double getZInput() {
		double z = joystick2.getX();
			if (z > deadzone) {
				return z * z;
			}
			
			else if (z < deadzone) {
				return -z* z;
			}
			
			else {
				return 0;
			}
	}
	

			
}



	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	// // TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

