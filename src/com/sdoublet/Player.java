package com.sdoublet;

public class Player {
    private String name;
    private String avatar;
    private String basicAttack;
    private String specialAttack;
    double level;
    double health;
    double power;
    double agility;
    double intelligence;
    private double damageBasicAttack;
    private double damageSpecialAttack;
    private double effectSpecialAttack;


    protected Player(String name, String avatar,String basicAttack,String specialAttack, double level, double health, double power, double agility, double intelligence,
                  double damageBasicAttack, double damageSpecialAttack, double effectSpecialAttack) {
        this.name = name;
        this.avatar = avatar;
        this.basicAttack=basicAttack;
        this.specialAttack=specialAttack;
        this.level = level;
        this.health = health;
        this.power = power;
        this.agility = agility;
        this.intelligence = intelligence;
        this.damageBasicAttack = damageBasicAttack;
        this.damageSpecialAttack = damageSpecialAttack;
        this.effectSpecialAttack = effectSpecialAttack;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBasicAttack() {
        return basicAttack;
    }

    public void setBasicAttack(String basicAttack) {
        this.basicAttack = basicAttack;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        if (level>=0 && level<=100){
            this.level=level;
        }else{
            System.out.println("la valeur est trop élevée");
            this.level=100;
        }
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power>=0 && power<=100 && power<=level){
            this.power=power;
        }else
            System.out.println("la valeur est trop élevée");
    }

    public double getAgility() {
        return agility;
    }

    public void setAgility(double agility) {
        if (agility>=0 && agility<=100 && agility<= level-(power+intelligence)){
            this.agility=agility;
        }else
            System.out.println("la valeur est trop élevée");
    }

    public double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(double intelligence) {
        if (intelligence>=0 && intelligence<=100 && intelligence<=level-power){
            this.intelligence=intelligence;
        }else
            System.out.println("La valeur est trop élevée");

    }

    public double getDamageBasicAttack() {
        return damageBasicAttack;
    }

    public void setDamageBasicAttack(double damageBasicAttack) {
        this.damageBasicAttack = damageBasicAttack;
    }

    public double getDamageSpecialAttack() {
        return damageSpecialAttack;
    }

    public void setDamageSpecialAttack(double damageSpecialAttack) {
        this.damageSpecialAttack = damageSpecialAttack;
    }

    public double getEffectSpecialAttack() {
        return effectSpecialAttack;
    }

    public void setEffectSpecialAttack(double effectSpecialAttack) {
        this.effectSpecialAttack = effectSpecialAttack;
    }
}
