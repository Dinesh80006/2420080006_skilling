import java.util.Scanner;
public class ControlStructureExample4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("While loop: Counting down from 5");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();
    }
}
