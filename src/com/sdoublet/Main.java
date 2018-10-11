package com.sdoublet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Add Player1
        Player player1 = new Player("", "","","", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez votre avatar, 1: Warrior, 2: Prowler, 3: Wizard");
        if (sc.hasNext("1")) {
            player1 = new Warrior("", "","","", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        } else if (sc.hasNext("2")) {
            player1 = new Prowler("", "","","", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        } else if (sc.hasNext("3")) {
            player1 = new Wizard("", "","","",0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        }
        Scanner sp1 = new Scanner(System.in);
        System.out.println("Entrer votre nom");
        player1.setName(sp1.nextLine());
        System.out.println("Bienvenue dans MagiWorld " + player1.getAvatar() + " " + player1.getName());
        System.out.println("Entrer votre level");
        player1.setLevel(sp1.nextInt());
        System.out.println("Entrer votre force. La valeur max doit être inferieur à " + player1.getLevel());
        player1.setPower(sp1.nextInt());
        System.out.println("Entrer votre intelligence" + " Max " + (player1.getLevel() - player1.getPower()));
        player1.setIntelligence(sp1.nextInt());
        System.out.println("Entrer votre agilité " + "Max " + (player1.getLevel() - (player1.getPower() + player1.getIntelligence())));
        player1.setAgility(sp1.nextInt());
        player1.setHealth(player1.getLevel() * 3);//set health
        System.out.println(player1.getAvatar() + " " + player1.getName() + "\n" + "Votre level est de: " + player1.getLevel() + "\n" +
                "Votre force est de " + player1.getPower() + "\n" + "Votre inteligence est de: " + player1.getIntelligence() + "\n" +
                "Votre agilité est de : " + player1.getAgility() + "\n" + "Votre vie est de: " + player1.getHealth()+"\n");

//Add Player2
        Player player2 = new Player("", "","","", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Choisisser votre avatar, 1: Warrior, 2: Prowler, 3:Wizard");
        if (sc2.hasNext("1")) {
            player2 = new Warrior("", "","","", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        } else if (sc2.hasNext("2")) {
            player2 = new Prowler("", "","","", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        } else if (sc2.hasNext("3")) {
            player2 = new Wizard("", "","","", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        }
        Scanner sp2 = new Scanner(System.in);
        System.out.println("Entrer votre nom");
        player2.setName(sp2.nextLine());
        System.out.println("Bienvenue dans MagiWorld " + player2.getAvatar() + " " + player2.getName());
        System.out.println("Entre votre level");
        player2.setLevel(sp2.nextInt());
        System.out.println("Entrer votre force. La valeur max doit être inférieure à " + player2.getLevel());
        player2.setPower(sp2.nextInt());
        System.out.println("Entrer votre intelligence" + " Max " + (player2.getLevel() - player2.getPower()));
        player2.setIntelligence(sp2.nextInt());
        System.out.println("Entrer votre agilité " + "Max " + (player2.getLevel() - (player2.getPower() + player2.getIntelligence())));
        player2.setAgility(sp2.nextInt());
        player2.setHealth(player2.getLevel() * 3);
        System.out.println(player2.getAvatar() + " " + player2.getName() + "\n" + "votre level est de: " + player2.getLevel() + "\n" +
                "Votre force est de: " + player2.getPower() + "\n" + "Votre inteligence est de: " + player2.getIntelligence() + "\n" +
                "Votre agilité est de: " + player2.getAgility() + "\n" + "votre vie est de: " + player2.getHealth()+"\n");

// Set fight
        while (player1.getHealth() > 0 && player2.getHealth() > 0) {

            Scanner sf = new Scanner(System.in);
            System.out.println(player1.getAvatar() + " " + player1.getName() +" vous avez "+player1.getHealth()+" points de vie"+"\n"+ " Choisissez votre attaque: 1: Attaque basique, 2: Attaque spéciale");
            if (sf.hasNext("1")) {
                player2.setHealth(player2.getHealth() - player1.getDamageBasicAttack());
                System.out.println(player2.getAvatar() + " " + player2.getName() +" Vous avez subi de la part de "+player1.getAvatar()+" "+player1.getName()+" "+
                        player1.getBasicAttack()+" pour "+player1.getDamageBasicAttack()+" point de dégats"+"\n"+" Votre vie est désormais de: " + player2.getHealth()+"\n");
            } else if (sf.hasNext("2")) {
                player2.setHealth(player2.getHealth() - player1.getDamageSpecialAttack());
                player1.getEffectSpecialAttack();
                if (player1.getHealth()>player1.getLevel()*3){
                    player1.setHealth(player1.getLevel()*3);
                }
                System.out.println(player2.getAvatar()+" "+player2.getName()+" Vous avez subi de la part de "+player1.getAvatar()+" "+player1.getName()+" "+
                        player1.getSpecialAttack()+" pour "+player1.getDamageSpecialAttack()+" points de dégats"+"\n"+ "Votre vie est désormais de: "+player2.getHealth());
                System.out.println(player1.getAvatar()+" "+player1.getName()+" voici les effets de votre attaque spéciale sur votre avatar");
                System.out.println(" vie= "+player1.getHealth() + " agility= "+player1.getHealth()+"\n");

            }


            Scanner sf2 = new Scanner(System.in);
            System.out.println(player2.getAvatar() + " " + player2.getName() + " vous avez "+player2.getHealth()+" points de vie"+"\n"+" Choisissez votre attaque: 1: Attaque basique, 2: Attaque spéciale");
            if (sf2.hasNext("1")) {
                player1.setHealth(player1.getHealth() - player2.getDamageBasicAttack());
                System.out.println(player1.getAvatar() + " " + player1.getName() +" Vous avez subi de la part de "+player2.getAvatar()+" "+player2.getName()+" "+
                        player2.getBasicAttack()+" pour "+player2.getDamageBasicAttack() + " points de dégats"+"\n"+" Votre vie est désormais de: " + player1.getHealth()+"\n");
            } else if (sf.hasNext("2")) {
                player1.setHealth(player1.getHealth() - player2.getDamageSpecialAttack());
                player2.getEffectSpecialAttack();
                if (player2.getHealth()>player2.getLevel()*3){
                    player2.setHealth(player2.getLevel()*3);
                }
                System.out.println(player1.getAvatar()+" "+player1.getName()+" Vous avez subi de la part de "+player2.getAvatar()+" "+player2.getName()+" "+
                        player2.getSpecialAttack()+ " pour "+player2.getDamageSpecialAttack()+" points de dégats"+"\n"+ "Vote vie est désormais de "+player1.getHealth());
                System.out.println(player2.getAvatar()+" "+player2.getName()+" Voici les effets de votre attaque spéciale");
                System.out.println("vie ="+player2.getHealth()+" "+"agility= "+player2.getAgility()+"\n");

            }

        }
//Set end of game
        if (player1.getHealth() <= 0) {
            System.out.println("End of the game " + player2.getAvatar() + " " + player2.getName() + " is the WINNER!");
        } else if (player2.getHealth() <= 0) {
            System.out.println("End of the game " + player1.getAvatar() + " " + player1.getName() + " is the WINNER!");
        }
    }
}
