package org.wcci.apimastery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    AlbumRepository albumRepo;
    @Autowired
    ArtistRepository artistRepo;
    @Autowired
    SongRepository songRepo;


    @Override
    public void run(String... args) throws Exception {
        Artist ladyGaga = new Artist("Lady Gaga","https://i.insider.com/5e14d0643b57e809c97a2913?width=600&format=jpeg&auto=webp","American singer/songwriter, actress, and movie producer","Pop","Def Jam Recordings");

        Song justDance = new Song("Just Dance");
        Song pokerFace = new Song("Poker Face");
        Song ehEh = new Song("Nothing Else I Can Say");
        Song loveGame = new Song("Love Game");
        Song paparazzi = new Song("Paparazzi");

        Album theFame = new Album("The Fame","Streamline","https://static.keymusic.com/products/119000/340/hal-leonard-lady-gaga-the-fame-monster.jpg",ladyGaga,justDance,pokerFace,ehEh,loveGame,paparazzi);


    }
}
