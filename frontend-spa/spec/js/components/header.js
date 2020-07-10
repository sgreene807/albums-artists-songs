export{
    createHeader
}

const createHeader = () => {
    const header = document.createElement("header");
    header.classList.add('header');
    header.innerHTML = '<strong>Fab Five of Pop</strong>'
    return header;
}