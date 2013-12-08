package pl.shockah;

public class BoxP<T> {
	protected T value;
	
	public BoxP() {this(null);}
	public BoxP(T t) {
		value = t;
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof BoxP<?>)) return false;
		BoxP<?> b = (BoxP<?>)o;
		return Util.equals(value,b.value);
	}
	
	public String toString() {
		return "[BoxP: "+value+"]";
	}
	
	public T get() {return value;}
	public void set(T t) {value = t;}
}