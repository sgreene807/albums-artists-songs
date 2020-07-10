package org.wcci.apimastery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class AlbumController {
    AlbumRepository albumRepo;
    AlbumStorage albumStorage;
    SongStorage songStorage;
    ArtistStorage artistStorage;

    public AlbumController(AlbumRepository albumRepo, AlbumStorage albumStorage, SongStorage songStorage, ArtistStorage artistStorage) {
        this.albumRepo = albumRepo;
        this.albumStorage = albumStorage;
        this.songStorage = songStorage;

        this.artistStorage = artistStorage;
    }

    @GetMapping("/api/albums/{albumName}")
    public Album findAlbumByTitle (@PathVariable String albumName)  {
        return albumStorage.findAlbumByTitle(albumName);
    }

    @GetMapping ("/api/albums")
    public Collection<Album> showAllAlbums() {
        return albumStorage.findAllAlbums();
    }

    @PostMapping("/api/albums/add")
    public Album addAlbums(@RequestBody Album albumName) {
        return albumStorage.save(albumName);
    }

    @PatchMapping("/api/albums/{albumName}/addSong")
    public Album addSongToAlbum(@PathVariable String albumName,@PathVariable String artistName,@RequestBody Song song){
        Album album = albumStorage.findAlbumByTitle(albumName);
        Artist artist = artistStorage.findArtistByName(artistName);
        Song songToAdd = new Song(song.getTitle(), song.getLink(),song.getDuration(),album,artist,song.getRating(), (Comment) song.getComments());
        songStorage.save(songToAdd);
        return songToAdd.getAlbum();
    }

    @DeleteMapping("/api/albums/{albumName}")
    public Collection<Album> deleteAlbums(@PathVariable String albumName) {
        Album albumToRemove = albumStorage.findAlbumByTitle(albumName);
        albumStorage.delete(albumToRemove);
        return albumStorage.findAllAlbums();
    }

}
