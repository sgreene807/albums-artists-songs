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
    fetchArtist
} from "./components/artistFetcher.js"
import {
    createMainSection
} from "./components/mainSection.js"

fetchArtist()
    .then(artists => renderPage(artists));

const renderPage = (artistToDisplay) => {
    const body = document.querySelector('.artists');
    body.prepend(createNavBar(artistToDisplay));
    body.appendChild(createHeader(artistToDisplay));
    body.appendChild(createMainSection(artistToDisplay));    
    body.appendChild(createFooter(artistToDisplay));
}



