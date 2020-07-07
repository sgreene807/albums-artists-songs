package org.wcci.apimastery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {

    @GeneratedValue
    @Id
    private Long id;
    private String userName;
    private String date;
    private String description;
    @ManyToOne
    private Album album;
    @ManyToOne
    private Song song;
    @ManyToOne
    private Artist artist;

    protected Comment() {
    }

    public Comment(String userName, String date, String description, Album album, Song song, Artist artist) {
        this.userName = userName;
        this.date = date;
        this.description = description;
        this.album = album;
        this.song = song;
        this.artist = artist;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Album getAlbum() {
        return album;
    }

    public Song getSong() {
        return song;
    }

    public Artist getArtist() {
        return artist;
    }
}
