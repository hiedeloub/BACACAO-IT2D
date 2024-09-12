package bacacao.it2d;

public class BACACAOIT2D {

    public static void main(String[] args) {
        
        Scanner input;
        input = new Scanner(System.in);
        
        import java.time.LocalDate;

public class Task
    private final String taskId;
    private final String taskName;
    private final String assignedTo;
    private final LocalDate dueDate;
    private final String priority;
    private final String status;

    public BACACAOIT2D(String taskId, String taskName, String assignedTo, LocalDate dueDate, String priority, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task ID: " + taskId + "\n" +
               "Task Name: " + taskName + "\n" +
               "Assigned To: " + assignedTo + "\n" +
               "Due Date: " + dueDate + "\n" +
               "Priority: " + priority + "\n" +
               "Status: " + status + "\n";
    }
}
