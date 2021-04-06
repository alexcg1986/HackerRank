class Solution {
	public static void main(String[] args) {
		Singleton s = Singleton.getSingleInstance();
		s.str = "Hello I am a singleton! Let me say hello world to you.";
		System.out.println(s.str);
	}
}

class Singleton {
	String str;

	final static Singleton s = new Singleton();

	private Singleton() {
	}


	static Singleton getSingleInstance() {
		return s;
	}
}