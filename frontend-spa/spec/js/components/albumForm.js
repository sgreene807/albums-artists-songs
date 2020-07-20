export {
    createAlbumForm
}

import{
    addNewAlbum
} from "./singleArtistFetcher.js"

import { 
    createAlbumSection 
} from "./albumSection.js";


function createAlbumForm(element){
    const titleInput = document.createElement('input');
    titleInput.type='text';
    titleInput.placeholder = 'Enter new album';
    titleInput.classList.add('artist-label');
    element.append(titleInput);
    const imageInput = document.createElement('input');
    imageInput.type='text';
    imageInput.placeholder = 'Enter image';
    imageInput.classList.add('artist-label');
    element.append(imageInput);
    const recordLabelInput = document.createElement('input');
    recordLabelInput.type='text';
    recordLabelInput.placeholder = 'Enter record label';
    recordLabelInput.classList.add('artist-label');
    element.append(recordLabelInput);
    const submitButton = document.createElement('button');
    submitButton.innerText = "Submit New Album";
    submitButton.classList.add('artist-submit');
    element.append(submitButton);

    submitButton.addEventListener('click', () => {
        const album = {
            "title": titleInput.value,
            "image": imageInput.value, 
            "recordLabel": recordLabelInput.value, 
        }
         addNewAlbum(album) 
        .then(albums=>{
            createAlbumSection(element, album)
        })
})
}