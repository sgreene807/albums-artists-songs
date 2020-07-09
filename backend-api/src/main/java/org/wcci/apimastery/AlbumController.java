package org.wcci.apimastery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class AlbumController {
    AlbumRepository albumRepo;
    AlbumStorage albumStorage;

    public AlbumController(AlbumRepository albumRepo, AlbumStorage albumStorage) {
        this.albumRepo = albumRepo;
        this.albumStorage = albumStorage;
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

    @DeleteMapping("/api/albums/{albumName}")
    public Collection<Album> deleteAlbums(@PathVariable String albumName) {
        Album albumToRemove = albumStorage.findAlbumByTitle(albumName);
        albumStorage.delete(albumToRemove);
        return albumStorage.findAllAlbums();
    }

}
