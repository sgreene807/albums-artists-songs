package org.wcci.apimastery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ArtistController {
ArtistRepository artistRepo;
ArtistStorage artistStorage;

    public ArtistController(ArtistRepository artistRepo, ArtistStorage artistStorage) {
        this.artistRepo = artistRepo;
        this.artistStorage = artistStorage;
    }

    @GetMapping("/api/artists/{artistName}")
    public Artist findArtistByName (@PathVariable String artistName) {
        return artistStorage.findArtistByName(artistName);
    }

    @GetMapping("/api/artists")
    public Collection<Artist> findAllArtists(){
        return artistStorage.findAllArtists();
    }
}
