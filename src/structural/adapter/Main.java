package structural.adapter;

public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play(MediaType.MP3.getValue(), "song.mp3");
        player.play(MediaType.MP4.getValue(), "video.mp4");
        player.play(MediaType.VLC.getValue(), "movie.vlc");
        player.play("avi", "clip.avi"); // This will throw exception
    }
}
