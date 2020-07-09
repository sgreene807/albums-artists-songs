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
    public Album addAlbums(String albumName) {
        Album albumToAdd = albumStorage.findAlbumByTitle(albumName);
        if (albumToAdd == null) {
            albumToAdd = new Album();
            albumRepo.save(albumToAdd);
        }
        return albumStorage.save(albumToAdd);
    }



}
