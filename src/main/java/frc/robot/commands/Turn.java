/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class Turn extends Command {
  int counter = 0;  
  double[] angles = {28.75, 61.25, 90, (90 + 28.75), (90 + 61.25), 180, (180 + 28.75), (180 + 61.25), 270, (270 + 28.75), (270 + 61.25), 360};
  public Turn() {
    requires(Robot.m_driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.m_driveTrain.PIDturn(angles[counter%11]);
    counter ++;
  }
  /*
  private void PIDturn(double d) {
  }*/

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Robot.m_driveTrain.onTarget();
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
/*
@Override
protected double returnPIDInput() {
}

@Override
protected void usePIDOutput(double output) {
	
}*/
}
