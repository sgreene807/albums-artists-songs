package org.wcci.apimastery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ArtistController {
    ArtistRepository artistRepo;
    ArtistStorage artistStorage;
    AlbumStorage albumStorage;

    public ArtistController(ArtistRepository artistRepo, ArtistStorage artistStorage, AlbumStorage albumStorage) {
        this.artistRepo = artistRepo;
        this.artistStorage = artistStorage;
        this.albumStorage = albumStorage;
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

    @PatchMapping("/api/artists/{artistName}/addAlbum")
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
