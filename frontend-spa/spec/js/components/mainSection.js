export{
    createMainSection
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


const createMainSection = (element, artists) => {
    clearElementChildren(element);
    element.append(createHeader());
    element.append(createNavBar());
    element.append(createFooter());
    let string = '';
    const mainSection = document.createElement("main");
    mainSection.classList.add('artist');
    const ul = document.createElement('ul');
    ul.classList.add('grid-container')
    const form = document.createElement('form');
    form.classList.add('artist-form')
    form.innerHTML = `
            <label class="artist-label" for="name">Add artist name</label><br>
            <input type ="text" id="name" name="name" value="John"><br>
            <input class="artist-submit" type="submit" value="Submit"> 
    `
    mainSection.append(ul);
    mainSection.append(form);

    for (let i = 0; i < artists.length; i++) {
        const li = document.createElement('li')
        li.classList.add('grid-item');
        li.innerHTML = `
                <img class="artist-img" src="${artists[i].image}">
                <a>${artists[i].name}</a>
                <button type="submit">x</button>
        `
       li.addEventListener('click', (event) => {
            event.preventDefault();
            createArtistSection(element, artists[i]);
        });

        ul.append(li)
    }
    element.append(mainSection);
}