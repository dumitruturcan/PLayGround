import java.util.Scanner;

public class Task1_Linear_instructions {

    private Double x;

    public Task1_Linear_instructions(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x value (range 1..maxDouble)\nx=");
        this.x = scanner.nextDouble();
    }

    public Double compute() {
        return (Math.sin(x) + (2 * x)) / (Math.pow(x, 3) - (x * 2));
    }
}
