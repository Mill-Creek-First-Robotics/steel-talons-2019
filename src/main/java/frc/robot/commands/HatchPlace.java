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
public class HatchPlace extends Command {
  /*public HatchPlace() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_lift);
    requires(Robot.m_shooter);
  }
  final private long nano = 1000000000;
  private long startTime = System.nanoTime();
  private long elapsedTime = 0;

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  startTimer();
  }
private void startTimer() {
  startTime = System.nanoTime();
}

private long resetTimer() {
  long out = System.nanoTime() - startTime;
  startTimer();
  this.elapsedTime += out;
  return out;
}

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if (this.elapsedTime <= 1.3*nano) {
      Robot.m_shooter.armIn();
      return;
    }
    if (this.elapsedTime <= 1.2*nano) {
      Robot.m_lift.down();
      return;
    }
    if (this.elapsedTime <= .2*nano) {
    Robot.m_shooter.pitchDown();
    return;
    }
    if (this.elapsedTime <= .1*nano) {
    Robot.m_shooter.armOut();
    Robot.m_shooter.pitchUp();
    return;
  }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return this.elapsedTime >= 1.4*nano;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }*/
}
