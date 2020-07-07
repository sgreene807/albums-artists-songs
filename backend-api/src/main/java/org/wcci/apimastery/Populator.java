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
        Artist theWeeknd = new Artist("The Weeknd", "https://media.gq.com/photos/55d25378606992214f1ecc7d/16:9/w_2560%2Cc_limit/The-Weekend-GQ-2015-01.jpg", "Canadian singer/songwriter and record producer", "R&B", "XO");

        Song justDance = new Song("Just Dance");
        Song pokerFace = new Song("Poker Face");
        Song ehEh = new Song("Nothing Else I Can Say");
        Song loveGame = new Song("Love Game");
        Song paparazzi = new Song("Paparazzi");

        Song lonelyStar = new Song("lonely star");
        Song lifeOfTheParty = new Song("life of the party");
        Song thursday1 = new Song("thursday");
        Song theZone = new Song("the zone");
        Song theBirdsPart1 = new Song("the birds part one");
        Song theBirdsPart2 = new Song("the birds part two");
        Song gone = new Song("gone");
        Song rollingStone = new Song("rolling stone");
        Song heavenOrLA = new Song("heaven or las vegas");

        Album theFame = new Album("The Fame","Streamline","https://static.keymusic.com/products/119000/340/hal-leonard-lady-gaga-the-fame-monster.jpg",ladyGaga,justDance,pokerFace,ehEh,loveGame,paparazzi);
        Album thursday = new Album("Thursday", "XO", "https://upload.wikimedia.org/wikipedia/en/d/dd/The_Weeknd_-_Thursday.png", theWeeknd, lonelyStar, lifeOfTheParty, thursday1, theZone, theBirdsPart1, theBirdsPart2, gone, rollingStone, heavenOrLA);


    }
}
