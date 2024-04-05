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

  myLibrary.forEach((book, index) => {
    const bookCard = document.createElement("div");
    bookCard.classList.add("book-card");

    bookCard.innerHTML = `
        <p></p>
        <p></p>
        <p></p>
        <button></button>
        <button></button>
        `;
    bookShelf.appendChild(bookCard);
  });
}

function submitForm() {}

function removeBook() {}

function toggleReadStatus() {}
