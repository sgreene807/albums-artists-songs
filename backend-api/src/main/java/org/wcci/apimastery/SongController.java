package org.wcci.apimastery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class SongController {
SongRepository songRepo;
SongStorage songStorage;

    public SongController(SongRepository songRepo, SongStorage songStorage) {
        this.songRepo = songRepo;
        this.songStorage = songStorage;
    }

    @GetMapping("/api/songs/{songTitle}")
    public Song findSongByTitle(@PathVariable String songTitle){
        return songStorage.findSongByTitle(songTitle);
    }

    @GetMapping("/api/songs")
    public Collection<Song> findAllSongs(){
        return songStorage.findAllSongs();
    }

    @PostMapping("/api/songs/add")
    public Song addSongs(String songName) {
        Song songToAdd = songStorage.findSongByTitle(songName);
        if (songToAdd == null) {
            songToAdd = new Song();
            songRepo.save(songToAdd);
        }
        return songStorage.save(songToAdd);
    }
}
