  /*----------------------------------------------------------------------------*/
  /* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
  /* Open Source Software - may be modified and shared by FRC teams. The code   */
  /* must be accompanied by the FIRST BSD license file in the root directory of */
  /* the project.                                                               */
  /*----------------------------------------------------------------------------*/

  package frc.robot.subsystems;

  import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

  /**
   * Add your docs here.
   */
  public class DriveTrain extends Subsystem {
  WPI_TalonSRX leftFrontTalon = null;
  WPI_TalonSRX leftBackTalon = null;
  WPI_TalonSRX rightFrontTalon = null;
  WPI_TalonSRX rightBackTalon = null;
  WPI_TalonSRX upDownThingy = null;
  public DifferentialDrive m_Drive;
  private double m_MotorSensitivity = -.8f;
  public DriveTrain() {

    leftFrontTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_LEFT_FRONT_TALON);
    leftBackTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_LEFT_BACK_TALON);
    rightFrontTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_RIGHT_FRONT_TALON);
    rightBackTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_RIGHT_BACK_TALON);
  }
    @Override
    public void initDefaultCommand() {
      
      SpeedControllerGroup m_leftMotorGroup = new SpeedControllerGroup(leftFrontTalon, leftBackTalon);
      SpeedControllerGroup m_rightMotorGroup = new SpeedControllerGroup(rightFrontTalon, rightBackTalon);
      
      m_Drive = new DifferentialDrive(m_leftMotorGroup, m_rightMotorGroup);

      // Set the default command for a subsystem here.
      // setDefaultCommand(new MySpecialCommand());
      setDefaultCommand(new Drive());
    }
    public void tankDrive(double left, double right){
      m_Drive.tankDrive(left * m_MotorSensitivity, right * m_MotorSensitivity);
    }
    
  }
