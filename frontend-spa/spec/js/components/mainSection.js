export{
    createMainSection
}

const createMainSection = (artists) => {
    const mainSection = document.createElement("main");
    mainSection.classList.add('artist');
    let string ='';

    Object.values(artists).forEach(artist => {
        string+=`
        <li>  <a href="singleartist.html"> ${artist.name}
       </a> <button type="submit">x</button>
       </li>
        `
    })
    
    mainSection.innerHTML = `
            <ul>  
                ${string}
            </ul> 

            <form action="" method="POST">
            <label for="name">Add artist name:</label><br>
            <input type="text" id="name" name="name" value="John"><br>
            <input type="submit" value="Submit">
          </form>
    `

    return mainSection;
}