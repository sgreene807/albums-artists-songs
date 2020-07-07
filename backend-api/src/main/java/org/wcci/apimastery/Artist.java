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
    private Collection<Album> album;
    private String description;
    private String genre;
    private String recordLabel;
    private int rating;
    @OneToMany
    private Collection<Comment> comment;

    protected Artist() {}

    public Artist(String name, String image, Collection<Album> album, String description, String genre, String recordLabel) {
        this.name = name;
        this.image = image;
        this.album = album;
        this.description = description;
        this.genre = genre;
        this.recordLabel = recordLabel;
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
        return album;
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
}
