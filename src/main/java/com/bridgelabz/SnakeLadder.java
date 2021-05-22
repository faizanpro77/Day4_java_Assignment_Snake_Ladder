package com.bridgelabz;

public class SnakeLadder {
    public static final int ladder = 1;
    public static final int snake = 2;
    public static final int winningPoints = 100;

    public static void main(String[] args) {
        System.out.println("Welcome  to snake & ladder game");
        //Starting position of player
        int  playerPosition = 0;
        System.out.println("Starting position of player : "+playerPosition);
        for(int dice = 1; playerPosition < winningPoints; dice++) {
            //To print random variables between 1-6 as dies
            int random = (int) (Math.random() * 6) + 1;
            //Random values to set ladder and snake
            int check = (int) (Math.random() * 3);
            int result = 0;
            //To check ladder or snake
            switch (check) {
                case ladder:
                    result += random;
                    break;
                case snake:
                    result -= random;
                    break;
                default:
                    result = 0;
            }
            playerPosition += result;
            if(playerPosition < 0)
                playerPosition = 0;
            //To find exact position 100 of player
            if(playerPosition > 100)
                playerPosition = playerPosition - result;
        }
        System.out.println("Position of player : " + playerPosition + " Winner");
    }
}

