package org.usfirst.frc.team4511.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import org.usfirst.frc.team4511.robot.RobotMap;
import org.usfirst.frc.team4511.robot.commands.Drive;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	protected RobotDrive DriveTrain;

	public void Drive() {
		DriveTrain = new RobotDrive(RobotMap.frontRight, RobotMap.frontLeft, RobotMap.backRight, RobotMap.backLeft);
		DriveTrain.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		DriveTrain.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
	}
    public void initDefaultCommand() {
    	
    	setDefaultCommand(new Drive());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void mecanumDrive(double x, double y, double z) {
    	DriveTrain.mecanumDrive_Cartesian(x, y, z, 0);
    }
}

