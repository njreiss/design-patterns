package strategy;

interface WeaponBehavior {
    public String attack();
}
class WeaponAxe implements WeaponBehavior{
    public String attack(){
        if(2*Math.random() >= 1){
            return "Swing an axe";
        }
        else{
            return "Twirl with an axe";
        }
    }
}
class WeaponBow implements WeaponBehavior{
    public String attack(){
        if(2*Math.random() >= 1){
            return "Draw and loose an arrow";
        }
        else{
            return "Shoot arrow high in the sky";
        }
    }
}
class WeaponKnife implements WeaponBehavior{
    public String attack(){
        double mathRand= 3*Math.random();
        if(mathRand >= 2){
            return "Slice with knife";
        }
        else if(mathRand <= 2 && mathRand >= 1){
            return "Jab with a knife";
        }
        else{
            return "Sneak up on opponent with knife";
        }
    }
}
class WeaponSword implements WeaponBehavior{
    public String attack(){
        double mathRand= 3*Math.random();
        if(mathRand >= 2){
            return "Lunge and strike with sword";
        }
        else if(mathRand <= 2 && mathRand >= 1){
            return "Fancy turn and slice with sword";
        }
        else{
            return "Jam opponents blade with sword";
        }
    }
}
class WeaponNone implements WeaponBehavior{
    public String attack(){
        if(2*Math.random() >= 1){
            return "Oh no! I lost my weapon";
        }
        else{
            return "No one let's me have a weapon";
        }
    }
}