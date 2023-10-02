public class FirePokemon  extends Pokemon {
    private int smokeAmount;
    private int flameTemperature ;
    private final String type = "Fire";


    public FirePokemon(String name, int hp, int attack, int defence, int smokeAmount, int flameTemperature){
        super(name, hp, attack, defence);
        this.smokeAmount  = smokeAmount ;
        this.flameTemperature  = flameTemperature ;
    }

    public void fireLash() {
        System.out.println(getName() + " used Inferno with " + getAttack() + " attack power." + " and " + flameTemperature + " flame temprature");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type +  " SmokeAmount: " + smokeAmount + ". FlameTemperature: " + flameTemperature);
    }

    public int getSmokeAmount() {
        return smokeAmount;
    }

    public void setSmokeAmount(int smokeAmount) {
        this.smokeAmount = smokeAmount;
    }

    public int getFlameTemperature() {
        return flameTemperature;
    }

    public void setFlameTemperature(int flameTemperature) {
        this.flameTemperature = flameTemperature;
    }

}
