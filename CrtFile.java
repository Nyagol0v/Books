import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class CrtFile {
  File_menu od = new File_menu();

  public void CreateFile() {
  System.out.println("Enter file name");
  Scanner input = new Scanner(System.in);
  String flName = input.nextLine();
    try {
      File file = new File("C:\\Java PROJECTS\\file handling\\file handling\\"+flName+".txt");
      if (file.createNewFile()) {
        System.out.println("File created: " + file.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      //DA SE NAPRAWI DA WRUSHTA W MENU
    }
    od.main(null);
    //?? MAGICHESKI RABOTI I VRUSHTA KUM MENU-TO 
  }
}


