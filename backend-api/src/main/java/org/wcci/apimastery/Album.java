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
    @ManyToMany
    private Collection<Artist> artists;
    private String title;
    private String recordLabel;
    private String image;
    @OneToMany
    private Collection<Song> songs;
    private int rating;
    @OneToMany
    private Collection<Comment> comment;

    protected Album(){}

    public Album(String title, String recordLabel, String image, Collection<Song> songs, Artist... artists) {
        this.title = title;
        this.recordLabel = recordLabel;
        this.image = image;
        this.songs = songs;
        this.artists = new ArrayList<>(Arrays.asList(artists));
    }

    public Long getId() {
        return id;
    }

    public Collection<Artist> getArtists() {
        return artists;
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
