function getComputerChoice() {
  const choices = ["rock", "paper", "scissors"];
  const randomIndex = Math.floor(Math.random() * 3);
  return choices[randomIndex];
}

function playRound(playerChoice, computerChoice) {
  playerChoice = playerChoice.toLowerCase();
  computerChoice = computerChoice.toLowerCase();

  if (playerChoice === computerChoice) {
    return "It's a tie!";
  }

  if (
    (playerChoice === "rock" && computerChoice === "scissors") ||
    (playerChoice === "paper" && computerChoice === "rock") ||
    (playerChoice === "scissors" && computerChoice === "paper")
  ) {
    return "You win!";
  } else {
    return "You lose!";
  }
}

// function game() {
//     let playerScore = 0;
//     let computerScore = 0;

//     for (let i = 0; i < 5; i++) {
//         const playerChoice = prompt('Enter your choice: rock, paper, or scissors');
//         const computerChoice = getComputerChoice();
//         console.log('You chose: ' + playerChoice);
//         console.log('The computer chose: ' + computerChoice);
//         const roundResult = playRound(playerChoice, computerChoice);
//         console.log(roundResult);

//         if (roundResult === 'You win!') {
//             playerScore++;
//         } else if (roundResult === 'You lose!') {
//             computerScore++;
//         }
//     }

//     console.log('Final scores: You - ' + playerScore + ', Computer - ' + computerScore);

//     if (playerScore > computerScore) {
//         console.log('You won the game!');
//     } else if (playerScore < computerScore) {
//         console.log('You lost the game!');
//     } else {
//         console.log('The game was a tie!');
//     }
// }

// game();

const rockButton = document.getElementById("rock");
const paperButton = document.getElementById("paper");
const scissorButton = document.getElementById("scissors");

rockButton.addEventListener("click", () => {
  console.log(playRound("rock", getComputerChoice()));
});

paperButton.addEventListener("click", () => {
  console.log(playRound("paper", getComputerChoice()));
});

scissorButton.addEventListener("click", () => {
  console.log(playRound("scissors", getComputerChoice()));
});
