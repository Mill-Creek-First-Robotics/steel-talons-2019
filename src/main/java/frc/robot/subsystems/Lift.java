/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

import com.ctre.phoenix.motorcontrol.can.*;
import frc.robot.OI;
import frc.robot.RobotMap;

public class Lift extends PIDSubsystem {
  PIDSource distanceSensor = new Ultrasonic(0, 1);
  
  PIDController pid;
  SpeedController liftMotor;
  double speed = 0.7;
  public Lift(){
    super(1, 1, 1);
    liftMotor = new WPI_TalonSRX(RobotMap.LIFT_PORT);
    pid = new PIDController(1, 1, 1, distanceSensor, liftMotor);
  }

  @Override
  public void initDefaultCommand() {

    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public void up(){
    System.out.println("THROTTLE IS AT "+ getThrottle());
    // liftMotor.set(speed);
    liftMotor.set(speed * getThrottle());
  }
  public void down(){
    System.out.println("THROTTLE IS AT "+ getThrottle());
    // liftMotor.set(-1 * speed);
    liftMotor.set(-1 * speed * getThrottle());
  }
  public void stop(){
    liftMotor.set(0);
  }

  private double getThrottle(){
    return -((OI.m_leftController.getThrottle() + 1) / 2);
  }

  @Override
  protected double returnPIDInput() {
    return 0;
  }

  @Override
  protected void usePIDOutput(double output) {

  }
}
