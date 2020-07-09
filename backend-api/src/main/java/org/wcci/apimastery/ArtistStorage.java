package org.wcci.apimastery;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ArtistStorage {
    ArtistRepository artistRepo;

    public ArtistStorage(ArtistRepository artistRepo) {
        this.artistRepo = artistRepo;
    }

    public ArtistRepository getArtistRepo() {
        return artistRepo;
    }

    public Artist findArtistByName(String name) {
        return artistRepo.findArtistByName(name);
    }

    public Artist save(Artist artist){
        return artistRepo.save(artist);
    }

    public Collection<Artist> findAllArtists(){

        return (Collection<Artist>) artistRepo.findAll();
    }

    public void remove(Artist artistToRemove) {
        artistRepo.delete(artistToRemove);
    }
}
