package thrillio.entities;
public class Bookmark {
    private long id;
    private String title;
    private String profileUrl;

    public Bookmark(long id, String title, String profileUrl) {
        this.id = id;
        this.title = title;
        this.profileUrl = profileUrl;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
