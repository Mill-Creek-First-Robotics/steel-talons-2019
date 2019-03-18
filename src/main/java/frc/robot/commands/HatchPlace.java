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
public class ExampleCommand extends Command {
  public ExampleCommand() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_subsystem);
  }
  final long nano = 1000000000
  long startTime = System.nanoTime();
  long elapsedTIme = 0;

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  startTimer();
  }
private static void startTimer() {
  startTime = System.nanoTime();
}

private static long resetTimer() {
  long out = System.nanoTime() - startTime;
  startTimer();
  elapsedTime += out;
  return out;
}

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if (elapsedTime <= 1.3*nano) {
      Robot.m_shooter.armIn();
      return
    }
    if (elapsedTime <= 1.2*nano) {
      Robot.m_lift.down();
      return
    }
    if (elapsedTime <= .2*nano) {
    Robot.m_shooter.pitchDown();
    return
    }
    if (elapsedTime <= .1*nano) {
    Robot.m_shooter.armOut();
    Robot.m_shooter.pitchUp();
    return
  }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return elapsedTime >= 5000000000
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
