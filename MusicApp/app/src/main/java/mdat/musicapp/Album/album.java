package mdat.musicapp.Album;

public class album {
    private int id;
    private String content;

    public album(int id, String title) {
        this.id = id;
        this.content = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
