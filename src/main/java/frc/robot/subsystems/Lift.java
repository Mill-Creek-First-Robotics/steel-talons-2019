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
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.*;

public class Lift extends PIDSubsystem {
  PIDSource distanceSensor = new Ultrasonic(0, 1);
  
  PIDController pid;
  SpeedController liftMotor;
  double speed = 0.5;
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
    liftMotor.set(speed);
  }
  public void down(){
    liftMotor.set(-1 * speed);
  }
  public void stop(){
    liftMotor.set(0);
  }

  @Override
  protected double returnPIDInput() {
    return 0;
  }

  @Override
  protected void usePIDOutput(double output) {

  }
}
