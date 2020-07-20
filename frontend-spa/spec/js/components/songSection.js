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


const createSongSection = (element, songs) => {
    clearElementChildren(element);
    element.append(createHeader());
    element.append(createNavBar());
    element.append(createFooter());
    const ul = document.createElement('ul');
    ul.innerHTML = `
        <p>${songs.title}</p>
        <a href="${songs.link}">Click here for Youtube Link</a>
        <p>${songs.duration}</p>  
    `
    element.append(ul);
}
