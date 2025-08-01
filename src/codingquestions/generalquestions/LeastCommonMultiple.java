package codingquestions.generalquestions;

public class LeastCommonMultiple {

    public static void main(String[] args) {
        System.out.println(lcm(4, 6));
    }

    // time complexity: O(n) Space complexity: O(1)
    public static int lcm(int a, int b) {
        int max = Math.max(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max;
            }
            max++;
        }
    }

    // time complexity: O(log(min(a,b))) Space complexity: O(1)
    public static int efficientwayLcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // time complexity: O(log(min(a,b))) Space complexity: O(1)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
