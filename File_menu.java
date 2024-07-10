import java.util.Scanner;

public class File_menu {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);


System.out.println("Enter 1 to create file and 2 for file moding ");
System.out.println("Enter choise");

int enteredChoise=input.nextInt();

CrtFile ob = new CrtFile();
// ime na java Class/File 
        switch(enteredChoise){
            case 1:
            System.out.println("Create file");
            ob.CreateFile();
            //Prepradka kum java Metod()
            break;
          case 2:
            System.out.println("File moding");
            break;
            default:
            System.out.println("Invalid choise");
        }
  }
}
