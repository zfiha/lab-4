public class GcdLcm {
        public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b); // Using GCD to calculate LCM
    }

    public static void main(String[] args) {
        int num1 = 12, num2 = 18;

                int gcdValue = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdValue);

                int lcmValue = lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmValue);
    }
}