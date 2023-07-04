import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;


public class Lottery {
    ArrayList<Toy> toys = new ArrayList();

    public ArrayList readLines() {
        try {
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("list.txt")));
            for (String line : lines) {
                String name = line.substring(line.indexOf("Название игрушки:") + 18, line.indexOf(";"));
                int id = Integer.parseInt(line.substring(line.indexOf("ID игрушки:") + 12, line.indexOf("; вес")));
                int weight = Integer.parseInt(line.substring(line.indexOf("вес игрушки:") + 13, line.indexOf("; кол")));
                int quan = Integer.parseInt(line.substring(line.indexOf("количество:") + 12));
                Toy toy = new Toy(id, name, weight, quan);
                toys.add(toy);
            }
        } catch (IOException e) {
            // Handle a potential exception
        }
        return toys;
    }

    public void printArr() {
        for (Toy toy :
                toys) {
            System.out.println(toy);
        }
    }
    public  ArrayList<Toy> clearArr(){
        toys.clear();
        return toys;
    }

    public Toy winner(ArrayList<Toy> toys) throws IOException {
        Random random = new Random();
        ArrayList<Toy> lotArr = new ArrayList<>();
        for (Toy toy :
                toys) {
            for(int i =0; i<toy.getQuan(); i++){
                lotArr.add(toy);
            }
        }

        int index = random.nextInt(lotArr.size());
        for (int i =0; i<toys.size(); i++){
            if(lotArr.get(index).equals(toys.get(i))){
                int quan_temp = toys.get(i).getQuan() - 1;
                toys.get(i).setQuan(quan_temp);
                if (toys.get(i).getQuan() == 0) {
                    toys.remove(i);
                    ToFile toFile = new ToFile();
                    toFile.reWrite(toys);
                } else {
                    ToFile toFile = new ToFile();
                    toFile.reWrite(toys);

                }
            }
        }

        System.out.println("Вы выиграли игрушку: " + lotArr.get(index).getName());

        return lotArr.get(index);
    }
}
