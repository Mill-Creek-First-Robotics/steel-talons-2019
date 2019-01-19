package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Shooter extends Subsystem {
    Solenoid pitchSolenoid;
    public Shooter(){
        pitchSolenoid = new DoubleSolenoid(RobotMap.SOLONOID,RobotMap.NULLONOID);
    }
    public void pitchUp(){
        pitchSolenoid.set(Value.kForward);
    }
    public void pitchDown(){
        pitchSolenoid.set(Value.kReverse);
    }
    

    @Override
    protected void initDefaultCommand() {

    }

}