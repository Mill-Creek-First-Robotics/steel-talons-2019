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
import frc.robot.commands.Drive;

  /**
   * Add your docs here.
   */
  public class DriveTrain extends PIDSubsystem {
  WPI_TalonSRX leftFrontTalon = null;
  WPI_TalonSRX leftBackTalon = null;
  WPI_TalonSRX rightFrontTalon = null;
  WPI_TalonSRX rightBackTalon = null;
  WPI_TalonSRX upDownThingy = null;
  Gyro gy;
  public DifferentialDrive m_Drive;
  private double m_MotorSensitivity = -.8f;
  public DriveTrain() {

    leftFrontTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_LEFT_FRONT_TALON);
    leftBackTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_LEFT_BACK_TALON);
    rightFrontTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_RIGHT_FRONT_TALON);
    rightBackTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_RIGHT_BACK_TALON);
    gy = new AnalogGyro(RobotMap.GYRO_CHANNEL);
    super("Turn", 1.0, 0.0, 0.0);
    setPercentTolerance(5.0);
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
    protected double returnPIDInput(){
      return gy.getAngle();
    }
    protected double usePIDOutput(){
      m_Drive.arcadeDrive(0.0, output, true);
    }
    public void tankDrive(double left, double right){
      m_Drive.tankDrive(left * m_MotorSensitivity, right * m_MotorSensitivity);
    }
    public void PIDturn(double d){
      setSetPoint(d);
    }
    
  }
