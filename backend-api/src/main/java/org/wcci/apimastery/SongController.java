package org.wcci.apimastery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SongController {
SongRepository songRepo;
SongStorage songStorage;

    public SongController(SongRepository songRepo, SongStorage songStorage) {
        this.songRepo = songRepo;
        this.songStorage = songStorage;
    }

    @RequestMapping ("songs/{songTitle}")
    public String findSongByTitle(@PathVariable String songTitle, Model model){
        model.addAttribute("song", songStorage.findSongByTitle(songTitle));
        return "/";
    }

    @RequestMapping("/songs")
    public String findAllSongs(Model model){
        model.addAttribute("songs", songStorage.findAllSongs());
        return "/";
    }
}
