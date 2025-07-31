const apiUrl = 'http://localhost:8080/api/todos';

async function addTask() {
  const taskInput = document.getElementById('taskInput');
  const taskText = taskInput.value;

  if (!taskText) return;

  const response = await fetch(apiUrl, {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify({ title: taskText })
  });

  if (response.ok) {
    taskInput.value = '';
    fetchTasks();
  }
}

async function fetchTasks() {
  const response = await fetch(apiUrl);
  const tasks = await response.json();

  const taskList = document.getElementById('taskList');
  taskList.innerHTML = '';

  tasks.forEach(task => {
    const li = document.createElement('li');
    li.innerText = task.title;
    taskList.appendChild(li);
  });
}

window.onload = fetchTasks;
