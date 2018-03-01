public class String1 {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

    String text = "xolk is xellow";
    char from = 'x';
    char to = 'y';

    System.out.println(text);
    String newString = correctString(text, from, to);
    System.out.println(newString);
  }

  public static String correctString(String text, char from, char to) {
    if (text.length() == 0)
      return text;
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == from) {
        text = text.substring(0, i) + to + text.substring(++i);
        return correctString(text, from, to);
      }
    }
    return text;
  }
}
