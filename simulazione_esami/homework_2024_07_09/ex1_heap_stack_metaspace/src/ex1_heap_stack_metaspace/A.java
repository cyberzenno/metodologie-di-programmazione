package ex1_heap_stack_metaspace;

public abstract class A {
	static int instances;

	public A() {
		instances++;
	}

	abstract int getInstaces();
}