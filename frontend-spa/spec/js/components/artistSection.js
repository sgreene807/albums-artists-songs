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
    const ul = document.createElement('ul');
    ul.innerHTML = `
        <img src="${artist.image}" alt="">
        <h2>${artist.name}</h2>
        <h4>${artist.genre}</h4>
        <h4>${artist.recordLabel}</h4>
        <p>${artist.description}</p>
    `
    element.append(ul);

    for (let i = 0; i < albums.length; i++){
        const li = document.createElement('li');
        li.innerHTML = `
            <a>${artist.albums[i].name}</a>
        `
        li.addEventListener('click', () => {
            createAlbumSection(element, albums[i]);
        })
    }

    ul.append(li);

    // const albums = document.createElement('ul');

    // artist.albums.forEach((album) => {
    //     const li = document.createElement('li');
    //     li.innerHTML = `<a>${album.title}</a>`
    //     li.addEventListener('click', () => {
    //         alert('You clicked on ${album.name}')
    //     })
    //     albums.appendChild(li);
    // })

    // element.append(albums);
}

    

    
    


