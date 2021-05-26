package com.bridgelabz;

public class SnakeLadder {
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int NOT_PLAY = 3;
    public static final int winningPoints = 100;

    public static void main(String[] args) {
        System.out.println("Welcome  to snake & ladder game");
        //Starting position of player
        int  playerPosition = 0;
        System.out.println("Starting position of player : "+playerPosition);
        for(int dice = 1; playerPosition < winningPoints; dice++) {
            //To print random variables between 1-6 as dies
            int die = (int) (Math.random() * 6) + 1;
            //Random values to set ladder and snake
            int check = (int) (Math.random() * 3) + 1;
            int result = 0;
            //To check ladder or snake
            switch (check) {
                case LADDER:
                    result += die;
                    break;
                case SNAKE:
                    result -= die;
                    break;
                case NOT_PLAY:
                    System.out.println("not play");
                    result = 0;
                    break;
            }
            playerPosition += result;
            //If player position below 0 then player position is 0
            if(playerPosition < 0)
                playerPosition = 0;
        }
        System.out.println("Position of player : " + playerPosition + " winner");
    }
}
