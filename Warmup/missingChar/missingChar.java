class Main {
    public static void main(String[] args) {
        missingChar str = new missingChar();
        System.out.println(str.missingchar("dogs", 1));
    }
}

public class missingChar {
    public String missingchar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n+1, str.length());
        return front + back;
    }
}