package pl.shockah;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import pl.shockah.func.Func1;

public final class Lists {
	public static <T> boolean remove(List<T> list, Func1<T, Boolean> filter) {
		int oldSize = list.size();
		Iterator<T> it = list.iterator();
		while (it.hasNext())
			if (filter.f(it.next()))
				it.remove();
		return list.size() != oldSize;
	}
	
	public static <T> List<T> find(List<T> list, Func1<T, Boolean> filter) {
		List<T> ret = new LinkedList<>();
		for (T t : list)
			if (filter.f(t))
				ret.add(t);
		return ret;
	}
	
	@SuppressWarnings("unchecked")
	public static <K, V> List<V> sublist(List<K> list, Class<V> cls) {
		List<V> ret = new LinkedList<>();
		for (Object o : list)
			if (o != null && cls.isAssignableFrom(o.getClass()))
				ret.add((V)o);
		return ret;
	}
	
	@SuppressWarnings("unchecked")
	public static <K> List<K> as(List<?> list, Class<K> cls) {
		return (List<K>)list;
	}
}