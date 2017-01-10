import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.model.TestClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TaskTester {

    public static void main(String[] args) throws IOException {
        menu();
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Task Number(range:1..8):");
        switch (scanner.nextInt()) {
            case 1:
                Task1_Linear_instructions task1 = new Task1_Linear_instructions();
                System.out.println(task1.compute());
                menu();
                break;
            default:{
                System.out.println("ERROR");
                menu();
            }
        }
    }
}
