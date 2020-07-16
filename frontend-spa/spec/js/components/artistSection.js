// export{
//     createArtistSection
// }

// const createArtistSection = (element, artists) => {
//     const artistSection = document.createElement("main");
//     artistSection.classList.add('artist');
//     let string ='';

//     Object.values(artists).forEach(artist => {
//         string+=`
//         <main>
//             <img src="${artist.image}" alt="">
//             <h2>${artist.name}</h2>
//             <h4>${artist.genre}</h4>
//             <h4>${artist.recordLabel}</h4>
//             <p>${artist.description}</p>
//             <h4>List of Albums</h4>
//             <ul class="song-names">
//                 <li><a href="singlealbum.html">${artist.name.albums}</a></li>
//                 <form action="" method="POST">
//                     <input type="hidden" name="albumName" value="Album 1">
//                     <button type="submit">x</button>
//                 </form>
//                 <li><a href="singlealbum.html">Album 2</a></li>
//                 <form action="" method="POST">
//                     <input type="hidden" name="albumName" value="Album 2">
//                     <button type="submit">x</button>
//                 </form>
//             </ul>
//         </main>
//         `
//     })
    
//     artistSection.innerHTML = `
//             <main>  
//                 ${string}
//             </main> 

//             <form action="" method="POST">
//             <label for="name">Add artist name:</label><br>
//             <input type="text" id="name" name="name" value="John"><br>
//             <input type="submit" value="Submit">
//           </form>
//     `

//     return artistSection;
// }

export{
    createArtistSection
}
import {
    clearElementChildren
} from "../domHelper.js"

const createArtistSection = (element, artists) => {
    clearElementChildren(element);
    element.innerHTML = `
        <main>
            <img src="${artist.image}" alt="">
            <h2>${artist.name}</h2>
            <h4>${artist.genre}</h4>
            <h4>${artist.recordLabel}</h4>
            <p>${artist.description}</p>
            <h4>List of Albums</h4>
            <ul class="song-names">
                <li><a href="singlealbum.html">${artist.name.albums}</a></li>
                <form action="" method="POST">
                    <input type="hidden" name="albumName" value="Album 1">
                    <button type="submit">x</button>
                  </form>
                <li><a href="singlealbum.html">Album 2</a></li>
                <form action="" method="POST">
                    <input type="hidden" name="albumName" value="Album 2">
                    <button type="submit">x</button>
                </form>
            </ul>
             </main>
    `
}

