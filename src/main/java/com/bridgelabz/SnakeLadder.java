package com.bridgelabz;

public class SnakeLadder {
    public static final int ladder = 1;
    public static final int snake = 2;
    public static final int winning_points = 100;

    public static void main(String[] args) {
        System.out.println("Welcom  to snake & ladder game");
        //Starting position of player
        int  playerPosition = 0;
        System.out.println("Starting position of player : "+playerPosition);
        //To print random variables between 1-6 as dies
        int random = (int)(Math.random()*6) + 1;
        System.out.println("Rolls Dies : "+random);
        //Random values to set ladder and snake
        int check = (int) (Math.random()*3);
        int result=0;
        //To check ladder or snake
        switch ( check ){
            case ladder:
                System.out.println("Ladder");
                result += random;
                break;
            case snake:
                System.out.println("Snake");
                result -= random;
                break;
            default:
                System.out.println("Not play");
                result = 0;
        }
        playerPosition += result;
        System.out.println("Posotoin of player : "+playerPosition);
    }
}
