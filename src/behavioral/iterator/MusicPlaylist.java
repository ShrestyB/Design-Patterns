package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class MusicPlaylist implements Playlist {
    private List<Song> songs = new ArrayList<>();
    
    @Override
    public Iterator createIterator() {
        return new MusicIterator(songs);
    }
    
    @Override
    public void addSong(Song song) {
        songs.add(song);
    }
} 