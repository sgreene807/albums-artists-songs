package org.wcci.apimastery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlbumController {
    AlbumRepository albumRepo;
    AlbumStorage albumStorage;

    public AlbumController(AlbumRepository albumRepo, AlbumStorage albumStorage) {
        this.albumRepo = albumRepo;
        this.albumStorage = albumStorage;
    }

    @RequestMapping("albums/{albumName}")
    public String showSingleAlbum(@PathVariable String albumName, Model model) {
        model.addAttribute("albumName", albumStorage.findAlbumByTitle(albumName));
        return "/";
    }

    @RequestMapping("/albums")
    public String showAllAlbums(Model model) {
        model.addAttribute("albums", albumStorage.findAllAlbums());
        return "/";
    }



}
