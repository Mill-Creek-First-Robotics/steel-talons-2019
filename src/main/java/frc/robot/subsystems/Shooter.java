package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid.Value;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Shooter extends Subsystem {
    DoubleSolenoid pitchSolenoid;
    public Shooter(){
        pitchSolenoid = new Solenoid(RobotMap.SOLONOID);
    }
    public void pitchUp(){
        pitchSolenoid.set(true);
    }
    public void pitchDown(){
        pitchSolenoid.set(false);
    }
    

    @Override
    protected void initDefaultCommand() {

    }

}