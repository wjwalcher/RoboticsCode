package org.usfirst.frc.team4511.robot;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
	
    public static Compressor compressor = new Compressor(0);
	
    public static CANTalon lift = new CANTalon(0);
	//Talons that comprise the DriveTrain.
    public static CANTalon frontRight = new CANTalon(2);
    public static CANTalon frontLeft = new CANTalon(3);
    public static CANTalon backRight = new CANTalon(4);
    public static CANTalon backLeft = new CANTalon(5);

    public static Talon tal = new Talon(0);
    
    
    //Solenoid
    public static Solenoid s1 = new Solenoid(0);
    public static Solenoid s2 = new Solenoid(1);
    
    
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
