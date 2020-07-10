export {
    createFooter
}

const createFooter = () => {
    const footer = document.createElement("footer");
    footer.classList.add('footer');
    footer.innerHTML = '<h5 id="fab-five">Fab Five | 2020</h5>'
    return footer;
}