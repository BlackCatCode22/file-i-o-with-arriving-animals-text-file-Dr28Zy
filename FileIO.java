
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FileIO {
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\BE218\\IdeaProjects\\untitled\\output.txt"));
            writer.write("Writing to a file.");
            writer.write("\nHere is another line.");
            writer.write("\nHere is a list of arriving animals.");
            writer.write("""

                    4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia

                    12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia

                    4 year old male hyena, born in spring, black color, 120 pounds, from Friguia Park, Tunisia

                    8 year old female hyena, unknown birth season, black and tan striped color, 105 pounds, from Friguia Park, Tunisia

                    6 year old female lion, born in spring, tan color, 300 pounds, from Zanzibar, Tanzania

                    12 year old female lion, born in winter, dark tan color, 375 pounds, from KopeLion, Tanzania

                    22 year old male lion, born in fall, golden color, 450 pounds, from Zanzibar, Tanzania

                    4 year old female lion, born in spring, tan and brown color, 275 pounds, from KopeLion, Tanzania

                    2 year old male tiger, born in spring, gold and tan stripes color, 270 pounds, from Dhaka, Bangladesh

                    4 year old female tiger, born in spring, black stripes color, 400 pounds, from Dhaka, Bangladesh

                    18 year old male tiger, born in fall, gold and tan color, 300 pounds, from Bardia, Nepal

                    3 year old female tiger, born in spring, black stripes color, 285 pounds, from Bardia, Nepal

                    7 year old male bear, born in spring, brown color, 320 pounds, from Alaska Zoo, Alaska

                    25 year old female bear, born in spring, black color, 425 pounds, from Woodland park Zoo, Washington\s

                    4 year old female bear, born in fall, black color, 355 pounds, from Woodland park Zoo, Washington\s

                    4 year old male bear, born in spring, brown color, 405 pounds, from Alaska Zoo, Alaska""");

            writer.close();

            System.out.println("\n I wrote to my file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
