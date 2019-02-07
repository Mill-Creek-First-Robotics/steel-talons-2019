package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Shooter extends Subsystem {
    Solenoid pitchSolenoid1;
    Solenoid pitchSolenoid2;
    Solenoid pitchSolenoid3;
    Solenoid pitchSolenoid4;
    public Shooter(){
        pitchSolenoid1 = new Solenoid(RobotMap.SOLONOID_1);
        pitchSolenoid2 = new Solenoid(RobotMap.SOLONOID_2);
        pitchSolenoid3 = new Solenoid(RobotMap.SOLONOID_3);
        pitchSolenoid4 = new Solenoid(RobotMap.SOLONOID_4);
    }
    public void pitchUp(){
        pitchSolenoid1.set(true);
        pitchSolenoid2.set(true);
        pitchSolenoid3.set(true);
        pitchSolenoid4.set(true);
    }
    public void pitchDown(){
        pitchSolenoid1.set(false);
        pitchSolenoid2.set(false);
        pitchSolenoid3.set(false);
        pitchSolenoid4.set(false);
    }
    

    @Override
    protected void initDefaultCommand() {

    }

}