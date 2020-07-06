package org.wcci.apimastery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArtistController {
ArtistRepository artistRepo;
ArtistStorage artistStorage;

    public ArtistController(ArtistRepository artistRepo, ArtistStorage artistStorage) {
        this.artistRepo = artistRepo;
        this.artistStorage = artistStorage;
    }

    @RequestMapping("artists/{artistName}")
    public String findArtistByName (@PathVariable String artistName, Model model) {
        model.addAttribute("artist", artistStorage.findArtistByName(artistName));
        return "/";
    }

    @RequestMapping("/artists")
    public String findAllArtists(Model model){
        model.addAttribute("artists", artistStorage.findAllArtists());
        return "/";
    }
}
