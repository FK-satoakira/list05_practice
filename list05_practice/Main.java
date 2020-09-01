package list05_practice;

import static list05_practice.KeyType.*; /*この記述を忘れがちになるので注意。import無しなら KeyType.PADLOCKと記述しなければならない*/

public class Main {

	public static void main(String[] args) {
		StrongBox<Hero> s = new StrongBox<Hero>(DIAL); /*ここの「DIAL」注意。	import無しなら 「KeyType.DIAL」と記述。*/
		Hero h = new Hero();
		s.put(h);
//		s.put("s");         StrongBox<Hero>をStrongBox<String>にしても成功。
		System.out.println("h="+h);
		System.out.println("s.get()"+s.get());
		System.out.println("s.get()"+s.get());
		System.out.println("s.get()"+s.get());
		System.out.println("s.get()"+s.get());
		System.out.println("s.get()"+s.get());
		System.out.println("s.get()"+s.get());
		System.out.println("s.get()"+s.get());
		System.out.println("s.get()"+s.get());
		System.out.println("s.get()"+s.get());
		System.out.println("s.get()"+s.get());
		System.out.println("s.get()"+s.get());
		System.out.println("s.get()"+s.get());

		System.out.println("count="+s.getCount());
	}

}
