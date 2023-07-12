import java.util.Scanner;

public class Song {
    public static void main(String args[]) {
        Song song = new Song();
        song.getInput();
    }
  
    public void getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Initial Capacity : ");
        int cap = input.nextInt();
        System.out.println("Remember!! Not more than "+cap+" song/s can be fetched at a time in your Playlist");
        System.out.println("Enter Number of Songs : ");
        int songCount = input.nextInt();
        if (cap>=songCount) {
            returnPlaylistWithSufficientCapacity(songCount);
        }
        else {
            returnPlaylistWithInsufficientCapacity(songCount, cap);
        }
    }
  
    public void returnPlaylistWithSufficientCapacity(int a) {
        System.out.println("DONT WORRY! YOUR SONGS COUNT IS WELL UNDER THE INITIAL CAPACITY");
        String[] playListArray = createPlaylist(a);
        System.out.println("CURRENT PLAYLIST : "+ java.util.Arrays.toString(playListArray));
        System.out.println("HAVE A GOOD TIME ENJOYING THE SONGS BUDDY "+"\uD83D\uDE00"+" BYE!!");
    }
    
    public void returnPlaylistWithInsufficientCapacity(int a, int b) {
        System.out.println("OOPS! YOUR SONGS COUNT IS EXCEEDING THE INITIAL CAPACITY.");
        String[] playListArray = createPlaylist(b);
        System.out.println("CURRENT PLAYLIST : "+ java.util.Arrays.toString(playListArray));
        for (int i=b;i<a;i++) {
            System.out.println("Enter Song No "+(i+1));
            Scanner input = new Scanner(System.in);
            String newSongName = input.nextLine();
            for (int j=0; j<(b-1); j++) {
                playListArray[j] = playListArray[(j+1)];
            }
            playListArray[b-1] = newSongName;
            System.out.println("CURRENT PLAYLIST : "+ java.util.Arrays.toString(playListArray));
        }
        System.out.println("HAVE A GOOD TIME ENJOYING THE SONGS BUDDY "+"\uD83D\uDE00"+" BYE!!");
    }
    
    public String[] createPlaylist(int x) {
        String[] songArray = new String[x];
        for (int i=0; i<x; i++) {
            System.out.println("Enter Song No "+(i+1));
            Scanner input = new Scanner(System.in);
            String songName = input.nextLine();
            songArray[i] = songName;
        }
        return songArray;
    }

}
