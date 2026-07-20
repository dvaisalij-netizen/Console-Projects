public class User{
    String username;
    String password;
    Task[] listOfTasks = new Task[10];

    public boolean createTask(String name, String description) {
        Task task = new Task();
        task.createOrUpdateTask(name, description);
        for (int i = 0; i < this.listOfTasks.length; i++) {
            if (this.listOfTasks[i] == null) {
                this.listOfTasks[i] = task;
                return true;
            }
        }
        return false;
    }

}