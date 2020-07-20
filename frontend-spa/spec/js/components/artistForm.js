export {
    createArtistForm
}

import{
    addNewArtist
} from "./singleArtistFetcher.js"

import { 
    createArtistSection 
} from "./artistSection.js";


function createArtistForm(element){
    const nameInput = document.createElement('input');
    nameInput.type='text';
    nameInput.placeholder = 'Enter new artist name';
    nameInput.classList.add('artist-label');
    element.append(nameInput);
    const imageInput = document.createElement('input');
    imageInput.type='text';
    imageInput.placeholder = 'Enter image';
    imageInput.classList.add('artist-label');
    element.append(imageInput);
    const genreInput = document.createElement('input');
    genreInput.type='text';
    genreInput.placeholder = 'Enter genre';
    genreInput.classList.add('artist-label');
    element.append(genreInput);
    const recordLabelInput = document.createElement('input');
    recordLabelInput.type='text';
    recordLabelInput.placeholder = 'Enter record label';
    recordLabelInput.classList.add('artist-label');
    element.append(recordLabelInput);
    const descriptionInput = document.createElement('input');
    descriptionInput.type='text';
    descriptionInput.placeholder = 'Enter description';
    descriptionInput.classList.add('artist-label');
    element.append(descriptionInput);
    const submitButton = document.createElement('button');
    submitButton.innerText = "Submit New Artist";
    submitButton.classList.add('artist-submit');
    element.append(submitButton);

    submitButton.addEventListener('click', () => {
        const artist = {
            "name": nameInput.value,
            "image": imageInput.value, 
            "genre": genreInput.value,
            "recordLabel": recordLabelInput.value,
            "description": descriptionInput.value 
        }
         addNewArtist(artist) 
        .then(artists=>{
            createArtistSection(element, artists)
        })
})
}