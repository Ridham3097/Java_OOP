package Assignment6;

/**
 * @ author: RIDHAM PATEL,000831171
 */
public class Humanoids {
    /**
     * strength variable
     */
    private double strength = 20;
    /**
     * dexeterity variable
     */
    private double dexterity = 20;
    /**
     * armour variable
     */
    private double armour = 20;
    /**
     * moxie variable
     */
    private double moxie = 20;
    /**
     * health variable
     */
    private double health = 20;
    /**
     * coint variable
     */
    private double coin = 20;
    /**
     * damage variable
     */
    private double damage;
    /**
     * parametrized constructor
     * @param strength
     * @param dexterity
     * @param armour
     * @param moxie
     * @param health
     * @param coin
     */
    public Humanoids(double strength, double dexterity, double armour, double moxie, double health, double coin) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.armour = armour;
        this.moxie = moxie;
        this.health = health;
        this.coin = coin;
    }

    /**
     * to get value of strength
     * @return
     */
    public double getStrength() {
        return strength;
    }

    /**
     * to set value of strength
     * @param strength
     */
    public void setStrength(double strength) {
        this.strength = strength;
    }

    /**
     * to get value of dexeterity
     * @return
     */
    public double getDexterity() {
        return dexterity;
    }

    /**
     * to set value for dexterity
     * @param dexterity
     */
    public void setDexterity(double dexterity) {
        this.dexterity = dexterity;
    }

    /**
     * to get value of armour
     * @return
     */
    public double getArmour() {
        return armour;
    }

    /**
     * t set value of armou
     * @param armour
     */
    public void setArmour(double armour) {
        this.armour = armour;
    }

    /**
     * t get value of moxie
     * @return
     */
    public double getMoxie() {
        return moxie;
    }

    /**
     * to set value of moxie
     * @param moxie
     */
    public void setMoxie(double moxie) {
        this.moxie = moxie;
    }

    /**
     * to get value of coin
     * @return
     */
    public double getCoin() {
        return coin;
    }

    /**
     * to set value of coin
     * @param coin
     */
    public void setCoin(double coin) {
        this.coin = coin;
    }


    /**
     * to get value of damage
     * @return
     */
    public double getDamage() {
        return damage;
    }

    /**
     * to set value of damage
     * @param damage
     */
    public void setDamage(double damage) {
        this.damage = damage;
    }

    /**
     * damage method
     * to get average of strenth dexterity and health
     */
    public void damage() {
        damage = (strength + dexterity + health) / 3;
    }

    /**
     * health method
     */
    public void health() {
        health = health - (damage / armour);
    }

    /**
     * to get value of health
     * @return
     */
    public double getHealth() {
        return health;
    }

    /**
     * to set value of health
     * @param health
     */
    public void setHealth(double health) {
        this.health = health;
    }

    /**
     * to print values
     * @return
     */
    @Override
    public String toString() {
        if (health < 0) {
            return "He is dies";
        } else {
            return "strength=" + strength +
                            ", dexterity=" + dexterity +
                            ", armour=" + armour +
                            ", moxie=" + moxie +
                            ", health=" + health +
                            ", coin=" + coin ;
        }
    }

}
