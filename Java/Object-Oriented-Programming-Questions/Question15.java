/*15. Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.
 */

import java.util.ArrayList;
import java.util.Random;

class MusicLibrary {

    public static ArrayList<Songs> songs  = new ArrayList<>();
    public void addSong(Songs song){
        songs.add(song);
    }
    public void removeSong(Songs song){ songs.remove(song);}
    public int getNumberOfSongs() {
        return songs.size();
    }


    public void playRandomSong() {
        int size = songs.size();
        if (size == 0) {
            System.out.println("No songs in the library.");
            return;
        }
        Random rand = new Random();
        int index = rand.nextInt(size);
        System.out.println("Now playing: " + songs.get(index).getSongName() + " by " + songs.get(index).getSingerName());
    }
}
class Songs{
    private String songName ;
    private String singerName;
    private String songDuration;
    private int songYear;
    Songs(String songName, String singerName, String songDuration, int songYear ){
        this.songName = songName;
        this.singerName = singerName;
        this.songDuration = songDuration;
        this.songYear = songYear;
    }

    public int getSongYear() {
        return songYear;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getSongDuration() {
        return songDuration;
    }

    public String getSongName() {
        return songName;
    }

    public String getSongInformation(){
        return "Song name: " + this.songName + "\n" +
                "Singer: " + this.singerName + "\n" +
                "Duration: " + this.songDuration + "\n" +
                "Year: " + this.songYear + "\n";
    }
}

public class Question15 {
    public static void main(String[] args) {
        MusicLibrary m = new MusicLibrary();
        Songs song1 = new Songs("Unstoppable","Sia","3:47",2017);
        Songs song2 = new Songs("Beautiful","Anne Marie","3:15",2023);
        Songs song3 = new Songs("Clendestina","Emma Peters","2:57",2016);

        m.addSong(song1);
        m.addSong(song2);
        m.addSong(song3);

        System.out.println();

        System.out.println("The total number of songs are: " + m.getNumberOfSongs());
        for(Songs song: MusicLibrary.songs){
            System.out.println(song.getSongInformation());
        }

        System.out.println("Playing random song");
        m.playRandomSong();
        System.out.println();
        m.removeSong(song1);


        for(Songs song: MusicLibrary.songs){
            System.out.println(song.getSongInformation());
        }

    }
}
