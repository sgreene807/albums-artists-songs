package org.wcci.apimastery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Populator implements CommandLineRunner {

    AlbumRepository albumRepo;
    ArtistRepository artistRepo;
    SongRepository songRepo;

    public Populator(AlbumRepository albumRepo, ArtistRepository artistRepo, SongRepository songRepo) {
        this.albumRepo = albumRepo;
        this.artistRepo = artistRepo;
        this.songRepo = songRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Artist ladyGaga = new Artist("Lady Gaga", "https://i.insider.com/5e14d0643b57e809c97a2913?width=600&format=jpeg&auto=webp", "American singer/songwriter, actress, and movie producer", "Pop", "Def Jam Recordings");
        Artist theWeeknd = new Artist("The Weeknd", "https://media.gq.com/photos/55d25378606992214f1ecc7d/16:9/w_2560%2Cc_limit/The-Weekend-GQ-2015-01.jpg", "Canadian singer/songwriter and record producer", "R&B", "XO");
        Artist beyonce = new Artist("Beyonce", "https://static.standard.co.uk/s3fs-public/thumbnails/image/2017/09/04/13/beyonce.jpg", "American singer-songwriter and actress who achieved fame in the late 1990s as the lead singer of Destiny's Child", "R&B", "Music World");
        Artist rihanna = new Artist("Rihanna","https://pbs.twimg.com/profile_images/1133109643734130688/BwioAwkz.jpg","Barbadian singer, songwriter, actress, and businesswoman","Pop", "Roc Nation");
        Artist justinTimberlake = new Artist("Justin Timberlake", "https://www.thesun.co.uk/wp-content/uploads/2018/02/nintchdbpict000382335058.jpg","American singer, songwriter, actor, and record producer","Pop","Tennman Records");

        artistRepo.save(ladyGaga);
        artistRepo.save(theWeeknd);
        artistRepo.save(beyonce);
        artistRepo.save(rihanna);
        artistRepo.save(justinTimberlake);

        Song justDance = new Song("Just Dance");
        Song pokerFace = new Song("Poker Face");
        Song ehEh = new Song("Nothing Else I Can Say");
        Song loveGame = new Song("Love Game");
        Song paparazzi = new Song("Paparazzi");

        songRepo.save(justDance);
        songRepo.save(pokerFace);
        songRepo.save(ehEh);
        songRepo.save(loveGame);
        songRepo.save(paparazzi);

        Song lonelyStar = new Song("lonely star");
        Song lifeOfTheParty = new Song("life of the party");
        Song thursday1 = new Song("thursday");
        Song theZone = new Song("the zone");
        Song theBirdsPart1 = new Song("the birds part one");
        Song theBirdsPart2 = new Song("the birds part two");
        Song gone = new Song("gone");
        Song rollingStone = new Song("rolling stone");
        Song heavenOrLA = new Song("heaven or las vegas");

        songRepo.save(lonelyStar);
        songRepo.save(lifeOfTheParty);
        songRepo.save(thursday1);
        songRepo.save(theZone);
        songRepo.save(theBirdsPart1);
        songRepo.save(theBirdsPart2);
        songRepo.save(gone);
        songRepo.save(rollingStone);
        songRepo.save(heavenOrLA);

        Song pray = new Song("Pray You Catch Me");
        Song holdUp = new Song("Hold Up");
        Song sorry = new Song("Sorry");
        Song sixInch = new Song("6 Inch");
        Song daddyLessons = new Song("Daddy Lessons");
        Song loveDrought = new Song("Love Drought");
        Song sandCastles = new Song("Sandcastles");
        Song forward = new Song("Forward");
        Song freedom = new Song("freedom");
        Song allNight = new Song("All Night");
        Song formation = new Song("Formation");
        Song lemonade1 = new Song("Lemonade");

        songRepo.save(pray);
        songRepo.save(holdUp);
        songRepo.save(sorry);
        songRepo.save(sixInch);
        songRepo.save(daddyLessons);
        songRepo.save(loveDrought);
        songRepo.save(sandCastles);
        songRepo.save(forward);
        songRepo.save(freedom);
        songRepo.save(allNight);
        songRepo.save(formation);
        songRepo.save(lemonade1);

        Song phreshOutTheRunway = new Song("Phresh Out The Runway");
        Song diamonds = new Song("Diamonds");
        Song numb = new Song("Numb");
        Song pourItUp = new Song("Pour It Up");
        Song loveSong = new Song("Loveeeeeee Song");
        Song jump = new Song("Jump");
        Song rightNow = new Song("Right Now");
        Song whatNow = new Song("What Now");
        Song stay = new Song("Stay");
        Song nobodysBusiness = new Song("Nobody's Business");
        Song loveWithoutTragedy = new Song("Love Without Tragedy");
        Song getItOverWith = new Song("Get It Over With");
        Song noLoveAllowed = new Song("No Love Allowed");
        Song lostInParadise = new Song("Lost In Paradise");

        songRepo.save(phreshOutTheRunway);
        songRepo.save(diamonds);
        songRepo.save(numb);
        songRepo.save(pourItUp);
        songRepo.save(loveSong);
        songRepo.save(jump);
        songRepo.save(rightNow);
        songRepo.save(whatNow);
        songRepo.save(stay);
        songRepo.save(nobodysBusiness);
        songRepo.save(loveWithoutTragedy);
        songRepo.save(getItOverWith);
        songRepo.save(noLoveAllowed);
        songRepo.save(lostInParadise);

        Song pusherLoveGirl = new Song("Pusher Love Girl");
        Song suiteAndTie = new Song("Suite And Tie");
        Song dontHoldTheWall = new Song("Don't Hold The Wall");
        Song strawberryBubblegum = new Song("Strawberry Bubblegum");
        Song tunnelVision = new Song("Tunnel Vision");
        Song spaceshipCoupe = new Song("Spaceship Coupe");
        Song thatGirl = new Song("That Girl");
        Song letTheGrooveGetIn = new Song("Let The Groove Get In");
        Song mirrors = new Song("Mirros");
        Song blueOceanFloor = new Song("Blue Ocean Floor");

        songRepo.save(pusherLoveGirl);
        songRepo.save(suiteAndTie);
        songRepo.save(dontHoldTheWall);
        songRepo.save(strawberryBubblegum);
        songRepo.save(tunnelVision);
        songRepo.save(spaceshipCoupe);
        songRepo.save(thatGirl);
        songRepo.save(letTheGrooveGetIn);
        songRepo.save(mirrors);
        songRepo.save(blueOceanFloor);

        Album theFame = new Album("The Fame", "Streamline", "https://static.keymusic.com/products/119000/340/hal-leonard-lady-gaga-the-fame-monster.jpg", ladyGaga, justDance, pokerFace, ehEh, loveGame, paparazzi);
        Album thursday = new Album("Thursday", "XO", "https://upload.wikimedia.org/wikipedia/en/d/dd/The_Weeknd_-_Thursday.png", theWeeknd, lonelyStar, lifeOfTheParty, thursday1, theZone, theBirdsPart1, theBirdsPart2, gone, rollingStone, heavenOrLA);
        Album lemonade = new Album("Lemonade", "Parkwood Entertainment", "https://en.wikipedia.org/wiki/Parkwood_Entertainment#/media/File:PWE.svg", beyonce,
                pray, holdUp, sorry, sixInch, daddyLessons, loveDrought, sandCastles, forward, freedom, allNight, formation, lemonade1);
        Album unapologetic = new Album("Unapologetic","Roc Nation","https://23u0pr24qn4zn4d4qinlmyh8-wpengine.netdna-ssl.com/wp-content/uploads/2016/07/rhi_12_original_19979.jpg",rihanna,phreshOutTheRunway,diamonds,numb,pourItUp,loveSong,jump,rightNow,whatNow,stay,nobodysBusiness,loveWithoutTragedy,getItOverWith,noLoveAllowed,lostInParadise);
        Album twentyTwenty = new Album("The 20/20 Experience","Tennman Records","https://static.billboard.com/files/media/justin-timberlake-20-20-experience-650-430-compressed.jpg",justinTimberlake,pusherLoveGirl,suiteAndTie,dontHoldTheWall,strawberryBubblegum,tunnelVision,spaceshipCoupe,thatGirl,letTheGrooveGetIn,mirrors,blueOceanFloor);

        albumRepo.save(theFame);
        albumRepo.save(thursday);
        albumRepo.save(lemonade);
        albumRepo.save(unapologetic);
        albumRepo.save(twentyTwenty);

    }
}
