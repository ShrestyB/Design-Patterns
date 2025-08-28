package structural.adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedPlayer;

    public MediaAdapter(String audioType) {
        MediaType type = MediaType.fromString(audioType);
        switch (type) {
            case VLC:
                advancedPlayer = new VlcPlayer();
                break;
            case MP4:
                advancedPlayer = new Mp4Player();
                break;
            default:
                advancedPlayer = null;
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (advancedPlayer == null) {
            System.out.println("Invalid media type: " + audioType + " format not supported");
            return;
        }
        
        MediaType type = MediaType.fromString(audioType);
        switch (type) {
            case VLC:
                advancedPlayer.playVlc(fileName);
                break;
            case MP4:
                advancedPlayer.playMp4(fileName);
                break;
            case MP3:
                // MP3 is handled directly by AudioPlayer, not through adapter
                break;
        }
    }
}
