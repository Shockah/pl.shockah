package pl.shockah;

public class Box<T> {
	protected T value;
	
	public Box() {this(null);}
	public Box(T t) {
		value = t;
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Box<?>)) return false;
		Box<?> b = (Box<?>)o;
		return Util.equals(value,b.value);
	}
	
	public String toString() {
		return "[Box: "+value+"]";
	}
	
	public T get() {return value;}
	public void set(T t) {value = t;}
}