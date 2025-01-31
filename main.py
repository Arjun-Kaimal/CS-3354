from task_manager import TaskManager

def main():
    manager = TaskManager()
    manager.list_tasks()
    manager.add_task("Finish GitHub practice")
    manager.complete_task(1)

if __name__ == "__main__":
    main()
