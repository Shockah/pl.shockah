package pl.shockah;

public final class Strings {
	public static String implode(Object[] objs, String separator) {
		return implode(objs,separator,0,objs.length-1);
	}
	public static String implode(Object[] objs, String separator, int start) {
		return implode(objs,separator,start,objs.length-1);
	}
	public static String implode(Object[] objs, String separator, int start, int end) {
		StringBuilder sb = new StringBuilder();
		for (int i = start; i <= end; i++) {
			if (i != start) sb.append(separator);
			sb.append(objs[i]);
		}
		return sb.toString();
	}
}