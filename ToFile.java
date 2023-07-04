import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ToFile {
    public void writeToFile(Toy toy) throws IOException {
        FileWriter writer = new FileWriter("list.txt", true);

        writer.write(toy.toString());
        writer.write("\n");
        writer.flush();

    }

    public void reWrite(ArrayList<Toy> toys) throws IOException {
        FileWriter fileWriter = new FileWriter("list.txt");
        for(int i =0; i<toys.size();i++){
            String str = toys.get(i).toString();
            fileWriter.write(str + "\n");
        }
        fileWriter.close();
    }

}