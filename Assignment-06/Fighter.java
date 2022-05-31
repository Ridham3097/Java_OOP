package Assignment6;
/**
 * This class contains damage method which
 * @ author: RIDHAM PATEL,000831171
 */
public class Fighter extends Humanos {

    /**
     * default constructor of this class
     */
    public Fighter() {
        super(5, 5, 5, 5, 5, 5);
    }

    /**
     * paramtrized constructor of the class
     * @param strength
     * @param dexterity
     * @param armour
     * @param moxie
     * @param health
     * @param coin
     */
    public Fighter(double strength, double dexterity, double armour, double moxie, double health, double coin) {
        super(strength, dexterity, armour, moxie, health, coin);
    }

    /**
     * damage method which override its parent
     * class damage method
     */
    @Override
    public void damage() {
        setDamage(2 * getDamage());
    }

    /**
     * tostring method for print values
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
