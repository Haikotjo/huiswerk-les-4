public class Pokemon {
    private String name;
    private int hp ;

    private int attack;
    private int defence;


    public Pokemon (String name, int hp, int attack, int defence ) {
        this.name = name;
        this.hp  = hp ;
        this.attack  = attack ;
        this.defence  = defence ;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ". Healthpoints: " + hp + ". Attack power: " + attack + ". Defence: " + defence);
    }

    public void caculateHpLeft() {
        System.out.println("Damage done 20. " + name + " has " + (hp - 20) + " hp left." );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp ;
    }

    public void setHp(int hp ) {
        this.hp  = hp ;
    }

    public int getAttack() {
        return attack ;
    }

    public void setAttack(int attack ) {
        this.attack = attack;
    }
    public int getDefence() {
        return defence ;
    }

    public void setDefence(int defence ) {
        this.defence  = defence ;
    }
}
