package utils;

public enum TestScenario {

	T1("User add item"),
	T2("User checkout");
	
	private String testName;
	private TestScenario(String value) {
		// TODO Auto-generated constructor stub
	testName=value;
	}
	
	public String getTestName() {
		return testName;
	}
}
