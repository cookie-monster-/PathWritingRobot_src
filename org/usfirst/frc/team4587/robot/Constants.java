package org.usfirst.frc.team4587.robot;

import edu.wpi.first.wpilibj.Solenoid;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashMap;

/**
 * A list of constants used by the rest of the robot code. This include physics constants as well as constants
 * determined through calibrations.
 */
public class Constants{
    public static double kLooperDt = 0.005;

    public static double kSensorUnitsPerRotation = 4096;
    
    public static double kStepSizeSeconds = 0.01;
    public static double kMaxFeetPerSecond = 8.0;	//8
    public static double kMaxAcceleration = 3.0;	//4
    public static double kMaxJerk = 100000000000000.0;
    public static double kWheelBaseFeet = 26.96/12.0;//ft
    
    public static final double kLiftAMax = 20;
    public static final double kLiftVMax = 20;

    
    
}
