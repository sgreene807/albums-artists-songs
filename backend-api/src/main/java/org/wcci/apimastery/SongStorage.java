package org.wcci.apimastery;

import org.springframework.stereotype.Service;

@Service
public class SongStorage {
    SongRepository songRepo;

    public SongStorage(SongRepository songRepo){
     this.songRepo = songRepo;
    }

    public SongRepository getSongRepo() {
        return songRepo;
    }

    public Song findSongByTitle (String title) {
        return songRepo.findSongByTitle(title);
    }

    public Iterable<Song> findAllSongs(){
        return songRepo.findAll();
    }
}
