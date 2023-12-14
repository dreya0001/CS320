package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import task.Task;
import task.TaskService;

class TaskServiceTest {

	@Test
	public void testAddTaskSuccessfully() {
		TaskService taskService = new TaskService();
		Task testTask = new Task("123", "Sample Task", "Task Description");
		
		taskService.addTask(testTask);
		
		assertEquals(testTask, taskService.getTaskMap().get("123"));			
	}
	@Test
	public void testAddTaskWithDuplicateId() {
		TaskService taskService = new TaskService();
		Task testTask1 = new Task("123", "Sample Task", "Task Description");
		Task testTask2 = new Task("123", "Another Task", "Another description");
		
		taskService.addTask(testTask1);
		
		assertThrows(IllegalArgumentException.class, () -> {
			taskService.addTask(testTask2);
		});
	}
	@Test
	public void testDeleteTaskSuccessfully() {
		TaskService taskService = new TaskService();
		Task testTask = new Task("123", "Sample Task", "Task Description");
		
	assertThrows(IllegalArgumentException.class, () -> {
		taskService.deleteTask("NonExistentId");
	});
				
	}
	@Test
	public void testUpdateTaskName() {
		TaskService taskService = new TaskService();
		Task testTask = new Task("123", "Sample Task", "Task Description");
		taskService.addTask(testTask);
		
		taskService.updateTaskName("123", "Updated Task Name");
		
		assertEquals("Updated Task Name", taskService.getTaskMap().get("123").getName());
		assertEquals("Task Description", taskService.getTaskMap().get("123").getDescription());
	}
}
