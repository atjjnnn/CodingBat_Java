
class Main {
	public static void main(String[] args) {
		notString str = new notString();
		System.out.println(str.NotString("George"));
	}
}

public class notString{
	public String NotString(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
			return str;
		}
		return "not " + str;
	}
}
