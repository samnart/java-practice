const myLibrary = [];

function Book(title, author, pages, read) {
    this.title = title;
    this.author = author;
    this.pages = pages;
    this.read = read;
}

Book.prototype.info = function() {
    return `${this.title} by ${this.author}, ${this.pages} pages, ${this.read} yet`;
}


function addBookToLibrary() {
    const title = prompt('Tittle of the book: ');
    const author = prompt('Who is the author: ');
    const pages = prompt('How many pages does the book have: ');
    const read = prompt('Read or Not Read: ');

    const newBook = new Book(title, author, pages, read);
    
    myLibrary.unshift(newBook);

    console.log(myLibrary);
}

addBookToLibrary();