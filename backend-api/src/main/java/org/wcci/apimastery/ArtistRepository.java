package org.wcci.apimastery;

import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
    Artist findArtistByName(String name);
}
