package task;

public class Task {
	private String taskId;
	private String name;
	private String description;
	
	public Task(String taskId, String name, String description) {

		if(taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException("Task ID must not be null and cannot be longer than 10 characters");
		}
	
		this.taskId = taskId;
		
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Name must not be null and cannot be longer than 20 characters");
		}
	
		this.name = name;
		
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Description must not be null and cannot be longer than 50 characters");
		}
	
		this.description = description;	
}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Entered information are [taskId is " + taskId + ", name is " + name + "The description is" + description +"]";
		
	}
}

