import json
from utils import load_tasks, save_tasks

class TaskManager:
    def __init__(self):
        self.tasks = load_tasks()
    
    def list_tasks(self):
        for i, task in enumerate(self.tasks, 1):
            status = "[x]" if task["completed"] else "[ ]"
            print(f"{i}. {status} {task['name']}")
    
    def add_task(self, task_name):
        self.tasks.append({"name": task_name, "completed": False})
        save_tasks(self.tasks)
    
    def complete_task(self, task_number):
        if 0 < task_number <= len(self.tasks):
            self.tasks[task_number - 1]["completed"] = True
            save_tasks(self.tasks)