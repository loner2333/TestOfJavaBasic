package com.outlook.heziyan418;

import java.util.Scanner;

/**
 * 4.34
 */
public class RoShamBo {

    public void roShamBo() {
        int win = 0;
        int lose = 0;
        while (win < 2 && lose < 2) {
            System.out.println("scissors(0), rock(1), paper(2)");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            int computer = getComputerResult();
            Result result = getResult(input, computer);
            System.out.println("The computer is " + computer + ", you are " + input +
                ", " + result.name);
            if (result == Result.win) {
                win++;
            } else if (result == Result.lose) {
                lose++;
            }
        }
    }

    private Result getResult(int input, int computer) {
        if (input == computer) {
            return Result.draw;
        }
        if (input == 0 && computer == 2) {
            return Result.win;
        }
        if (input > computer) {
            return Result.win;
        } else {
            return Result.lose;
        }
    }

    private int getComputerResult() {
        int result = (int) Math.floor(Math.random() * 3);
        while (result == 3) {
            result = (int) Math.floor(Math.random() * 3);
        }
        return result;
    }

    private enum Result {
        win(0, "win"),
        lose(1, "lose"),
        draw(2, "draw");

        int value;
        String name;
        Result(int value, String name) {
            this.value = value;
            this.name = name;
        }
    }
}
