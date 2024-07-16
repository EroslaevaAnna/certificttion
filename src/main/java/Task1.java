import java.util.Scanner;
public class Task1 {    private static final int letterCount =15;
    private static final int spaceCount =3;    private static final int letter3 =62;
    private static final int space = 12;
    public static void main(String[] args) {        Scanner myScanner = new Scanner(System.in);
        int fenceLength;        System.out.print("Введите длинну забора ");
        fenceLength = Integer.parseInt(myScanner.nextLine());
        int stringLength = letter3 * (letterCount / 3) + spaceCount * space;        if (fenceLength < stringLength)
            System.out.println("Надпись не поместится!");        else
            System.out.println("Надпись поместится! Можно признаться в любви!");
    }
}
