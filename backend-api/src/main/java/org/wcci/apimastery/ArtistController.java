package org.wcci.apimastery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ArtistController {
    ArtistStorage artistStorage;
    AlbumStorage albumStorage;

    public ArtistController(ArtistStorage artistStorage, AlbumStorage albumStorage) {
        this.artistStorage = artistStorage;
        this.albumStorage = albumStorage;
    }

    @GetMapping("/api/artists/{id}")
    public Artist findArtistById(@PathVariable Long id) {
        return artistStorage.findArtistById(id);
    }

    @CrossOrigin
    @GetMapping("/api/artists")
    public Collection<Artist> findAllArtists() {
        return artistStorage.findAllArtists();
    }

    @PostMapping("/api/artists")
    public Artist addArtists(@RequestBody Artist artistName) {
        return artistStorage.save(artistName);
    }

    @PatchMapping("/api/artists/{artistName}/album")
    public Artist addAlbumToArtist(@PathVariable String artistName, @RequestBody Album album){
        Artist artist =  artistStorage.findArtistByName(artistName);
        Album albumToAdd = new Album(album.getTitle(), album.getRecordLabel(),album.getImage(), artist, (Song) album.getSongs());
        albumStorage.save(albumToAdd);
        return albumToAdd.getArtist();
    }

    @DeleteMapping("/api/artists/{artistName}")
    public Collection<Artist> deleteArtist(@PathVariable String artistName) {
        Artist artistToRemove = artistStorage.findArtistByName(artistName);
        artistStorage.delete(artistToRemove);
        return artistStorage.findAllArtists();
    }

}
