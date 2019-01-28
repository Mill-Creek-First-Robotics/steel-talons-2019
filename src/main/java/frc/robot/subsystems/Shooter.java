package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Shooter extends Subsystem {
    Solenoid pitchSolenoid1;
    Solenoid pitchSolenoid2;
    Solenoid pitchSolenoid3;
    public Shooter(){
        pitchSolenoid1 = new Solenoid(RobotMap.SOLONOID_1);
        pitchSolenoid2 = new Solenoid(RobotMap.SOLONOID_2);
        pitchSolenoid3 = new Solenoid(RobotMap.SOLONOID_3);
    }
    public void pitchUp(){
        pitchSolenoid1.set(true);
        pitchSolenoid2.set(true);
        pitchSolenoid3.set(true);
    }
    public void pitchDown(){
        pitchSolenoid1.set(false);
        pitchSolenoid2.set(false);
        pitchSolenoid3.set(false);
    }
    

    @Override
    protected void initDefaultCommand() {

    }

}