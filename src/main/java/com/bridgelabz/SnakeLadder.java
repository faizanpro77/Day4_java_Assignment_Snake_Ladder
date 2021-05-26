package com.bridgelabz;

public class SnakeLadder {
    public static final int LADDER = 0;
    public static final int SNAKE = 1;

    static void dieRollPosition() {
        int player1=0;
        int player2=0;
        int rolls=1;
        while(player1<100 && player2<100) {
            int dice1=(int) Math.floor(Math.random()*6+1);
            int option=(int) Math.floor(Math.random()*2);
            int temp1=player1;
            int temp2=player2;
            int dice2;
            switch(option) {
                case LADDER:
                    //Ladder-play
                    if(rolls%2!=0) {
                        player1=player1+dice1;
                        System.out.println("player1 position="+player1);
                        dice2=(int) Math.floor(Math.random()*6+1);
                        player1=player1+dice2;
                        System.out.println("player1 position="+player1);
                    }else {
                        player2=player2+dice1;
                        System.out.println("player2 position="+player2);
                        dice2=(int) Math.floor(Math.random()*6+1);
                        player2=player2+dice2;
                        System.out.println("player2 position="+player2);
                    }
                    break;
                case SNAKE:
                    //Snake-play
                    if(rolls%2!=0) {
                        player1=player1-dice1;
                        System.out.println("player1 position="+player1);
                    }else {
                        player2=player2-dice1;
                        System.out.println("player2 position="+player2);
                    }
                    break;
                default:
                    //no-play
                    break;
            }
            if(rolls%2!=0) {
                if(player1<0) {
                    player1=0;
                }
                if(player1>100) {
                    player1=temp1;
                }
            }else {
                if(player2<0) {
                    player2=0;
                }
                if(player2>100) {
                    player2=temp2;
                }
            }
            rolls++;
        }
        System.out.println("Number of rolls required to win the game="+(rolls-1));
        System.out.println("Final position of player1="+player1);
        System.out.println("Final position of player2="+player2);
        if(player1==100) {
            System.out.println("Player1 is the winner!!");
        }else if(player2==100){
            System.out.println("Player2 is the winner!!");
        }
    }
    public static void main(String[] args) {
        dieRollPosition();
    }
}


