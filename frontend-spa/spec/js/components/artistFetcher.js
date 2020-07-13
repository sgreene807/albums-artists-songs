export {
    fetchArtist
}

const fetchArtist = async () => {
    return fetch('http://localhost:8080/api/artists') 
                .then(response => response.json())       
    
}