package org.wcci.apimastery;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AlbumStorage {
    AlbumRepository albumRepo;

    public AlbumStorage(AlbumRepository albumRepo) {
        this.albumRepo = albumRepo;
    }

    public AlbumRepository getAlbumRepo() {
        return albumRepo;
    }

    public Album findAlbumByTitle(String title) {
        return albumRepo.findAlbumByTitle(title);
    }

    public Album save(Album album){
        return albumRepo.save(album);
    }

    public Collection<Album> findAllAlbums() {
        return (Collection<Album>) albumRepo.findAll();
    }

    public void remove(Album albumToRemove) {
        albumRepo.delete(albumToRemove);
    }
}
