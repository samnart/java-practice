const taskInput = document.getElementById("taskInput");
const addButton = document.getElementById("addButton");
const taskList = document.getElementById("taskList");

addButton.addEventListener("click", addTask);

function addTask() {
  const taskText = taskInput.value.trim();

  if (taskText != "") {
    const taskItem = document.createElement("li");
    taskItem.textContent = taskText;

    taskList.appendChild(taskItem);

    taskInput.value = "";
  } else {
    alert("Please enter a valid task!");
  }
}
