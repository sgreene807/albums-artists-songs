package org.wcci.apimastery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
