import java.util.Random;
import java.util.Scanner;

public class RockPapersScissors {
    public static void main(String[] args) {
        String[] rps = {"К", "Н", "Б"};
        String computerMove;
        computerMove = rps[new Random().nextInt(rps.length)];
        Scanner myScanner = new Scanner(System.in);
        String playerMove;
        for (int round = 1; round <= 5; round++) {
            System.out.println("\nРаунд " + round + ": Твой ход: Выбери (К), (Н) или (Б)");
            do {
                playerMove = myScanner.nextLine();
                if (!playerMove.equals("К") && !playerMove.equals("Н") && !playerMove.equals("Б")) {
                    System.out.println(playerMove + "  - не верный выбор");
                }
            }
            while (!playerMove.equals("К") && !playerMove.equals("Н") && !playerMove.equals("Б"));
            System.out.println(playerMove + "  - Твой выбор");
            System.out.println("Выброр компьютера - " + computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("Ничья!");
            } else if (playerMove.equals("К")) {
                if (computerMove.equals("Н")) {
                    System.out.println("Победа!");
                } else if (computerMove.equals("Б")) {
                    System.out.println("Проигрыш!");
                }
            } else if (playerMove.equals("Н")) {
                if (computerMove.equals("Б")) {
                    System.out.println("Победа!");
                } else if (computerMove.equals("К")) {
                    System.out.println("Победа!");
                }
            } else {
                if (computerMove.equals("К")) {
                    System.out.println("Победа!");
                } else if (computerMove.equals("Н")) {
                    System.out.println("Проигрыш!");
                }
            }
        }
    }
}