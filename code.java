import java.util.Scanner;

public class Song {
    public static void main(String args[]) {
      Song song = new Song();
      song.getInput();
    }
  
    public void getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Initial Capacity : ");
        int n = input.nextInt();
        System.out.println("Only "+n+" song/s can be fetched");
        System.out.println("Enter Number of Songs : ");
        int m = input.nextInt();
        returnPlaylist(n,m);
    }
  
    public void returnPlaylist(int a, int b) {
        if(a>=b) {
            String[] songArray = new String[b];
            for (int i=0; i<b; i++) {
                System.out.println("Enter Song No "+(i+1));
                Scanner input = new Scanner(System.in);
                String songName = input.nextLine();
            }
        }
    }
  
}
