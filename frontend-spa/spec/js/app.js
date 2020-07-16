import {
    createFooter
} from "./components/footer.js"
import {
    createHeader
} from "./components/header.js"
import{
    createNavBar
} from "./components/navBar.js"
import{
    createMainSection2
} from "./components/mainSection2.js"
import{
    createArtistSection
} from "./components/artistSection.js"
import{
    fetchArtist
} from "./components/artistFetcher.js"
import{
    fetchSingleArtist
} from "./components/singleArtistFetcher.js"


fetchArtist()
    .then(artists => renderPage(artists));

fetchSingleArtist()
    .then(artist=>renderPage2(artist));

const renderPage = (artistToDisplay) => {
    const body = document.querySelector('.artists');
    body.prepend(createNavBar(artistToDisplay));
    body.appendChild(createHeader(artistToDisplay));
    body.appendChild(createMainSection(artistToDisplay));    
    body.appendChild(createFooter(artistToDisplay));
}

const renderPage2 = (artistToDisplay) => {

    
}


