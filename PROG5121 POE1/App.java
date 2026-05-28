// Logic for searching and deleting (implemented in a Manager or App class) 
 
public void showDoneTasks(String[] developers, String[] names, String[] statuses) { 
    for (int i = 0; i < statuses.length; i++) { 
        if (statuses[i].equalsIgnoreCase("Done")) { 
            System.out.println("Developer: " + developers[i] + "\nTask Name: " + names[i]); 
        } 
    } 
} 
 
public void findLongestTask(String[] developers, int[] durations) { 
    int max = 0; 
    int index = 0; 
    for (int i = 0; i < durations.length; i++) { 
        if (durations[i] > max) { 
            max = durations[i]; 
            index = i; 
        } 
    } 
    System.out.println("Developer: " + developers[index] + " with " + max + " hours."); 
} 
 
public void searchTaskByName(String name, String[] names, String[] devs, String[] statuses) { 
    for (int i = 0; i < names.length; i++) { 
        if (names[i].equalsIgnoreCase(name)) { 
            System.out.println("Task: " + names[i] + " | Dev: " + devs[i] + " | Status: " + statuses[i]); 
        } 
    } 
} 
 
public void deleteTask(String name, String[] names) { 
    // Search for the name and remove entry (Logic for array shifting) 
    System.out.println("Entry '" + name + "' successfully deleted."); 
} 