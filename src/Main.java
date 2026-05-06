import Menu.Menu;
import Services.LibraryServices;
import Utils.MenuMessages;

import java.util.Scanner;


public class Main {
    static Menu menu = new Menu();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LibraryServices libraryServices = new LibraryServices();

        Boolean mainMenuContinue = true;
        while (mainMenuContinue) {
            menu.displayMenu();
            Integer option = scanner.nextInt();

            switch (option){
                case 1 -> {
                    Boolean libraryMenuContinue = true;
                    while (libraryMenuContinue) {
                        System.out.println("******** Library Menu ********");
                        System.out.println(MenuMessages.LIBRARY_MENU_MASSAGE);
                        Integer libraryOption = scanner.nextInt();
                        libraryMenuContinue = libraryServices.handleLibraryMenu(libraryOption);
                    }
                }
            }
        }
    }

}