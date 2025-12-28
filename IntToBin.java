/** Returns the binary representation of a given integer. */
public class IntToBin {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("Binary representation of " + x + " is: " + toBinary(x));
    }

    public static String intToBin(int n) {
    if (n < 2) {
        return Integer.toString(n); 
    }
    return intToBin(n / 2) + (n % 2);
}
}