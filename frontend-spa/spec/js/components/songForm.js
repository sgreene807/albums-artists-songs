export {
    createSongForm
}

import{
    addNewSong
} from "./singleArtistFetcher.js"

import { 
    createSongSection 
} from "./songSection.js";


function createSongForm(element){
    const titleInput = document.createElement('input');
    titleInput.type='text';
    titleInput.placeholder = 'Enter new song title';
    titleInput.classList.add('artist-label');
    element.append(titleInput);
    const linkInput = document.createElement('input');
    linkInput.type='text';
    linkInput.placeholder = 'Enter link';
    linkInput.classList.add('artist-label');
    element.append(linkInput);
    const durationInput = document.createElement('input');
    durationInput.type='text';
    durationInput.placeholder = 'Enter duration';
    durationInput.classList.add('artist-label');
    element.append(durationInput);
    const submitButton = document.createElement('button');
    submitButton.innerText = "Submit New Song";
    submitButton.classList.add('artist-submit');
    element.append(submitButton);

    submitButton.addEventListener('click', () => {
        const song = {
            "title": titleInput.value,
            "link": linkInput.value, 
            "duration": durationInput.value,
        }
         addNewSong(song) 
        .then(songs=>{
            createSongSection(element, songs)
        })
})
}