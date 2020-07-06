package org.wcci.apimastery;

import javax.persistence.*;


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

    protected Song(){}

    public Song(Long id, String title, String link, String duration, Album album) {
        this.id = id;
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
