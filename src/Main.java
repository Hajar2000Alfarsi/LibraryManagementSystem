import Menu.Menu;

import java.util.Scanner;

public class Main {
    static Menu menu = new Menu();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Boolean mainMenuContinue = true;
        while (mainMenuContinue) {
            menu.displayMenu();
            Integer option = scanner.nextInt();

            switch (option){

            }
        }
    }

}