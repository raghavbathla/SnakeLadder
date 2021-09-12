package com.bridgelab.snakeladder;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here'
        ArrayList<Integer> position = new ArrayList();
        int numberofdice = 0;
        Snakeladder snakeladder = new Snakeladder();
        Scanner sc = new Scanner(System.in);

while(Snakeladder.startpoint !=100 )
{
    int dice = snakeladder.dice();
    int option = snakeladder.options();
    int start = Snakeladder.startpoint;
    int move = snakeladder.move(start,dice,option);
    Snakeladder.startpoint = move;
    position.add(Snakeladder.startpoint);
    numberofdice++;
    System.out.println("Dice =" + dice);
    System.out.println("Position of player=" +Snakeladder.startpoint);
    System.out.println(" ");
//    System.out.println("Press M to move");
//    sc.next();
}

//Result

        System.out.println(" ");

System.out.println("Total number of dice rols"+numberofdice);

System.out.println(" ");


System.out.println("All the position are");
for(int m:position){
    System.out.println(m);
}

    }
}
