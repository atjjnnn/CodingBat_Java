
class Main {
	public static void main(String[] args) {
		notString str = new notString();
		str.NotString("not");
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
