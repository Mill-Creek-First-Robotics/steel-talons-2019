package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Shooter extends Subsystem {
    public void pitchUp(){
        pitchSolenoid.set(Value.kForward);
    }
    public void pitchDown(){
        pitchSolenoid.set(Value.kReverse);
    }
    DoubleSolenoid pitchSolenoid;
    public Shooter(){
        pitchSolenoid = new DoubleSolenoid(RobotMap.SHOOTER_PITCH_SOLENOID_DEPLOY,RobotMap.SHOOTER_PITCH_SOLENOID_RETRACT);
    }

}