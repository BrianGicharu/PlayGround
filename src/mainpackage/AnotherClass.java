package mainpackage;

public class AnotherClass {
	private static Integer hash;

	public AnotherClass() {
		hash = this.hashCode();
	}

	public static void setHash(Integer h) {
		hash = h;
	}
	
	public static Integer getHash() {
		return hash;
	}
}
