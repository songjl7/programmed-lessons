public class Task{
    private String desc;
    private String dueDate;
    private boolean done;
    private int priority;

    public Task(){
        this.desc = "Untitled Task";
        this.dueDate = "1/1/99";
        this.done = false;
        this.priority = 3;
    }

    public Task(String desc, String dueDate, boolean done, int priority){
        this.desc = desc;
        this.dueDate = dueDate;
        this.done = done;
        this.priority = priority;
    }

    public String toString(){
        return "[Task Description: " + desc + "\tDue date: " + dueDate + "\tDone? " + done + "\tPriority: " + priority + "]";
    }
}