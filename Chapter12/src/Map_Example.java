import java.util.HashMap;

public class Map_Example {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "Ram");
		System.out.println();
		h.put(2, "Raj");
		h.put(3, "Tom");
		System.out.println("adding 3 String " + h);
		h.remove(1);
		System.out.println("remove 1 String" + h);
		h.put(2, "Taj");
		System.out.println("update 1 string" + h);
		System.out.println(h.containsKey(2) + "  " + "Search ");

	}
}
