package Entites;

import Behaviours.LibraryInterface;

public class Library implements LibraryInterface {
    private String libraryName;
    private String aboutLibrary;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAboutLibrary() {
        return aboutLibrary;
    }

    public void setAboutLibrary(String aboutLibrary) {
        this.aboutLibrary = aboutLibrary;
    }


    @Override
    public Library libraryInit() {
        return null;
    }
}
