import java.util.List;
import java.util.Scanner;

public class Adding {
   public static void add(List list) {
        Scanner scanner = new Scanner(System.in);
        String x = null;
        System.out.println("Podaj wynik (lub stop):");
        x = scanner.nextLine();
        while (!x.equals("STOP")) {
            list.add(new Result(x, scanner.nextInt()));
            System.out.println("Podaj wynik kolejnego gracza (lub stop):");
            x = scanner.nextLine();
            x = scanner.nextLine();
        }
    }
}
