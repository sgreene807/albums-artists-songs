package org.wcci.apimastery;

import javax.persistence.*;
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
    private int rating;
    @OneToMany
    private Collection<Comment> comment;

    protected Song(){}

    public Song(String title, String link, String duration, Album album) {
        this.title = title;
        this.link = link;
        this.duration = duration;
        this.album = album;
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
}
