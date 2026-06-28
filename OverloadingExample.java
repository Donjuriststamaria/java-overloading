public class OverloadingExample {

    // Method that adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method that adds three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method that adds two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Create an object of OverloadingExample
        OverloadingExample obj = new OverloadingExample();

        // Call each overloaded method
        int sum1 = obj.add(10, 20);
        int sum2 = obj.add(10, 20, 30);
        double sum3 = obj.add(10.5, 20.5);

        // Display results
        System.out.println("Sum of 2 integers: " + sum1);
        System.out.println("Sum of 3 integers: " + sum2);
        System.out.println("Sum of 2 doubles: " + sum3);
    }
}

/*
Explanation:
Method overloading allows multiple methods with the same name to be carried out. 
Depending on what you want to do with it. This way we don't have to make multiple methods. 
This makes the code more efficient and cleaner.
*/
