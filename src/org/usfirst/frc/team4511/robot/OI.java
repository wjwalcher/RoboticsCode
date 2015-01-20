package org.usfirst.frc.team4511.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team4511.robot.commands.ExampleCommand;
import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
	public double deadzone;
	
	public Button buttonX;

	public Joystick Joystick1;
	public Joystick Joystick2;

	// // CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	public OI() {
		Joystick1 = new Joystick(1);
		Joystick2 = new Joystick(2);
		
		
		
		deadzone = .1;
	}

	public double getXInput() {
		double x = Joystick1.getX();
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
    	double y = Joystick1.getY();
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
		double z = Joystick2.getX();
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
	public boolean getTrigger() {
		double t = Joystick1.getTrigger();
		if (!t) {
			return ShootPiston.extend();
		}
		else if (t) {
			return ShootPiston.retract();
		}
		else {
			return false;
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
}
