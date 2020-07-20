export {
    createSongSection
}
import {
    createHeader
} from "./header.js"
import{
    createNavBar
} from "./navBar.js"
import {
    createFooter
} from "./footer.js"
import {
    clearElementChildren
} from "../domHelper.js"


const createSongSection = (element, song) => {
    clearElementChildren(element);
    element.append(createHeader());
    element.append(createNavBar());
    element.append(createFooter());
    const ul = document.createElement('ul');
    ul.innerHTML = `
        <p>${song.title}</p>
        <a>${song.link}</a>
        <p>${song.duration}</p>
        <p>${song.album.title}</p>
        <p>${song.artist.name}</p>   
    `
    element.append(ul);
}

    // li.addEventListener('click', () => {
    //     event.preventDefault();
    //     createSongSection(element, album.songs[i]);
    // })