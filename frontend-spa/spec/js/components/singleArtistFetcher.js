export {
    fetchSingleArtist, 
    addNewArtist,
    addNewAlbum,
    addNewSong
}

const fetchSingleArtist = async () => {
    return fetch('http://localhost:8080/api/artists/${artistName}/') 
                .then(response => response.json())          
}

const addNewArtist = async (artist) => {
    return fetch('http://localhost:8080/api/artists/add', {
        method: "POST", 
        headers: {
            "Content-Type": "application/json"
        }, 
        body: JSON.stringify(artist)
    }).then(response => response.json())
}

const addNewAlbum = async (album) => {
    return fetch('http://localhost:8080/api/albums/add', {
        method: "POST", 
        headers: {
            "Content-Type": "application/json"
        }, 
        body: JSON.stringify(album)
    }).then(response => response.json())
}

const addNewSong = async (song) => {
    return fetch('http://localhost:8080/api/songs/add', {
        method: "POST", 
        headers: {
            "Content-Type": "application/json"
        }, 
        body: JSON.stringify(song)
    }).then(response => response.json())
}