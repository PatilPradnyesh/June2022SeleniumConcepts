package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	//AAA in unit test
	//Arrange, Act, and Assert
	
	//Instead of creating dependancy we can create one generic method
	public void createTheUser() {
		System.out.println("Create User");
	}

	@Test
	public void createUser() {
		createTheUser();
		System.out.println("CreateUser");
		//int a=9/0;
	}
	
	/*
	//Bad Practice to create dependancy because the main method failed then other methods got skipped
	@Test(dependsOnMethods = "createUser")
	public void updateUser() {
		System.out.println("UpdateUser");
	}
	
	@Test(dependsOnMethods = "createUser")
	public void deleteUser() {
		System.out.println("DeleteUser");
	}
	*/
	
	@Test(dependsOnMethods = "createUser")
	public void updateUser() {
		createTheUser();
		System.out.println("UpdateUser");
	}
	
	@Test(dependsOnMethods = "createUser")
	public void deleteUser() {
		createTheUser();
		System.out.println("DeleteUser");
	}
}
