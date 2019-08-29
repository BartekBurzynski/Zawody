import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        List<Result> results = new ArrayList<>();
        Adding.add(results);
        Collections.sort(results);
        System.out.println(results);

        File file = new File("stats.csv");
        PrintWriter writer = new PrintWriter(file);

        for (int i = 0; i < results.size(); i++) {
            writer.print(results.get(i).getName() + ";");
            writer.println(results.get(i).getPoints());

        }
        writer.close();
    }


}
