// export{
//     createMainSection
// }
// import {
//     createArtistSection
// } from "./components/artistSection.js"
// import {
//     clearElementChildren
// } from "./js/domHelper.js"

// const createMainSection = (element, artists) => {
//     clearElementChildren(element);

//     const mainSection = document.createElement("main");
//     mainSection.classList.add('artist');
//     let string ='';

//     Object.values(artists).forEach(artist => {
//         string+=`
//         <li class="grid-item">  
//             <img class="artist-img" src="${artist.image}">
//             <a href="singleartist.html">${artist.name}</a>
//             <button type="submit">x</button>
//         </li>
//         ` 
//         mainSection.innerHTML = `
//             <ul class="grid-container">  
//                 ${string}
//             </ul> 

//             <form class="artist-form" action="" method="POST">
//             <label class="artist-label" for="name">Add artist name:</label><br>
//             <input type="text" id="name" name="name" value="John"><br>
//             <input class="artist-submit" type="submit" value="Submit">
//           </form>
//         `
//         mainSection.addEventListener('click', () => {
//             createArtistSection(element, artist);
//         });
//         element.append(mainSection);

//     })

//     return mainSection;
// }

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
    for (let i = 0; i < artists.length; i++) {
        string += `
            <li class="grid-item">
                <img class="artist-img" src="${artists[i].image}">
                <a href="singleartist.html">${artists[i].name}</a>
                <button type="submit">x</button>
            </li>
        `;
    
        mainSection.innerHTML = `
        <ul class = "grid-container">
        ${string}
        </ul>
        <form class="artist-form" action="" method="POST">
        <label class="artist-label" for="name">Add artist name</label><br>
        <input type ="text" id="name" name="name" value="John"><br>
        <input class="artist-submit" type="submit" value="Submit"> 
        </form>
        `

        mainSection.addEventListener('click', () => {
            createArtistSection(element, artists[i]);
        });
        element.append(mainSection);
    }
}