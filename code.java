import java.util.Scanner;

Class Music {
  public static void main (String args[]) {
    
  }
  
  public void sorted() {
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Select the Song");
    String songName = input.nextLine();  // Read user input
    System.out.println("User selected the Song : " + songName);
  }
}
