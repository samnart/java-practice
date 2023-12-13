// Rock Paper Scissors

// random choice from computer

function getComputerChoice() {
    let random;
    let choice;
    random = Math.floor(Math.random() * 30);

    if (random < 10) {
        choice = "rock";
    } else if (random <= 20) {
        choice = "paper";
    } else {
        choice = "scissors";
    }
    return choice;
}


// function to play one round of the game

function game(PlayerChoice, getComputerChoice) {

    let playerChoice;

    if (PlayerChoice.toLowerCase() === "rock") {
        playerChoice = "rock";
    } else if (PlayerChoice.toLowerCase() === "paper") {
        playerChoice = "paper";
    } else if (PlayerChoice.toLowerCase() === "scissors") {
        playerChoice = "scissors";
    } else {
        playerChoice = "default";
    }
    

    if (playerChoice === getComputerChoice) {
        console.log("It is a tie");
        return "It is a tie";
    } else if ((playerChoice === "rock" && getComputerChoice === "scissors") ||
    (playerChoice === "paper" && getComputerChoice === "rock") ||
    (playerChoice === "scissors" && getComputerChoice === "paper")) {
        console.log("You win this round!");
        return "You win this round!";
    } else {
        console.log("Computer wins this round!");
        return "Computer wins this round!";
    }
}


// a function that takes game() as input and plays five rounds of game

let PlayerChoice = "paper";

console.log(getComputerChoice());

game(PlayerChoice, getComputerChoice());



// player's choice