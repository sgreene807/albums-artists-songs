export{
    createMainSection
}

const createMainSection = (artist) => {
    const mainSection = document.createElement("main");
    mainSection.classList.add('artist');
    mainSection.innerHTML = `
            <ul>
                <li>
                    <a href="singleartist.html">${artist.name}</a>
                    <button type="submit">x</button>
                </li>
            </ul>   
            <form action="" method="POST">
            <label for="name">Add artist name:</label><br>
            <input type="text" id="name" name="name" value="John"><br>
            <input type="submit" value="Submit">
          </form>
    `

    return mainSection;
}