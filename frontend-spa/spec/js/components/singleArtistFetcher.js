export {
    fetchSingleArtist
}

const fetchSingleArtist = async () => {
    return fetch('http://localhost:8080/api/artists/${artistName}/') 
                .then(response => response.json())       
    
}