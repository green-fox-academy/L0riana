public class exercise12 {
    public static void main(String[] args) {

        double a = 20;
        double b = 30;
        double c = 40;

        double surfaceArea =  2*(a*b+a*c+b*c);
        double volume = a*b*c;

        int i = (int)surfaceArea;
        int j = (int)volume;

        System.out.println("Surface area: " + i);
        System.out.println("Volume: " + j);
    }
}
