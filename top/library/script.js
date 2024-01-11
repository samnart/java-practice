const myLibrary = [];

function Books(title, author, pages, read) {
    this.title = title;
    this.author = author;
    this.pages = pages;
    this.read = read;
}

function addBookToLibrary(title, author, pages, read) {
    const newBook = new Books(title, author, pages, read);
    myLibrary.unshift(newBook);
    displayBooks();
}

function displayBooks() {
    const bookShelf = document.getElementById("bookShelf");
    bookShelf.innerHTML = "";


}