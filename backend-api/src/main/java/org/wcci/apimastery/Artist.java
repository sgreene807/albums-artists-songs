package org.wcci.apimastery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Artist {

    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String image;
    @OneToMany
    private Collection<Album> albums;
    private String description;
    private String genre;
    private String recordLabel;
    private int rating;
    @OneToMany
    private Collection<Comment> comments;

    protected Artist() {}

    public Artist(String name, String image,String description, String genre, String recordLabel) {
        this.name = name;
        this.image = image;
        this.albums = albums;
        this.description = description;
        this.genre = genre;
        this.recordLabel = recordLabel;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public Collection<Album> getAlbum() {
        return albums;
    }

    public String getDescription() {
        return description;
    }

    public String getGenre() {
        return genre;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public int getRating() {
        return rating;
    }

    public Collection<Comment> getComments() {
        return comments;
    }
}
