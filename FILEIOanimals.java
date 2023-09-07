import java.io.*;

public class FILEIOanimals {
    public static void main(String[] args) {

        String file = "C:\\Users\\BE218\\IdeaProjects\\Java CSV Files\\arrivingAnimals.txt";
        String pathOutput = "C:\\Users\\BE218\\IdeaProjects\\Java CSV Files\\myNewFile";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));

            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                for (String index : row) {
                    System.out.println(index);
                }
            }

            // Now, write to the new file
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathOutput));
            writer.write("This is a line of animals...");
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}