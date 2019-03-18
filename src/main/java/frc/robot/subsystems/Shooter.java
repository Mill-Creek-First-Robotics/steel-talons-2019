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
    }
    public void pitchDown(){
        pitchSolenoid1.set(false);
    }
    public void armOut(){
        pitchSolenoid2.set(true);
    }
    public void armIn(){
        pitchSolenoid2.set(false);
    }
    public void ballEject(){
        pitchSolenoid3.set(true);
    }
    public void ballRetract(){
        pitchSolenoid3.set(false);
    }
    

    @Override
    protected void initDefaultCommand() {

    }

}
