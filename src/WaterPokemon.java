public class WaterPokemon extends Pokemon {
    private int swimSpeed  ;
    private int waterTemperature  ;
    private final String type = "Water";


    public WaterPokemon(String name, int hp, int attack, int defence, int swimSpeed, int waterTemperature){
        super(name, hp, attack, defence);
        this.swimSpeed  = swimSpeed ;
        this.waterTemperature  = waterTemperature ;
    }

    public void hydroPump() {
        System.out.println(getName() + " used hydro pump with " + getAttack() + " attack power. And " + swimSpeed + "  swim speed with " + waterTemperature + " water temperature");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type + " Swimspeed: " + swimSpeed + ". Water temperature: " + waterTemperature);
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public int getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(int waterTemperature) {
        this.waterTemperature = waterTemperature;
    }
}
