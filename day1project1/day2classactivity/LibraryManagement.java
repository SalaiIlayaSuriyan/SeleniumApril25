package day2classactivity;
class Library {
 public String addBook(String bookTitle) {
     System.out.println("Book added successfully");
     return bookTitle;
 }

 public void issueBook() {
     System.out.println("Book issued successfully");
 }
}

public class LibraryManagement {
 public static void main(String[] args) {
     
     Library library = new Library();
  
     String addedBook = library.addBook("Harry Potter");
     System.out.println("Added Book Title: " + addedBook);
   
     library.issueBook();

     Library anotherLibrary = new Library();
     anotherLibrary.addBook("ABC");
     anotherLibrary.issueBook();
 }
}
