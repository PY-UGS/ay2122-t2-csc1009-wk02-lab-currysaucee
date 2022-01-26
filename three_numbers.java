import java.util.*;
import java.util.Scanner;

public class three_numbers {
    public static void main(String[] args) {
        int count = 3;
        Scanner scan = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<String>();

        System.out.print("Please input in 3 numbers:");
        String[] temp = scan.nextLine().split(" ");
        if (temp.length != 3){
            count -= temp.length;
            input.add(temp[0]);
            for (int index = 0; index<count; index++){
                String single_temp = scan.nextLine();
                input.add(single_temp);
            }
        }

        if (temp.length == 3){
            for (int index=0; index<3; index++){
                input.add(temp[index]);
            }
        }

        System.out.print(input.get(0) + " " + input.get(1) + " " + input.get(2));
        System.out.println(" , the average is: " + (Float.parseFloat(input.get(0)) + Float.parseFloat(input.get(1)) + Float.parseFloat(input.get(2))) / 3);
        scan.close();
    }    
}
