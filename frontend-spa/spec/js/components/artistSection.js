export{
    createArtistSection
}
import {
    clearElementChildren
} from "../domHelper.js"
import{
    createMainSection
} from "./mainSection.js"
import {
    fetchArtist
} from "./artistFetcher.js"
import {
    createHeader
} from "./header.js"
import{
    createNavBar
} from "./navBar.js"
import {
    createFooter
} from "./footer.js"

const createArtistSection = (element, artist) => {
    clearElementChildren(element);
    element.append(createHeader());
    element.append(createNavBar());
    element.append(createFooter());
    // const artistSection = document.createElement('main');
    // artistSection.classList.add('singleArtist');
    element.innerHTML = `
            <img src="${artist.image}" alt="">
            <h2>${artist.name}</h2>
            <h4>${artist.genre}</h4>
            <h4>${artist.recordLabel}</h4>
            <p>${artist.description}</p>
            <h4>List of Albums</h4>
        `

        // const albums = document.createElement('ul');
        // albums.classList.add('song-names');

        // artist.albums.forEach((album)=> {
        //     const li = document.createElement('li');
        //     li.innerHTML = `
        //     <li><a href="singlealbum.html">${album.name}</a></li>
        //         <form action="" method="POST">
        //             <input type="hidden" name="albumName" value="Album 1">
        //             <button type="submit">x</button>
        //           </form>
        //     `
        element.append(artistSection);
    }
    
    


