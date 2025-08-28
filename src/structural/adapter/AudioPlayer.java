package structural.adapter;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        MediaType type = MediaType.fromString(audioType);
        
        switch (type) {
            case MP3:
                System.out.println("Playing MP3 file: " + fileName);
                break;
            case VLC:
            case MP4:
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
                break;
            default:
                System.out.println("Invalid media type: " + audioType + " format not supported");
        }
    }
}
