public class Boss {
    private int health;
    private int damage;
    private String defenceType;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getDefence() {
        return defenceType;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefence(String defence) {
        this.defenceType = defence;
    }
}
