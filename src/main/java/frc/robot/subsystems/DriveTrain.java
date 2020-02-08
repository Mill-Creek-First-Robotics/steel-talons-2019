  /*----------------------------------------------------------------------------*/
  /* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
  /* Open Source Software - may be modified and shared by FRC teams. The code   */
  /* must be accompanied by the FIRST BSD license file in the root directory of */
  /* the project.                                                               */
  /*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
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
  public DifferentialDrive m_Drive;
  private double m_MotorSensitivity = -.8f;
  private Solenoid gearbox;
  public DriveTrain() {
    super("Turn", 1.0, 0.0, 0.0);
    leftFrontTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_LEFT_FRONT_TALON);
    leftBackTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_LEFT_BACK_TALON);
    rightFrontTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_RIGHT_FRONT_TALON);
    rightBackTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_RIGHT_BACK_TALON);

    setPercentTolerance(5.0);
  }
    @Override
    public void initDefaultCommand() {
      
      SpeedControllerGroup m_leftMotorGroup = new SpeedControllerGroup(leftFrontTalon, leftBackTalon);
      SpeedControllerGroup m_rightMotorGroup = new SpeedControllerGroup(rightFrontTalon, rightBackTalon);
      
      m_Drive = new DifferentialDrive(m_leftMotorGroup, m_rightMotorGroup);
      gearbox = new Solenoid(7);
      gearbox.set(true);
      // Set the default command for a subsystem here.
      // setDefaultCommand(new MySpecialCommand());
      setDefaultCommand(new Drive());
    }
    protected double returnPIDInput(){
      return Robot.m_gyro.getAngle();
    }
    public void tankDrive(double left, double right){
      m_Drive.tankDrive(left * m_MotorSensitivity, right * m_MotorSensitivity);
    }

    public void cheeseDrive(double speed, double rot, boolean isTurn) {
      m_Drive.curvatureDrive(speed * m_MotorSensitivity, rot, isTurn);
    }

    public void arcadeDrive(double speed, double rot){
      m_Drive.arcadeDrive(speed, rot);
    }

    public void PIDturn(double d){
      setSetpoint(d);
    }
    public void turbo()
    {
      m_MotorSensitivity = -2;
    }
    public void normal()
    {
      m_MotorSensitivity = -.8f; 
    }
    
  @Override
  protected void usePIDOutput(double output) {
    m_Drive.arcadeDrive(0.0, output, true);
  }
    
  }
