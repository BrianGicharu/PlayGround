package mainpackage;

public abstract class AbstractClass {
	private static Integer hash;
	
	AbstractClass(){
		hash = this.hashCode();
	}
	
	public static Integer getHash() {
		return  hash;
	}
	
	public static void setHash(Integer h) {
		hash = h;
	}
}
