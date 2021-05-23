package com.bridgelabz;

public class SnakeLadder {
    public static final int ladder1 = 5;
    public static final int ladder2 = 9;
    public static final int ladder3 = 20;
    public static final int snake1 = 40;
    public static final int snake2 = 53;
    public static final int snake3 = 61;
    public static final int notPlay = 0;

    public static void main(String[] args) {
        System.out.println("Welcome  to snake & ladder game");
        //Starting position of player
        int  playerPosition = 0;
        System.out.println("Starting position of player : "+playerPosition);
            //To print random variables between 1-6 as dies
            int random = (int) (Math.random() * 6) + 1;
            //Random values to set ladder and snake
            int check = (int) (Math.random() * 65);
            int result = 0;
            //To check ladder or snake
            switch (check) {
                case ladder1:
                    result += 48;
                    break;
                case ladder2:
                    result += 30;
                    break;
                case ladder3:
                    result += 42;
                    break;
                case snake1:
                    result -= 3;
                    break;
                case snake2:
                    result -= 10;
                    break;
                case snake3:
                    result -= 17;
                    break;
                case notPlay:
                    System.out.println("not play");
                    result = 0;
                    break;
                default:
                    result = random;
            }
            playerPosition += result;
            System.out.println("Position of player : " + playerPosition);
    }
}
