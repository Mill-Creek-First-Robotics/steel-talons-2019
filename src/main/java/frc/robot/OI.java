/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import frc.robot.commands.ArmIn;
import frc.robot.commands.ArmOut;
import frc.robot.commands.Ball;
import frc.robot.commands.BallRetract;
import frc.robot.commands.LiftDown;
import frc.robot.commands.LiftStop;
import frc.robot.commands.LiftUp;
import frc.robot.commands.Shooter;
import frc.robot.commands.ShooterUp;
import frc.robot.commands.Turn;

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
  
  public static JoystickButton m_Trigger = new JoystickButton(m_rightController, 1);
  public static JoystickButton m_SecondaryTrigger = new JoystickButton(m_rightController, 2);
  public static JoystickButton m_leftThumb = new JoystickButton(m_rightController, 3);
  public static JoystickButton m_RightThumb = new JoystickButton(m_leftController, 4);
  public static JoystickButton m_UpperLeftThumb = new JoystickButton(m_rightController, 5);
  public static JoystickButton m_UpperRightThumb = new JoystickButton(m_leftController, 6);
  public static JoystickButton m_LLeftThumb = new JoystickButton(m_leftController, 3);
  public static JoystickButton m_testOne = new JoystickButton(m_rightController, 7);
  public static JoystickButton m_testTwo = new JoystickButton(m_rightController, 8);
  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:
  public OI(){
    m_Trigger.whenPressed(new Shooter());
    //m_Trigger.whenReleased(new ShooterDown());
    m_UpperLeftThumb.whenPressed(new ArmOut());
    m_leftThumb.whenPressed(new ArmIn());
    m_RightThumb.whenPressed(new LiftUp());
    m_RightThumb.whenReleased(new LiftStop());
    m_UpperRightThumb.whenPressed(new LiftDown()); //test lift
    m_UpperRightThumb.whenReleased(new LiftStop()); //test lift
    m_testOne.whenPressed(new Ball());
    //m_testTwo.whenPressed(new BallRetract());


    // m_LLeftThumb.whenPressed(new Turn());

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
