public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(60);
        boss.setDefence("Armor");
        System.out.println("Boss Info");
        System.out.println("Health: " + boss.getHealth() + " Damage: " + boss.getDamage()
                + " Defence Type: " + boss.getDefence());

        Hero[] heroes = createHeroes();
        System.out.println("Heroes Info");
        for (Hero hero : createHeroes()){
            System.out.println("Health: " + hero.getHealth() + " Damage: " + hero.getDamage()
                    + " SuperPower: " + hero.getSuperPower());
        }
    }


    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 30, "Fly");
        Hero hero2 = new Hero(120, 50);
        Hero hero3 = new Hero(200, 15, "teleportation");

        Hero[] heroes = {hero1,hero2,hero3};

        return heroes;
    }
}
