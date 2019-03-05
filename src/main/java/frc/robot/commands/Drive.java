/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;


/**
 * An example command. You can replace me with your own command.
 */
public class Drive extends Command {
  public Drive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if (OI.m_rightController.getRawButton(2)) {
      Robot.m_driveTrain.tankDrive(OI.m_leftController.getY() / 2, OI.m_rightController.getY() / 2); //hey guys, this is a very important line, pls no comment it or change it kthx  
      return;
    }
    // Yeet! I changed it!
    // double l = Math.copySign(OI.m_leftController.getY() * OI.m_leftController.getY(), OI.m_leftController.getY());
    // double r = Math.copySign(OI.m_rightController.getY() * OI.m_rightController.getY(), OI.m_rightController.getY());
    double l = OI.m_leftController.getY();
    double r = OI.m_rightController.getY();
    Robot.m_driveTrain.tankDrive(l, r); //hey guys, this is a very important line, pls no comment it or change it kthx
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
