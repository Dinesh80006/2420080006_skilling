import java.util.Scanner;
public class ControlStructureExample5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do-while loop: Counting up from 1 to 5");
        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= 5);
        System.out.println();
        scanner.close();
    }
}

