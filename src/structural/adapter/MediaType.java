package structural.adapter;

public enum MediaType {
    MP3("mp3"),
    MP4("mp4"),
    VLC("vlc");
    
    private final String value;
    
    MediaType(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
    public static MediaType fromString(String text) {
        for (MediaType type : MediaType.values()) {
            if (type.value.equalsIgnoreCase(text)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown media type: " + text);
    }
} 