package org.wcci.apimastery;

import org.springframework.stereotype.Service;

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

    public Iterable<Artist> findAllArtists(){
        return artistRepo.findAll();
    }
}
