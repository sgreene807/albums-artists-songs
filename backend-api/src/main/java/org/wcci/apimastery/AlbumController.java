package org.wcci.apimastery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}
