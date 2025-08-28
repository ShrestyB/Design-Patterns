package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        // Create playlist
        Playlist playlist = new MusicPlaylist();
        
        // Add songs
        playlist.addSong(new Song("Tum Hi Ho", "Arijit Singh"));
        playlist.addSong(new Song("Chaiyya Chaiyya", "A.R. Rahman"));
        playlist.addSong(new Song("Blue Eyes", "Honey Singh"));
        
        // Create iterator and play songs
        Iterator iterator = playlist.createIterator();
        
        System.out.println("Music Playlist\n");
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Now playing: " + song);
        }
    }
} 