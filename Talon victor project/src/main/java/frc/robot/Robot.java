/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.PWMTalonSRX;
/**
 * This sample program shows how to control a motor using a joystick. In the
 * operator control part of the program, the joystick is read and the value is
 * written to the motor.
 *
 * <p>Joystick analog values range from -1 to 1 and speed controller inputs also
 * range from -1 to 1 making it easy to work together.
 */
public class Robot extends TimedRobot {
  private static final int kJoystickPort = 0;

  private SpeedController m_motor1;
  private SpeedController m_motor2;
  private SpeedController m_motor3;
  private SpeedController m_motor4;
  private SpeedController m_motor5;
  private SpeedController m_motor6;
  private SpeedController m_motor7;
  private SpeedController m_motor8;
  private Joystick m_joystick;

  @Override
  public void robotInit() {
    m_motor1 = new PWMVictorSPX(0);
    m_motor2 = new PWMVictorSPX(1);
    m_motor3 = new PWMVictorSPX(2);
    m_motor4 = new PWMTalonSRX(3);
    m_motor5 = new PWMTalonSRX(4);
    m_motor6 = new PWMTalonSRX(5);
    m_motor7 = new PWMTalonSRX(6);
    m_motor8 = new PWMTalonSRX(7);
    m_joystick = new Joystick(kJoystickPort);
  }

  @Override
  public void teleopPeriodic() {
    m_motor1.set( m_joystick.getY() );
    m_motor2.set( m_joystick.getY() );
    m_motor3.set( m_joystick.getY() );
    m_motor4.set( m_joystick.getY() );
    m_motor5.set( m_joystick.getY() );
    m_motor6.set( m_joystick.getY() );
    m_motor7.set( m_joystick.getY() );
    m_motor8.set( m_joystick.getY() );
  }
}
//3 spx motors; 5 srx motors
