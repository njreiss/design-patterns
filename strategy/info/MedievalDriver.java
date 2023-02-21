package strategy;

public class MedievalDriver {

    public static void main(String[] args) {
        Character king = new King("Thomas");
        Character queen = new Queen("Isabella");
        Character knight = new Knight("Luke");
        Character troll = new Troll("Brownwen");

        System.out.println(king);
        System.out.println(king.attack());
        System.out.println("----------------");

        System.out.println(queen);
        System.out.println(queen.attack());
        System.out.println("----------------");

        System.out.println(knight);
        System.out.println(knight.attack());
        System.out.println("----------------");

        System.out.println(troll);
        System.out.println(troll.attack());
        troll.setWeaponBehavior(new WeaponNone());
        System.out.println(troll.attack());

    }
}