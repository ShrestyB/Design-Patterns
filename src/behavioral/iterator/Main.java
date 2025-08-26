package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        // Create playlist
        Playlist playlist = new MusicPlaylist();
        
        // Add songs
        playlist.addSong(new Song("Bohemian Rhapsody", "Queen"));
        playlist.addSong(new Song("Hotel California", "Eagles"));
        playlist.addSong(new Song("Stairway to Heaven", "Led Zeppelin"));
        
        // Create iterator and play songs
        Iterator iterator = playlist.createIterator();
        
        System.out.println("Music Playlist\n");
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Now playing: " + song);
        }
    }
} 