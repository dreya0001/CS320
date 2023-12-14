package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import task.Task;

class TaskTest {

	@Test
	public void testTaskCreationSuccessfully() {
		Task testTask = new Task("123", "Sample Task", "Task description");
		
		assertEquals("123", testTask.getTaskId());
		assertEquals("Sample Task", testTask.getName());
		assertEquals("Task description", testTask.getDescription());
	}
	
	@Test
	public void testTaskNewUpdate() {
		Task testTask = new Task("123", "Sample Task", "Task description");
		
		assertEquals("Sample Task", testTask.getName());
		testTask.setName("Updated Task Name");
		assertEquals("Updated Task Name", testTask.getName());
	}
	@Test
	public void testTaskDescriptionUpdate() {
		Task testTask = new Task("123", "Sample Task", "Task description");
		
		assertEquals("Task description", testTask.getDescription());
		testTask.setDescription("Updated Task Description");
		assertEquals("Updated Task Description", testTask.getDescription());
	}
	@Test
	public void testTaskIdNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Task Name", "Task Description");
		});
	}
	@Test
	public void testNameNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Task", null, "Task Description");
		});
	}
	@Test
	public void testDescriptionNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Task", "Task Name", null);
		});
	}
}
