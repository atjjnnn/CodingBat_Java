public String frontBack(String str) {
  if (str.length() <= 1) {
    return str;
  }
  String front = str.substring(0, 1);
  String middle = str.substring(1, str.length()-1);
  String back = str.substring(str.length()-1);
  return back + middle + front;
}
