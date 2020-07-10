export{
    createNavBar
}

const createNavBar = () => {
    const navBar = document.createElement("nav");
    navBar.classList.add('nav')
    navBar.innerHTML = `
    <nav>
    <ul>
    <li>
        <a href="index.html">Home</a>
    </li>
    </ul>
</nav>
`
return navBar;
}