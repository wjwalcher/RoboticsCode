package org.usfirst.frc.team4511.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4511.robot.RobotMap;

/**
 *
 */
public class ShootPiston extends Subsystem {
     Solenoid extend = RobotMap.sol;
     Solenoid retract = RobotMap.sol;
	
	public boolean extend() {
		extend.set(true);
	}
	
	public boolean retract() {
		retract.set(false);
	}
	
	public boolean stop() {
		extend.set(false);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

