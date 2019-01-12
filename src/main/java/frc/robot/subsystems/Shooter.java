package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
    public void pitchUp(){
        pitchSolenoid.set(Value.kForward);
    }
    public void pitchDown(){
        pitchSolenoid.set(Value.kReverse);
    }
    DoubleSolenoid pitchSolenoid = null;
    public Shooter(){
        pitchSolenoid = new Solenoid(RobotMap.SHOOTER_PITCH_SOLENOID_DEPLOY,RobotMap.SHOOTER_PITCH_SOLENOID_RETRACT);
    }

}