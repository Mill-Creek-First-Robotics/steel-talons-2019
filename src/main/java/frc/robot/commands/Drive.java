/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.OI;
import frc.robot.Robot;


/**
 * An example command. You can replace me with your own command.
 */
public class Drive extends Command {
  
  private final int TANK = 0, CHEESE = 1, ARCADE = 2; 
  

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
    double precision = 1.0;
    if (OI.m_rightController.getRawButton(2)) {
      precision = 0.5;
    } else {
      precision = 1.0;
    }
    // Yeet! I changed it!
    // double l = Math.copySign(OI.m_leftController.getY() * OI.m_leftController.getY(), OI.m_leftController.getY());
    // double r = Math.copySign(OI.m_rightController.getY() * OI.m_rightController.getY(), OI.m_rightController.getY());
    //System.out.println("$$$$$$$ Drive Type" + SmartDashboard.getNumber("driveStyle", TANK));
    switch((int) Robot.m_prefs.getDouble("driveStyle", TANK) ){
      case TANK:
        Robot.m_driveTrain.tankDrive(OI.m_leftController.getY() * precision, OI.m_rightController.getY() * precision);
        break;
      case CHEESE:
        Robot.m_driveTrain.cheeseDrive(OI.m_rightController.getX() * precision, OI.m_rightController.getY(), OI.m_rightController.getRawButton(12));
        break;
      case ARCADE:
        Robot.m_driveTrain.arcadeDrive(-1 * OI.m_rightController.getY() * precision, OI.m_rightController.getZ() * .7 * precision);
        break;
    }
       //hey guys, this is a very important line, pls no comment it or change it kthx
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
