/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;
import java.util.Scanner;
import java.util.Random;

public class TicTacToe {

    public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );
		String firstSlot = "";
		String secondSlot = "";
		String thirdSlot = "";
		String fourthSlot = "";
		String fifthSlot = "";
		String sixSlot = "";
		String sevenSlot = "";
		String eightSlot = "";
		String nineSlot = "";
		int turnCounter;
		int winnerChoice = 2; 
		String boardArray[][]={{"|","-","|","-","|","-","|"},
                                       {"|","1","|","2","|","3","|"},
                                       {"|","-","|","-","|","-","|"},
                                       {"|","4","|","5","|","6","|"},
                                       {"|","-","|","-","|","-","|"},
                                       {"|","7","|","8","|","9","|"},
                                       {"|","-","|","-","|","-","|"}};
		display(boardArray);
        OUTER:
        for (turnCounter = 1; turnCounter <= 9; turnCounter++) {
            switch (turnCounter) {
                case 1:
                    System.out.println();
                    System.out.println("Please Input Your First Choice");
                    firstSlot = input.next();
                    switch (firstSlot) {
                        case "1":
                            boardArray[1][1]= "X";
                            display(boardArray);
                            break;
                        case "2":
                            boardArray[1][3]= "X";
                            display(boardArray);
                            break;
                        case "3":
                            boardArray[1][5]= "X";
                            display(boardArray);
                            break;
                        case "4":
                            boardArray[3][1]= "X";
                            display(boardArray);
                            break;
                        case "5":
                            boardArray[3][3]= "X";
                            display(boardArray);
                            break;
                        case "6":
                            boardArray[3][5]= "X";
                            display(boardArray);
                            break;
                        case "7":
                            boardArray[5][1]= "X";
                            display(boardArray);
                            break;
                        case "8":
                            boardArray[5][3]= "X";
                            display(boardArray);
                            break;
                        case "9":
                            boardArray[5][5]= "X";
                            display(boardArray);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Please Input Your Seccond Choice");
                    secondSlot = input.next();
                    while (secondSlot.equals(firstSlot))
                    {
                        System.out.println(firstSlot + " Has Already Been Used. Input Different Number");
                        secondSlot = input.next();
                    }
                    switch (secondSlot) {
                        case "1":
                            boardArray[1][1]= "O";
                            display(boardArray);
                            break;
                        case "2":
                            boardArray[1][3]= "O";
                            display(boardArray);
                            break;
                        case "3":
                            boardArray[1][5]= "O";
                            display(boardArray);
                            break;
                        case "4":
                            boardArray[3][1]= "O";
                            display(boardArray);
                            break;
                        case "5":
                            boardArray[3][3]= "O";
                            display(boardArray);
                            break;
                        case "6":
                            boardArray[3][5]= "O";
                            display(boardArray);
                            break;
                        case "7":
                            boardArray[5][1]= "O";
                            display(boardArray);
                            break;
                        case "8":
                            boardArray[5][3]= "O";
                            display(boardArray);
                            break;
                        case "9":
                            boardArray[5][5]= "O";
                            display(boardArray);
                            break;
                        default:
                            break;
                    }
                            break;
                case 3:
                    System.out.println();
                    System.out.println("Please Input Your Third Choice");
                    thirdSlot = input.next();
                    while (thirdSlot.equals(firstSlot) || thirdSlot.equals(secondSlot))
                    {
                        System.out.println(thirdSlot + " Has Already Been Used. Input Different Number");
                        thirdSlot = input.next();
                    }
                    switch (thirdSlot) {
                        case "1":
                            boardArray[1][1]= "X";
                            display(boardArray);
                            break;
                        case "2":
                            boardArray[1][3]= "X";
                            display(boardArray);
                            break;
                        case "3":
                            boardArray[1][5]= "X";
                            display(boardArray);
                            break;
                        case "4":
                            boardArray[3][1]= "X";
                            display(boardArray);
                            break;
                        case "5":
                            boardArray[3][3]= "X";
                            display(boardArray);
                            break;
                        case "6":
                            boardArray[3][5]= "X";
                            display(boardArray);
                            break;
                        case "7":
                            boardArray[5][1]= "X";
                            display(boardArray);
                            break;
                        case "8":
                            boardArray[5][3]= "X";
                            display(boardArray);
                            break;
                        case "9":
                            boardArray[5][5]= "X";
                            display(boardArray);
                            break;
                        default:
                            break;
                    }
                            break;
                case 4:
                    System.out.println();
                    System.out.println("Please Input Your Fourth Choice");
                    fourthSlot = input.next();
                    while (fourthSlot.equals(firstSlot) || fourthSlot.equals(secondSlot) || fourthSlot.equals(thirdSlot))
                    {
                        System.out.println(fourthSlot + " Has Already Been Used. Input Different Number");
                        fourthSlot = input.next();
                    }
                    switch (fourthSlot) {
                        case "1":
                            boardArray[1][1]= "O";
                            display(boardArray);
                            break;
                        case "2":
                            boardArray[1][3]= "O";
                            display(boardArray);
                            break;
                        case "3":
                            boardArray[1][5]= "O";
                            display(boardArray);
                            break;
                        case "4":
                            boardArray[3][1]= "O";
                            display(boardArray);
                            break;
                        case "5":
                            boardArray[3][3]= "O";
                            display(boardArray);
                            break;
                        case "6":
                            boardArray[3][5]= "O";
                            display(boardArray);
                            break;
                        case "7":
                            boardArray[5][1]= "O";
                            display(boardArray);
                            break;
                        case "8":
                            boardArray[5][3]= "O";
                            display(boardArray);
                            break;
                        case "9":
                            boardArray[5][5]= "O";
                            display(boardArray);
                            break;
                        default:
                            break;
                    }
                            break;
                case 5:
                    System.out.println();
                    System.out.println("Please Input Your Fifth Choice");
                    fifthSlot = input.next();
                    while (fifthSlot.equals(firstSlot) || fifthSlot.equals(secondSlot) || fifthSlot.equals(thirdSlot) 
                            || fifthSlot.equals(fourthSlot))
                    {
                        System.out.println(fifthSlot + " Has Already Been Used. Input Different Number");
                        fifthSlot = input.next();
                    }
                    switch (fifthSlot) {
                        case "1":
                            boardArray[1][1]= "X";
                            display(boardArray);
                            break;
                        case "2":
                            boardArray[1][3]= "X";
                            display(boardArray);
                            break;
                        case "3":
                            boardArray[1][5]= "X";
                            display(boardArray);
                            break;
                        case "4":
                            boardArray[3][1]= "X";
                            display(boardArray);
                            break;
                        case "5":
                            boardArray[3][3]= "X";
                            display(boardArray);
                            break;
                        case "6":
                            boardArray[3][5]= "X";
                            display(boardArray);
                            break;
                        case "7":
                            boardArray[5][1]= "X";
                            display(boardArray);
                            break;
                        case "8":
                            boardArray[5][3]= "X";
                            display(boardArray);
                            break;
                        case "9":
                            boardArray[5][5]= "X";
                            display(boardArray);
                            break;
                        default:
                            break;
                    }
                            break;
                case 6:
                    if ("X".equals(boardArray [1][1]) && "X".equals(boardArray [3][1]) && "X".equals(boardArray[5][1])
                        || "X".equals(boardArray [1][1]) && "X".equals(boardArray [1][3]) && "X".equals(boardArray[1][5])
                        || "X".equals(boardArray [3][1]) && "X".equals(boardArray [3][3]) && "X".equals(boardArray[5][5])
                        || "X".equals(boardArray [1][3]) && "X".equals(boardArray [3][3]) && "X".equals(boardArray[5][3])
                        || "X".equals(boardArray [1][5]) && "X".equals(boardArray [3][5]) && "X".equals(boardArray[5][5])
                        || "X".equals(boardArray [5][1]) && "X".equals(boardArray [5][3]) && "X".equals(boardArray[5][5])
                        || "X".equals(boardArray [1][1]) && "X".equals(boardArray [3][3]) && "X".equals(boardArray[5][5])
                        || "X".equals(boardArray [1][5]) && "X".equals(boardArray [3][3]) && "X".equals(boardArray[5][1])) {
                        
                                winnerChoice = 1;
                                break OUTER;
                    }
                    System.out.println();
                    System.out.println("Please Input Your Sixth Choice");
                    sixSlot = input.next();
                    while (sixSlot.equals(firstSlot) || sixSlot.equals(secondSlot) || sixSlot.equals(thirdSlot) 
                            || sixSlot.equals(fourthSlot) || sixSlot.equals(fifthSlot))
                    {
                        System.out.println(sixSlot + " Has Already Been Used. Input Different Number");
                        sixSlot = input.next();
                    }
                    switch (sixSlot) {
                        case "1":
                            boardArray[1][1]= "O";
                            display(boardArray);
                            break;
                        case "2":
                            boardArray[1][3]= "O";
                            display(boardArray);
                            break;
                        case "O":
                            boardArray[1][5]= "O";
                            display(boardArray);
                            break;
                        case "4":
                            boardArray[3][1]= "O";
                            display(boardArray);
                            break;
                        case "5":
                            boardArray[3][3]= "O";
                            display(boardArray);
                            break;
                        case "6":
                            boardArray[3][5]= "O";
                            display(boardArray);
                            break;
                        case "7":
                            boardArray[5][1]= "O";
                            display(boardArray);
                            break;
                        case "8":
                            boardArray[5][3]= "O";
                            display(boardArray);
                            break;
                        case "9":
                            boardArray[5][5]= "O";
                            display(boardArray);
                            break;
                        default:
                            break;
                    }
                            break;
                case 7:
                    if ("O".equals(boardArray [1][1]) && "O".equals(boardArray [3][3]) && "O".equals(boardArray[5][5])
                        || "O".equals(boardArray [1][1]) && "O".equals(boardArray [1][3]) && "O".equals(boardArray[1][5])
                        || "O".equals(boardArray [1][1]) && "O".equals(boardArray [3][1]) && "O".equals(boardArray[5][1])
                        || "O".equals(boardArray [3][1]) && "O".equals(boardArray [3][3]) && "O".equals(boardArray[5][5])
                        || "O".equals(boardArray [1][3]) && "O".equals(boardArray [3][3]) && "O".equals(boardArray[5][3])
                        || "O".equals(boardArray [1][5]) && "O".equals(boardArray [3][5]) && "O".equals(boardArray[5][5])
                        || "O".equals(boardArray [5][1]) && "O".equals(boardArray [5][3]) && "O".equals(boardArray[5][5])
                        || "O".equals(boardArray [1][5]) && "O".equals(boardArray [3][3]) && "O".equals(boardArray[5][1])) {
                        
                            winnerChoice = 0;
                            break OUTER;
                    }
                    System.out.println();
                    System.out.println("Please Input Your Seventh Choice");
                    sevenSlot = input.next();
                    while (sevenSlot.equals(firstSlot) || sevenSlot.equals(secondSlot) || sevenSlot.equals(thirdSlot) 
                            || sevenSlot.equals(fourthSlot) || sevenSlot.equals(fifthSlot) || sevenSlot.equals(sixSlot))
                    {
                        System.out.println(sevenSlot + " Has Already Been Used. Input Different Number");
                        sevenSlot = input.next();
                    }
                    switch (sevenSlot) {
                        case "1":
                            boardArray[1][1]= "X";
                            display(boardArray);
                            break;
                        case "2":
                            boardArray[1][3]= "X";
                            display(boardArray);
                            break;
                        case "3":
                            boardArray[1][5]= "X";
                            display(boardArray);
                            break;
                        case "4":
                            boardArray[3][1]= "X";
                            display(boardArray);
                            break;
                        case "5":
                            boardArray[3][3]= "X";
                            display(boardArray);
                            break;
                        case "6":
                            boardArray[3][5]= "X";
                            display(boardArray);
                            break;
                        case "7":
                            boardArray[5][1]= "X";
                            display(boardArray);
                            break;
                        case "8":
                            boardArray[5][3]= "X";
                            display(boardArray);
                            break;
                        case "9":
                            boardArray[5][5]= "X";
                            display(boardArray);
                            break;
                        default:
                            break;
                    }
                            break;
                case 8:
                    if ("X".equals(boardArray [1][1]) && "X".equals(boardArray [3][1]) && "X".equals(boardArray[5][1])
                        || "X".equals(boardArray [1][1]) && "X".equals(boardArray [5][3]) && "X".equals(boardArray[1][5])
                        || "X".equals(boardArray [3][1]) && "X".equals(boardArray [3][3]) && "X".equals(boardArray[5][5])
                        || "X".equals(boardArray [1][3]) && "X".equals(boardArray [3][3]) && "X".equals(boardArray[5][3])
                        || "X".equals(boardArray [1][5]) && "X".equals(boardArray [3][5]) && "X".equals(boardArray[5][5])
                        || "X".equals(boardArray [5][1]) && "X".equals(boardArray [5][3]) && "X".equals(boardArray[5][5])
                        || "X".equals(boardArray [1][1]) && "X".equals(boardArray [3][3]) && "X".equals(boardArray[5][5])
                        || "X".equals(boardArray [1][5]) && "X".equals(boardArray [3][3]) && "X".equals(boardArray[5][1])) {

                            winnerChoice = 1;
                            break OUTER;
                    }
                    System.out.println();
                    System.out.println("Please Input Your Eighth Choice");
                    eightSlot = input.next();
                    while (eightSlot.equals(firstSlot) || eightSlot.equals(secondSlot) || eightSlot.equals(thirdSlot) 
                            || eightSlot.equals(fourthSlot) || eightSlot.equals(fifthSlot) || eightSlot.equals(sixSlot)
                            || eightSlot.equals(sevenSlot));
                    {
                        System.out.println(eightSlot + " Has Already Been Used. Input Different Number");
                        eightSlot = input.next();
                    }
                    switch (eightSlot) {
                        case "1":
                            boardArray[1][1]= "O";
                            display(boardArray);
                            break;
                        case "2":
                            boardArray[1][3]= "O";
                            display(boardArray);
                            break;
                        case "3":
                            boardArray[1][5]= "O";
                            display(boardArray);
                            break;
                        case "4":
                            boardArray[3][1]= "O";
                            display(boardArray);
                            break;
                        case "5":
                            boardArray[3][3]= "O";
                            display(boardArray);
                            break;
                        case "6":
                            boardArray[3][5]= "O";
                            display(boardArray);
                            break;
                        case "7":
                            boardArray[5][1]= "O";
                            display(boardArray);
                            break;
                        case "8":
                            boardArray[5][3]= "O";
                            display(boardArray);
                            break;
                        case "9":
                            boardArray[5][5]= "O";
                            display(boardArray);
                            break;
                        default:
                            break;
                    }
                            break;
                case 9:
                    if ("O".equals(boardArray [1][1]) && "O".equals(boardArray [3][1]) && "O".equals(boardArray[5][1])
                        || "O".equals(boardArray [1][1]) && "O".equals(boardArray [1][3]) && "O".equals(boardArray[1][5])
                        || "O".equals(boardArray [3][1]) && "O".equals(boardArray [3][3]) && "O".equals(boardArray[5][5])
                        || "O".equals(boardArray [1][3]) && "O".equals(boardArray [3][3]) && "O".equals(boardArray[5][3])
                        || "O".equals(boardArray [1][5]) && "O".equals(boardArray [3][5]) && "O".equals(boardArray[5][5])
                        || "O".equals(boardArray [5][1]) && "O".equals(boardArray [5][3]) && "O".equals(boardArray[5][5])
                        || "O".equals(boardArray [1][1]) && "O".equals(boardArray [3][3]) && "O".equals(boardArray[5][5])
                        || "O".equals(boardArray [1][5]) && "O".equals(boardArray [3][3]) && "O".equals(boardArray[5][1])) {
                        
                                winnerChoice = 0;
                                break OUTER;
                    }
                    System.out.println();
                    System.out.println("Please Input Your Nineth Choice");
                    nineSlot = input.next();
                    while (nineSlot.equals(firstSlot) || nineSlot.equals(secondSlot) || nineSlot.equals(thirdSlot) 
                            || nineSlot.equals(fourthSlot) || nineSlot.equals(fifthSlot) || nineSlot.equals(sixSlot)
                            || nineSlot.equals(sevenSlot) || nineSlot.equals(eightSlot));
                    {
                        System.out.println(nineSlot + " Has Already Been Used. Input Different Number");
                        nineSlot = input.next();
                    }
                    switch (nineSlot) {
                        case "1":
                            boardArray[1][1]= "X";
                            display(boardArray);
                            break;
                        case "2":
                            boardArray[1][3]= "X";
                            display(boardArray);
                            break;
                        case "3":
                            boardArray[1][5]= "X";
                            display(boardArray);
                            break;
                        case "4":
                            boardArray[3][1]= "X";
                            display(boardArray);
                            break;
                        case "5":
                            boardArray[3][3]= "X";
                            display(boardArray);
                            break;
                        case "6":
                            boardArray[3][5]= "X";
                            display(boardArray);
                            break;
                        case "7":
                            boardArray[5][1]= "X";
                            display(boardArray);
                            break;
                        case "8":
                            boardArray[5][3]= "X";
                            display(boardArray);
                            break;
                        case "9":
                            boardArray[5][5]= "X";
                            display(boardArray);
                            break;
                        default:
                            break;
                    }
                    if ("X".equals(boardArray [1][3]) && "X".equals(boardArray [3][3]) && "X".equals(boardArray[5][3])
                            || "X".equals(boardArray [3][1]) && "X".equals(boardArray [3][3]) && "X".equals(boardArray[5][5])
                            || "X".equals(boardArray [1][1]) && "X".equals(boardArray [1][3]) && "X".equals(boardArray[1][5])
                            || "X".equals(boardArray [1][1]) && "X".equals(boardArray [3][1]) && "X".equals(boardArray[5][1])
                            || "X".equals(boardArray [1][5]) && "X".equals(boardArray [3][5]) && "X".equals(boardArray[5][5])
                            || "X".equals(boardArray [5][1]) && "X".equals(boardArray [5][3]) && "X".equals(boardArray[5][5])
                            || "X".equals(boardArray [1][1]) && "X".equals(boardArray [3][3]) && "X".equals(boardArray[5][5])
                            || "X".equals(boardArray [1][5]) && "X".equals(boardArray [3][3]) && "X".equals(boardArray[5][1]))
                    {
                        winnerChoice = 1;
                    }
                    break;
                default:
                    break;
            }
        }
		
        switch (winnerChoice) {
            case 0:
                System.out.println("O's Win");
                break;
            case 1:
                System.out.println("X's Win");
                break;
            case 2:
                System.out.println("Game Ends in Draw");
                break;
            default:
                break;
        }
	}	

	public static void display(String x [][])
	{
        for (String[] x1 : x) {
            for (String x11 : x1) {
                System.out.print(x11);
            }
            System.out.println();
        }
	}
}