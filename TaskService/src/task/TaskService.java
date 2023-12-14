package task;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
	private Map<String, Task> taskMap;
	
	public TaskService() {
		this.taskMap = new HashMap<>();
	}
	public void addTask( Task task) {
		
		if (taskMap.containsKey(task.getTaskId())) {
			throw new IllegalArgumentException("Task with ID " + task.getTaskId() + " already exists.");
		}
		taskMap.put(task.getTaskId(), task);
	}
	
	public void deleteTask(String taskId) {
		
		if(!taskMap.containsKey(taskId)) {
			throw new IllegalArgumentException("Task with ID " + taskId + "does not exist");
		}
		taskMap.remove(taskId);
	}
	
	public void updateTaskName(String taskId, String newName) {
		
		if (!taskMap.containsKey(taskId)) {
			throw new IllegalArgumentException("Task with ID" + taskId +  " does not exist.");
		}
		Task task = taskMap.get(taskId);
		task.setName(newName);
	}
	public void updateTaskDescription(String taskId, String newDescription) {
		
		if(!taskMap.containsKey(taskId)) {
			throw new IllegalArgumentException("Task with ID" + taskId + "does not exist");
		}
		Task task = taskMap.get(taskId);
		task.setDescription(newDescription);
	}
	public Map<String, Task> getTaskMap() {
		return taskMap;
	}
}
