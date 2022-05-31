package Assignment6;
/**
 * @ author: RIDHAM PATEL,000831171
 */
public class Hobbits extends Humanoids {
    /**
     * steal variable
     */
    private double steal;

    /**
     * default constructor
     * set default values
     */
    public Hobbits() {
        this(5, 5, 5, 5, 5, 5);
    }

    /**
     * parametrized constructor
     * @param strength
     * @param dexterity
     * @param armour
     * @param moxie
     * @param health
     * @param coin
     */
    public Hobbits(double strength, double dexterity, double armour, double moxie, double health, double coin) {
        super(strength, dexterity, armour, moxie, health, coin);
    }

    /**
     * steal method to increase coint
     */
    public void steal() {
        setCoin(getSteal() + (getDexterity() / 2));
    }

    /**
     * to get return value of steal
     * @return
     */
    public double getSteal() {
        steal = getCoin();
        return steal;
    }

    /**
     * torpint values
     * @return
     */
    @Override
    public String toString() {
        return "Hobbits{ " +
                super.toString() +
                '}';
    }
}
