export {
    createAlbumSection
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
    createArtistSection
} from "./artistSection.js"
import {
    clearElementChildren
} from "../domHelper.js"


const createAlbumSection = (element, album) => {
    clearElementChildren(element);
    element.append(createHeader());
    element.append(createNavBar());
    element.append(createFooter());
    const main = document.createElement('main');
    main.innerHTML = `
        <p>${album.title}</p>
       
    `
    element.append(main);
 
}