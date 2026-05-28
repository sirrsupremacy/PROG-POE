public class Task { 
    private String taskName; 
    private int taskNumber; 
    private String taskDescription; 
    private String developerDetails; 
    private int taskDuration; 
    private String taskID; 
    private String taskStatus; 
 
    public Task(String name, int num, String desc, String dev, int duration, String status) { 
        this.taskName = name; 
        this.taskNumber = num; 
        this.taskDescription = desc; 
        this.developerDetails = dev; 
        this.taskDuration = duration; 
        this.taskStatus = status; 
        this.taskID = createTaskID(); 
    } 
 
    public boolean checkTaskDescription() { 
        return this.taskDescription.length() <= 50; 
    } 
 
    public String createTaskID() { 
        String namePart = taskName.substring(0, 2).toUpperCase(); 
        String devPart = developerDetails.substring(developerDetails.length() - 3).toUpperCase(); 
        return namePart + ":" + taskNumber + ":" + devPart; 
    } 
 
    public String printTaskDetails() { 
        return "Task Status: " + taskStatus + 
               "\nDeveloper Details: " + developerDetails + 
               "\nTask Number: " + taskNumber + 
               "\nTask Name: " + taskName + 
               "\nTask Description: " + taskDescription + 
               "\nTask ID: " + taskID + 
               "\nDuration: " + taskDuration + "hrs"; 
    } 
 
    public int getTaskDuration() { 
        return taskDuration; 
    } 
} 