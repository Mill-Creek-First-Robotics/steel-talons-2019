/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ShooterDown;
import frc.robot.commands.ShooterUp;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);
	public static Joystick m_leftController = new Joystick(0);
	public static Joystick m_rightController = new Joystick(1);
  //2  3
  public static JoystickButton m_LeftThumb = new JoystickButton(m_leftController, 2);
  public static JoystickButton m_RightThumb = new JoystickButton(m_leftController, 3);
  public static JoystickButton m_UpperLeftThumb = new JoystickButton(m_leftController, 4);
  public static JoystickButton m_Button7 = new JoystickButton(m_leftController, 6);
  public static JoystickButton m_UpperRightThumb = new JoystickButton(m_leftController, 5);
  public static JoystickButton m_Trigger = new JoystickButton(m_leftController, 0);
  public static JoystickButton m_Button8 = new JoystickButton(m_leftController, 7);
  public static JoystickButton m_Button9 = new JoystickButton(m_leftController, 8);
  public static JoystickButton m_Button10 = new JoystickButton(m_leftController, 9);
  public static JoystickButton m_Button12 = new JoystickButton(m_leftController, 10);
  public static JoystickButton m_Button11 = new JoystickButton(m_leftController, 11);
  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:
  public OI(){
    m_LeftThumb.whenPressed(new ShooterUp());
    m_LeftThumb.whenReleased(new ShooterDown());

  }
  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
