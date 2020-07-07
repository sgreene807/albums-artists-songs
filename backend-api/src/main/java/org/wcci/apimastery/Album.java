package org.wcci.apimastery;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Album {

    @GeneratedValue
    @Id
    private Long id;
    @ManyToOne
    private Artist artist;
    private String title;
    private String recordLabel;
    private String image;
    @OneToMany
    private Collection<Song> songs;
    private int rating;
    @OneToMany
    private Collection<Comment> comments;

    protected Album(){}

    public Album(String title, String recordLabel, String image, Artist artist, Song... songs) {
        this.title = title;
        this.recordLabel = recordLabel;
        this.image = image;
        this.artist = artist;
        this.comments = comments;
        this.songs = new ArrayList<>(Arrays.asList(songs));
    }

    public Long getId() {
        return id;
    }

    public Artist getArtist() {
        return artist;
    }

    public int getRating() {
        return rating;
    }

    public Collection<Comment> getComments() {
        return comments;
    }

    public String getTitle() {
        return title;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public String getImage() {
        return image;
    }

    public Collection<Song> getSongs() {
        return songs;
    }
}
