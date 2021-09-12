package com.bridgelab.snakeladder;

import java.util.Random;

public class Snakeladder
{

    public static int startpoint=0;
//Dice

    private final int endPosition = 100;
    public int dice(){
        Random rn = new Random();
        int answer = rn.nextInt(6) + 1;
        return answer;
    }
    //Options
    public  int options(){
        Random rn = new Random();
        int answer = rn.nextInt(3);
        return answer;

    }

    public int move(int start,int dice, int option)
    {
    switch (option){
        case 0:
            System.out.println("Ohhoo No play");

     break;
        case 1:
            if(start<dice)
            {
                System.out.println("Ohoo Snake");
                break;
            }

            else {
                System.out.println("Ohoo Snake");
                start = start-dice;
                break;
            }


        case 2:
            int check = start+dice;
            if(check<=100) {
                System.out.println("Yeah Ladder");
                start = start + dice;
                break;
            }
            else{
                System.out.println("Yeah Ladder but cant move");
                break;
            }
    }
    return start;
    }


}
