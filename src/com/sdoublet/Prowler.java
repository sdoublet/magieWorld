package com.sdoublet;

public class Prowler extends Player {


    protected Prowler(String name, String avatar, String basicAttack, String specialAttack, double level, double health, double power, double agility, double intelligence, double damageBasicAttack, double damageSpecialAttack, double effectSpecialAttack) {
        super(name, avatar, basicAttack, specialAttack, level, health, power, agility, intelligence, damageBasicAttack, damageSpecialAttack, effectSpecialAttack);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getAvatar() {
        return "Prowler";
    }

    @Override
    public void setAvatar(String avatar) {
        super.setAvatar(avatar);
    }

    @Override
    public String getBasicAttack() {
        return "Tir à l'Arc";
    }

    @Override
    public void setBasicAttack(String basicAttack) {
        super.setBasicAttack(basicAttack);
    }

    @Override
    public String getSpecialAttack() {
        return "Concentration";
    }

    @Override
    public void setSpecialAttack(String specialAttack) {
        super.setSpecialAttack(specialAttack);
    }

    @Override
    public double getLevel() {
        return super.getLevel();
    }

    @Override
    public void setLevel(double level) {
        super.setLevel(level);
    }

    @Override
    public double getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(double health) {
        super.setHealth(health);
    }

    @Override
    public double getPower() {
        return super.getPower();
    }

    @Override
    public void setPower(double power) {
        super.setPower(power);
    }

    @Override
    public double getAgility() {
        return super.getAgility();
    }

    @Override
    public void setAgility(double agility) {
        super.setAgility(agility);
    }

    @Override
    public double getIntelligence() {
        return super.getIntelligence();
    }

    @Override
    public void setIntelligence(double intelligence) {
        super.setIntelligence(intelligence);
    }

    @Override
    public double getDamageBasicAttack() {
        return agility;
    }

    @Override
    public void setDamageBasicAttack(double damageBasicAttack) {
        super.setDamageBasicAttack(damageBasicAttack);
    }

    @Override
    public double getDamageSpecialAttack() {
        return super.getDamageSpecialAttack();
    }

    @Override
    public void setDamageSpecialAttack(double damageSpecialAttack) {
       super.setDamageSpecialAttack(damageSpecialAttack);
    }

    @Override
    public double getEffectSpecialAttack() {
        return agility=agility+(level/2);
    }

    @Override
    public void setEffectSpecialAttack(double effectSpecialAttack) {
        super.setEffectSpecialAttack(effectSpecialAttack);
    }
}
