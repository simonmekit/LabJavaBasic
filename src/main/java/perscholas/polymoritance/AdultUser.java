package perscholas.polymoritance;

public class AdultUser implements LibraryUser{

    int age;
    String bookType;

    @Override
    public void registerAccount(int age) {
        this.age = age;
        if(this.age >=12)
            System.out.println("You have successfully registered under an Adult Account.");
        else
            System.out.println("You have successfully registered under an Adult Account.");
    }
    @Override
    public void requestBook(String bookType) {
    this.bookType = bookType;
    if(this.bookType == "Fiction")
        System.out.println("Book Issued successfully, please return the book within 7 days.");
    else
        System.out.println("Oops, you are allowed to take only adult Fiction books.");
    }
}
