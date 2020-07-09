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
    public Artist addArtists(@RequestBody Artist artistName) {
        return artistStorage.save(artistName);
    }

    @DeleteMapping("/api/artists/{artistName}")
    public Collection<Artist> deleteArtist(@PathVariable String artistName) {
        Artist artistToRemove = artistStorage.findArtistByName(artistName);
        artistStorage.delete(artistToRemove);
        return artistStorage.findAllArtists();
    }

}
