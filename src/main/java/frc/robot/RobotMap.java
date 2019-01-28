/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  /**
   *
   */

  public static final int DRIVETRAIN_LEFT_FRONT_TALON = 0;
  public static final int DRIVETRAIN_LEFT_BACK_TALON = 2;
  public static final int DRIVETRAIN_RIGHT_FRONT_TALON = 1;
  public static final int DRIVETRAIN_RIGHT_BACK_TALON = 3;
  public static final int LIFT_PORT = 4;
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  //solenoids test
<<<<<<< HEAD
  public static final int SOLONOID_1 = 0;
  public static final int SOLONOID_2 = 1;
  public static final int SOLONOID_3 = 2;
  public static final int NULLONOID = 1;
=======
  public static final int SOLONOID = 0;
>>>>>>> 88d09752a2c971800c4ac4fb23f15baad32cd6af
  public static final int MAIN_GYRO = 0;
}
