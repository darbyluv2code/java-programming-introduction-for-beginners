package oop.problems.vehicleversion7;

public class EngineOrMotor implements IEngineOrMotor {

    private String engineOrMotorType;

    public EngineOrMotor(String engineOrMotorType) {
        this.engineOrMotorType = engineOrMotorType;
    }

    public String getEngineOrMotorTypeType() {
        return engineOrMotorType;
    }

    public void startEngine() {
        System.out.println(getEngineOrMotorTypeType() + " is running");
    }

    public void stopEngine() {
        System.out.println(getEngineOrMotorTypeType() + " is off");
    }
}
