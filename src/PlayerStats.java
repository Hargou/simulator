/**
 * Created by paloalto on 12/7/2016.
 */
/*
  Sets playes fighting attributes such as Health, Speed, Blindeness.
  author: Karan Srivastava
*/


public class PlayerStats
{
    private int health;
    private int speed;
    private int strength;
    private int jumpboost;
    private int haste;
    private int blindness;

    public void setHealth(int newHealth){
        health = newHealth;
    }
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }
    public void setStrength(int newStrength){
        strength = newStrength;
    }
    public void setJumpboost(int newJumpboost){
        jumpboost = newJumpboost;
    }
    public void setHaste(int newHaste){
        haste = newHaste;
    }
    public void setBlindness(int newBlindness){
        blindness = newBlindness;
    }
    public int getHealth(){
        return health;
    }
    public int getSpeed(){
        return speed;
    }
    public int getStrength(){
        return strength;
    }
    public int getHaste(){
        return haste;
    }
    public int getBlindness(){
        return blindness;
    }
}