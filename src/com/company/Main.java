package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int timesGuessed = 0;
        int totalCoins = 0;
        int treasureAmount = random.nextInt(15);
        treasureAmount += 5;

        String[][] board = new String[10][8];
        int[][] treasureBoard = new int[10][8];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "[  ]";
                System.out.print(board[i][j]);
            }

            System.out.println("");
        }

        for (int i = 0; i < treasureAmount; i++) {
            int treasureX = getX(8);
            int treasureY = getY(10);
            int treasureCoins = randCoins();
            treasureBoard[treasureY][treasureX] = treasureCoins;
        }
    }
    public static int getX(int x) {
        Random random = new Random();
        int xNum = random.nextInt(x);
        return xNum;
    }
    public static int getY(int y) {
        Random random = new Random();
        int yNum = random.nextInt(y);
        return yNum;
    }
    public static int randCoins() {
        Random random = new Random();
        int coinNum = random.nextInt(500);
        return coinNum;
    }
}



