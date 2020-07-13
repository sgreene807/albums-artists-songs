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
    createMainSection
} from "./components/mainSection.js"
import{
    fetchArtist
} from "./components/artistFetcher"

fetchArtist()
    .then(artists => renderPage(artists));

const renderPage = () => {
    const body = document.querySelector('.artists');
    body.prepend(createNavBar());
    body.appendChild(createHeader());
    body.appendChild(createMainSection());
    body.appendChild(createFooter());
}


