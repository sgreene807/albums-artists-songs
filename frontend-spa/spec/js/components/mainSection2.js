export{
    createMainSection2
}

const createMainSection2 = (element, artists) => {
    // clearElementChildren(element);
    // let string ='';
    for(let i=0; i<artists.length; i++) {
        const mainSection2 = document.createElement('main');
        mainSection2.classList.add('artist');

    mainSection2.innerHTML = `
    <ul class="grid-container">
        <li class="grid-item">  
            <img class="artist-img" src="${artists[i].image}">
            <a href="singleartist.html">${artists[i].name}</a>
            <button type="submit">x</button>
        </li>
    </ul>   
    

    <form class="artist-form" action="" method="POST">
    <label class="artist-label" for="name">Add artist name:</label><br>
    <input type="text" id="name" name="name" value="John"><br>
    <input class="artist-submit" type="submit" value="Submit">
    </form>  
    
    `
        // mainSection2.addEventListener('click', ()=>{
        //     artistSection2(element, artists[i]);
        // });
        // element.append(main);
    };

    return mainSection2;

   }

//    const artistSection2 = (element, artist) => {
//        clearElementChildren(element);
//        element.innerHTML = `
//        <main>
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
//         <form action="" method="POST">
//             <label for="name">Add artist name:</label><br>
//             <input type="text" id="name" name="name" value="John"><br>
//             <input type="submit" value="Submit">
//           </form>
//        `
//    }






