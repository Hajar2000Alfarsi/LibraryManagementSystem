package Services;

import Entites.Library;

public class LibraryServices {


    public static Library libraryName() {
        Library library = new Library();

        library.setLibraryName("Evergreen Knowledge Library");
        System.out.println("Library Name:" + library.getLibraryName());

        return library;
    }

    public static Library aboutLibrary() {
        Library library = new Library();

        library.setAboutLibrary("\n" +
                "Evergreen Knowledge Library is a modern public library dedicated to promoting" +
                " lifelong learning and community engagement. It offers a wide collection of books," +
                " including fiction, non-fiction, academic resources, and digital materials. The library" +
                " also provides quiet study areas, computer labs, and free Wi-Fi access for visitors.");
        System.out.println("About Library:" + library.getAboutLibrary());

        return library;
    }

    public static Library libraryAddress() {
        Library library = new Library();

        library.setAddress("Al Khoudh, Muscat, Oman");
        System.out.println("Library Loaction:" + library.getAddress());
        return library;
    }

    public Boolean handleLibraryMenu(Integer libraryOption) {


        switch (libraryOption) {
            case 1 -> {
                libraryName();
            }
            case 2 -> {
                aboutLibrary();
            }
            case 3 -> {
                libraryAddress();
            }
            case 6 -> {
                return false;
            }
        }
        return true;
    }
}
