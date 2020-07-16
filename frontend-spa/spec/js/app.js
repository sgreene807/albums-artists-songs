import{
    fetchArtist
} from "./components/artistFetcher.js"
import {
    createMainSection
} from "./components/mainSection.js"
const element = document.querySelector('main');
fetchArtist()
    .then(artists => renderPage(element, artists));

const renderPage = (element, artists) => {
    const body = document.querySelector('.artists');
    body.append(createMainSection(element, artists));  
    body.append(createArtistSection(element, artists));    
}



