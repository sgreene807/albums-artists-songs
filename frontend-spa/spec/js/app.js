import{
    fetchArtist
} from "./components/artistFetcher.js"
import {
    createMainSection
} from "./components/mainSection.js"


const element = document.querySelector('main');

fetchArtist()
    .then(artists => {
        createMainSection(element, artists)
    })

