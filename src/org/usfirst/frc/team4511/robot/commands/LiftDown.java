package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftDown extends Command {

    public LiftDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//RobotMap.lift.set(-.5);
    	RobotMap.tal.set(-0.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	//RobotMap.lift.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
