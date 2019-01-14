package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Shooter extends Subsystem {
    Solenoid pitchSolenoid;
    public void pitchUp(){
        pitchSolenoid.set(true);
    }
    public void pitchDown(){
        pitchSolenoid.set(false);
    }
    
    public Shooter(){
        pitchSolenoid = new Solenoid(RobotMap.HanSolonoid);
    }

    @Override
    protected void initDefaultCommand() {

    }

}