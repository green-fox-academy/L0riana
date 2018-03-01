public class String2 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    String text = "xyoxlkx is xyellxow";
    char remove = 'x';

    System.out.println(text);
    String newString = correctString(text, remove);
    System.out.println(newString);
  }

  public static String correctString(String text, char delete) {
    if (text.length() < 1)
      return text;
    if (text.charAt(0) == delete) {
      text = text.substring(1);
    }
    return text.charAt(0) + correctString(text.substring(1, text.length()), delete);
  }
}
