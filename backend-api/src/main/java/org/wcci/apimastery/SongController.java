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
    public Song addSongs(@RequestBody Song songName) {
        return songStorage.save(songName);
    }

    @DeleteMapping("/api/songs/{songName}")
    public Collection<Song> deleteSongs(@PathVariable String songName) {
        Song songToRemove = songStorage.findSongByTitle(songName);
        songStorage.delete(songToRemove);
        return songStorage.findAllSongs();
    }
}
