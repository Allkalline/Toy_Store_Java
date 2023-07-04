import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Lottery lottery = new Lottery();
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        while (a) {
            System.out.println();
            System.out.println("1 - Добавить игрушку в каталог \n2 - Показать все игрушки \n3 - Устроить розыгрыш игрушек \n4 - Выход");

            String n = scanner.nextLine();
            switch (n) {
                case "1":
                    AddToy addToy = new AddToy();
                    addToy.AddToy();
                    break;
                case "2":
                    lottery.readLines();
                    lottery.printArr();
                    lottery.clearArr();
                    break;
                case "3":
                    lottery.readLines();
                    lottery.winner(lottery.toys);
                    lottery.clearArr();
                    break;
                case "4":
                    System.out.println("Досвидания!");
                    a = false;
                    break;

            }

        }
    }
}