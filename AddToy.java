import java.io.IOException;
import java.util.Scanner;

public class AddToy {
     public void AddToy(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите id игрушки: ");
                    int id = scanner.nextInt();
                    System.out.printf("Введите имя игрушки: ");
                    String name = scanner.next();
                    System.out.printf("Введите вес: ");
                    int weight = scanner.nextInt();
                    System.out.printf("Введите количество: ");
                    int quan = scanner.nextInt();
                    Toy toy = new Toy(id, name, weight, quan);
                    ToFile toFile = new ToFile();
                    try {
                        toFile.writeToFile(toy);
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                    System.out.println("Игрушка добавлена \n" + toy);
        
    }
}
