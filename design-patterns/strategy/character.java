package strategy;
abstract class Character{
    protected String Name;
    protected WeaponBehavior WeaponBehavior;

    public Character(String name){

    }
    public String attack(){
        return this.WeaponBehavior.attack();
    }
    public void setWeaponBehavior(WeaponBehavior wb){
        this.WeaponBehavior = wb; 
    }
    public abstract String toString();
}
class King extends Character {
    public King(String title){
        super(title);
        Name = title;
        WeaponBehavior Sword = new WeaponSword();
        WeaponBehavior = Sword;
    }   
    public String toString(){
        return Name + " is a Noble King.";
    }
}
class Queen extends Character {
    public Queen(String title){
        super(title);
        Name = title;
        WeaponBehavior Knife = new WeaponKnife();
        WeaponBehavior = Knife;
    }   
    public String toString(){
        return Name + " is a beautiful queen";
    }
}
class Knight extends Character {
    public Knight(String title){
        super(title);
        Name = title;
        WeaponBehavior Bow = new WeaponBow();
        WeaponBehavior = Bow;
    }   
    public String toString(){
        return Name + "  is a valiant knight";
    }
}
class Troll extends Character {
    public Troll(String title){
        super(title);
        Name = title;
        WeaponBehavior Axe = new WeaponAxe();
        WeaponBehavior = Axe;
    }   
    public String toString(){
        return Name + " is a funny troll";
    }
}