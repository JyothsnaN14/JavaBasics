package basic;

public class Assignment103_JVMMemory {
	// Filename: Assignment103_JVMMemory.java


	    // Static variable -> Stored in Method Area (Metaspace)
	    static int objectCount = 0;

	    // Instance(Global variable which is non static) variable -> Stored in Heap
	    int id;

	    // Constructor
	    public Assignment103_JVMMemory(int id) {
	        this.id = id;
	        objectCount++;
	    }

	    // Method demonstrating Stack + Heap usage
	    void display() {
	        // Local variable -> Stored in Stack
	        String message = "Object ID: " + id;

	        // 'message' reference is in Stack, actual String object is in Heap
	        System.out.println(message);
	    }

	    public static void main(String[] args) {
	        // Stack frame for main() is created here
	        System.out.println("=== JVM Memory Demonstration ===");

	        // Object references are on Stack, but objects themselves go into Heap
	        Assignment103_JVMMemory obj1 = new Assignment103_JVMMemory(1);
	        Assignment103_JVMMemory obj2 = new Assignment103_JVMMemory(2);

	        // Method calls create new stack frames
	        obj1.display();
	        obj2.display();

	        // Access static variable -> From Method Area
	        System.out.println("Total objects created: " + objectCount);

	        // PC Register:
	        // Internally tracks which instruction (line) is being executed
	        System.out.println("Program execution completed!");
	    }
	}


