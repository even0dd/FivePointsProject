import models.ModelAsus;
import models.ModelDell;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        search();
    }
    public static void search(){
        System.out.println("Enter the product you are interested in: ");
        String searching = scanner.nextLine();
        if(searching.equals("ASUS")) {
            System.out.println("Name of product: " + ModelAsus.ASUS);

        }else if(searching.equals("DELL")){
            System.out.println("Name of product: " + ModelDell.DELL);

        }else{
            System.out.println("I'm sorry, but there is no product called "+searching);
            search();

        }

    }

}
