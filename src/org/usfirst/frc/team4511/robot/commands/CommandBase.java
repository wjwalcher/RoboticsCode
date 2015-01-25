package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.OI;
import org.usfirst.frc.team4511.robot.RobotMap;
import org.usfirst.frc.team4511.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class CommandBase extends Command {

	public static OI oi;
	public static RobotMap robotMap = new RobotMap();
    public static DriveTrain driveMec = new DriveTrain();
	    
    public CommandBase() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

    }

    // Called just before this Command runs the first time
    public static void init() {
    	oi = new OI();

    	
    	SmartDashboard.putData(driveMec);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}
}
