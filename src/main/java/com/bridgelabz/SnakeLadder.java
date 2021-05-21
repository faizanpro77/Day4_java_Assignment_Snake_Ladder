package com.bridgelabz;

public class SnakeLadder {
    public static void main(String[] args) {

        System.out.println("Welcom  to snake & ladder game");
        //Starting position of player
        int playerPosition = 0;
        System.out.println("Starting position of player : "+playerPosition);
        //To print random variables between 1-6 as dies
        int random = (int)(Math.random()*6) + 1;
        System.out.println("Random variable from 1 - 6 : "+random);
    }
}
