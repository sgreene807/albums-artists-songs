package org.wcci.apimastery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public Artist findArtistByName(@PathVariable String artistName) {
        return artistStorage.findArtistByName(artistName);
    }

    @GetMapping("/api/artists")
    public Collection<Artist> findAllArtists() {
        return artistStorage.findAllArtists();
    }

    @PostMapping("/api/artists/add")
    public Artist addArtists(String artistName) {
        Artist artistToAdd = artistStorage.findArtistByName(artistName);
        if (artistToAdd == null) {
            artistToAdd = new Artist();
            artistRepo.save(artistToAdd);
        }
        return artistStorage.save(artistToAdd);
    }

    @PostMapping("/api/artists/delete")
    public String deleteArtists(String artistName) {
        Artist artistToRemove = artistStorage.findArtistByName(artistName);
        artistStorage.remove(artistToRemove);
        return "redirect:/artists/" + artistName;
    }

}
