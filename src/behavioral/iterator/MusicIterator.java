package behavioral.iterator;

import java.util.List;

public class MusicIterator implements Iterator {
    private List<Song> songs;
    private int position = 0;
    
    public MusicIterator(List<Song> songs) {
        this.songs = songs;
    }
    
    @Override
    public boolean hasNext() {
        return position < songs.size();
    }
    
    @Override
    public Song next() {
        if (hasNext()) {
            return songs.get(position++);
        }
        return null;
    }
} 