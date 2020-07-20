package org.wcci.apimastery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class AlbumController {
    AlbumStorage albumStorage;
    SongStorage songStorage;
    ArtistStorage artistStorage;

    public AlbumController(AlbumStorage albumStorage, SongStorage songStorage, ArtistStorage artistStorage) {
        this.albumStorage = albumStorage;
        this.songStorage = songStorage;
        this.artistStorage = artistStorage;
    }

    @GetMapping("/api/albums/{albumId}")
    public Album findAlbumById(@PathVariable Long albumId)  {
        return albumStorage.findAlbumById(albumId);
    }

    @GetMapping ("/api/albums")
    public Collection<Album> showAllAlbums() {
        return albumStorage.findAllAlbums();
    }

    @PostMapping("/api/albums/add")
    public Album addAlbums(@RequestBody Album albumName) {
        return albumStorage.save(albumName);
    }

    @PatchMapping("/api/albums/{albumId}/song")
    public Album addSongToAlbum(@PathVariable Long albumId, @RequestBody Song song){
        Album album = albumStorage.findAlbumById(albumId);
//        Artist artist = artistStorage.findArtistById(artistId);
        Song songToAdd = new Song(song.getTitle(), song.getLink(),song.getDuration(),album,album.getArtist(),song.getRating(), (Comment) song.getComments());
        songStorage.save(songToAdd);
        return songToAdd.getAlbum();
    }

    @DeleteMapping("/api/albums/{id}")
    public Collection<Album> deleteAlbums(@PathVariable Long id) {
        albumStorage.delete(id);
        return albumStorage.findAllAlbums();
    }

}
