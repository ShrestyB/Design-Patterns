package structural.adapter;

public class MediaAdapter implements MediaPlayer {
    private static final String TYPE_VLC = "vlc";
    private static final String TYPE_MP4 = "mp4";

    private AdvancedMediaPlayer advancedPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase(TYPE_VLC)) {
            advancedPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase(TYPE_MP4)) {
            advancedPlayer = new Mp4Player();
        } else {
            advancedPlayer = null;
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (advancedPlayer == null) {
            System.out.println("Invalid media type: " + audioType + " format not supported");
            return;
        }
        if (audioType.equalsIgnoreCase(TYPE_VLC)) {
            advancedPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase(TYPE_MP4)) {
            advancedPlayer.playMp4(fileName);
        }
    }
}
