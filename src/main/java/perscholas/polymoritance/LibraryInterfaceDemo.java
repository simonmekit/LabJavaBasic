package perscholas.polymoritance;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        LibraryUser kidUser = new KidUser();
        kidUser.registerAccount(10);
        kidUser.registerAccount(18);
        kidUser.requestBook("Kids");
        kidUser.requestBook("Fiction");

        LibraryUser adultUser = new AdultUser();
        adultUser.registerAccount(5);
        adultUser.registerAccount(23);
        adultUser.requestBook("Kids");
        adultUser.requestBook("Fiction");
    }
}
