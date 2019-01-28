package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid.Value;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Shooter extends Subsystem {
    DoubleSolenoid pitchSolenoid1;
    DoubleSolenoid pitchSolenoid2;
    DoubleSolenoid pitchSolenoid3;
    public Shooter(){
        pitchSolenoid1 = new Solenoid(RobotMap.SOLONOID_1);
        pitchSolenoid2 = new Solenoid(RobotMap.SOLONOID_2);
        pitchSolenoid3 = new Solenoid(RobotMap.SOLONOID_3);
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