public class Printer {
// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...
        public static void main(String[] args){
            printer("apple", "monkey", "dog", "rabbit");
        }
        static void printer(String...words){
            System.out.print("printer(");
            for (String word : words) {
                System.out.print("\"" + word + "\", ");
            }
            System.out.print(")");
        }
}
