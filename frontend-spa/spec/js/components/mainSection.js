export{
    createMainSection
}

const createMainSection = (artists) => {
    const mainSection = document.createElement("main");
    mainSection.classList.add('artist');
    let string ='';

    Object.values(artists).forEach(artist => {
        string+=`
        <li class="grid-item">  
            <img class="artist-img" src="${artist.image}">
            <a href="singleartist.html">${artist.name}</a>
            <button type="submit">x</button>
       </li>
        `
    })
    
    mainSection.innerHTML = `
            <ul class="grid-container">  
                ${string}
            </ul> 

            <form class="artist-form" action="" method="POST">
            <label class="artist-label" for="name">Add artist name:</label><br>
            <input type="text" id="name" name="name" value="John"><br>
            <input class="artist-submit" type="submit" value="Submit">
          </form>
    `

    return mainSection;
}