package org.wcci.apimastery;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


@Entity
public class Song {

    @GeneratedValue
    @Id
    private Long id;
    private String title;
    private String link;
    private String duration;
    @ManyToOne
    private Album album;
    @ManyToOne
    private Artist artist;
    private int rating;
    @OneToMany
    private Collection<Comment> comments;

    protected Song(){}

    public Song(String title, String link, String duration, Album album, Artist artist, int rating, Comment... comments) {
        this.title = title;
        this.link = link;
        this.duration = duration;
        this.album = album;
        this.artist = artist;
        this.rating = rating;
        this.comments = new ArrayList<>(Arrays.asList(comments));
    }

    public Song(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDuration() {
        return duration;
    }

    public Album getAlbum() {
        return album;
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


}
