package ex1_heap_stack_metaspace;

public class B extends A {
	int instances;

	public B() {
		instances++;
	}

	@Override
	int getInstaces() {
		return super.instances + this.instances;
	}
}

