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

  public static final int DRIVETRAIN_LEFT_FRONT_TALON = 03;
  public static final int DRIVETRAIN_LEFT_BACK_TALON = 04;
  public static final int DRIVETRAIN_RIGHT_FRONT_TALON = 01;
  public static final int DRIVETRAIN_RIGHT_BACK_TALON = 02;
  public static final int LIFT_PORT = 00;
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  //solenoids test
  public static final int SOLONOID_1 = 0;
  public static final int SOLONOID_2 = 1;
  public static final int SOLONOID_3 = 2;
  public static final int MAIN_GYRO = 0;
  public static final int GYRO_CHANNEL = 0; 

}
