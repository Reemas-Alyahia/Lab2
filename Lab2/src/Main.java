import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------");
        // 1.Write a program to find all of the longest word in a given dictionary.
//        "cat", "dog", "red", "is", "am" } Expected
//        ArrayList<String> name = new ArrayList<>();
//        name.add("cat");   name.add("red");  name.add("dog");  name.add("is");  name.add("am");
//     ArrayList<String> longw= new ArrayList<>();
//              int max = 0;
//
//                for (String word : name) {
//                    if (word.length() > max) {
//                        max = word.length(); }}
//
//                for (String word : name) {
//                    if (word.length() == max) {
//                        longw.add(word);} }
//        System.out.println(longw);
        System.out.println("---------------------------");

//Write a program that displays the number of occurrences of an element in the array
//        int [] num = new int[10];
//        int [] count = new int[10];
//        int i,temp = 0;
//
//        for(i=0; i < num.length; i++){
//            System.out.println("Enter any number and 0 to quite : ");
//            num[i] = input.nextInt();
//            //expected input will end when user enters zero
//            if(num[i] == 0){
//                break;
//            }
//        }//end of for loop
//        for(i = 0; i < num.length; i++){
//            temp = num[i];
//            count[temp]++;
//        }//end of for looop
//
//        for(i=1; i < count.length; i++){
//
//            if(count[i] > 0 && count[i] == 1){
//                System.out.println(i+" occurs "+" time"+count[i]);
//            }
//            else if(count[i] >=2){
//                System.out.println(i+"occurs "+"time"+count[i]);
//            }
//        }

        System.out.println("--------------------------");
        //  Write a program to find the k largest elements in a given array.
        //  Elements in the array can be in any order.
//        System.out.print("Enter number: ");
//        int m=input.nextInt();
//        ArrayList<Integer> number=new ArrayList<>();
//        number.add(1); number.add(4); number.add(17); number.add(100);
//        number.add(3); number.add(25); number.add(7);
//        ArrayList<Integer> nn=new ArrayList<>();
//        for (int n:number){
//           if(n>m){  nn.add(n);}}
//        System.out.println(nn);
        System.out.println("--------------------------");
//        int[] num = {1, 2, 3, 4, 5};
//        System.out.println("Original Array: " + Arrays.toString(num));
//        reverse(num);
//        System.out.println("Reversed Array: " + Arrays.toString(num));
        System.out.println("--------------------------");
//        int[] arr = null; // Initialize as null
//        int L = 0; // Length of the array
//
//        while (true) {
///           System.out.print("Choose an option: ");
//            System.out.println("1. Accept elements of an array ");
//            System.out.println("2. Display elements of an array ");
//            System.out.println("3. Search the element within the array ");
//            System.out.println("4. Sort the array");
//            System.out.println("5. Stop");
//            int choices = input.nextInt();
//
//            switch (choices) {
//                case 1:
//                    System.out.print("Enter the size for your array: ");
//                    L = input.nextInt();
//                    arr = new int[L];
//                    System.out.println("Enter elements of the array:");
//                    for (int i = 0; i < L; i++) {
//                        arr[i] = input.nextInt();
//                    }
//                    break;
//
//                case 2:
//                    if (arr != null) {
//                        System.out.println("The elements of the array are: " + Arrays.toString(arr));
//                    } else {
//                        System.out.println("There is nothing to display. Please enter elements first.");
//                    }
//                    break;
//
//                case 3:
//                    if (arr != null) {
//                        System.out.print("Enter the element you want to search for: ");
//                        int search = input.nextInt();
//                        boolean found = false;
//                        for (int a : arr) {
//                            if (a == search) {
//                                System.out.println("Element " + search + " found in the array.");
//                                found = true;
//                                break;
//                            }
//                        }
//                        if (!found) {
//                            System.out.println("Element " + search + " not found in the array.");}}
//                    else { System.out.println("There is nothing to search. Please enter elements first.");
//                    }
//                    break;
//
//                case 4:
//                    if (arr != null) {
//                        Arrays.sort(arr);
//                        System.out.println("The sorted array is: " + Arrays.toString(arr));
//                    } else {
//                        System.out.println("There is nothing to sort. Please enter elements first.");
//                    }
//                    break;
//
//                case 5:
//                    System.out.println("Exit ");
//                    input.close();
//                    return;
//
//                default:
//                    System.out.println("Please enter a number from 1 to 5.");
//            }
//    }
        System.out.println("-----------------------------------");
        //Create a method that generates a random number within a given range. Allow the user to
        //specify the range and call the method to display random numbers.
//        System.out.println(" Enter the minimum value of the range: ");
//        int min=input.nextInt();
//        System.out.println("Enter the maximum value of the range:");
//        int max=input.nextInt();
//        random(min,max);
        System.out.println("---------------------------------");
//        Write a program that checks the strength of a password. Create a method that evaluates a
//        password based on criteria like length, inclusion of special characters, and
//        uppercase/lowercase letters.
//        System.out.println("Enter your password :");
//        String pass=input.nextLine();
//        int totalScore=checkLength(pass)+checkSpecialCharacters(pass)+checkUpperCaseLowerCase(pass);
//        if(totalScore>=8){
//            System.out.println("Strong password! ");
//        }
//        else if(totalScore>=6){
//            System.out.println("Moderately strong");
//        } else System.out.println("weak passwords");

                System.out.println("---------------------------------");
        //Create a method that generates the Fibonacci sequence up to a specified number of terms.
        //Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
        //and each subsequent number in the sequence is the sum of the two preceding ones.
//        System.out.println("Enter number for the Fibonacci sequence");
//        int fibo=input.nextInt();
//        Fibonacci(fibo);
    }/////////min^

//    public static int checkLength(String pass){
//            //Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters
//            //(3 points).
//            if(pass.length()>=8){return 3;} else if (pass.length()>=6) {return 2;}
//            else {return 0;}
//        }
//    public static int checkSpecialCharacters(String password) {
//        String cha = "=+[]{}&*()-_!@#$%^";
//        //Special characters: Absence (0 points), Presence (2 points)
//        for (char c : password.toCharArray()) { //تعريفها ترجع أحرف الـ String الذي قام باستدعائها كمصفوفة نوعها char.
//            if (cha.indexOf(c) != -1) {
//                return 2; }}//هنا اتاكد من المصفوفه هل فيها سبيشل او لا
//        return 0; //ادا تم التحقق انه لا يوجد اي سبيشل يرجع صفر
//    }
//    public static int checkUpperCaseLowerCase(String password) {
//         boolean lower= false; boolean Upper =false;

//
//        for (char c : password.toCharArray()) {
//            if (Character.isUpperCase(c)) { Upper = true;}
//            else if (Character.isLowerCase(c)) { lower = true; }
//        }
//
//        if (lower && Upper) {
//            return 3; }
//        return 0; }
//




    //    public static int count(int[] numbers)
//    {
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++){
//
//            int cn = numbers[i];;
//            if (cn == numbers[i])
//            {count++;}
//        }
//
//        return count;
//    }
    //public static void Fibonacci(int number) {

//        int first = 0; // قانون
//        int second = 1; // قانون
//
//        System.out.println("Fibonacci  " + number);
//        for (int i = 0; i < number; i++) { //
//            System.out.print(first + " "); // عشان التكرار راح اترك السطر جوا اللوب
//
//            // ابدا احسب هنا
//            int next = first + second;
//            first = second; // احدث القيمه الاوليه الي كانت صفر
//            second = next; // احدث القيمه الثانيه بالقيمه المخزنه في ىيكست
//        }
//        System.out.println();
//    }


    //
    //    public static void Fibonacci(int number) {
    //        if (number <= 0) { // Check for positive numbers
    //            System.out.println("Please enter a positive number.");
    //            return; // Exit the method if the input is not valid
    //        }
    //
    //        int first = 0; // First Fibonacci number
    //        int second = 1; // Second Fibonacci number
    //
    //        System.out.println("Fibonacci sequence with " + number + " terms:");
    //        for (int i = 0; i < number; i++) { // Loop through the number of terms
    //            System.out.print(first + " "); // Print the current Fibonacci number
    //
    //            // Calculate the next Fibonacci number
    //            int next = first + second;
    //            first = second; // Update first to the second
    //            second = next; // Update second to the next number
    //        }
    //        System.out.println(); // New line after printing all terms
    //    }
    //}

//    public static void random(int min, int max) {
//        Random ran = new Random();
//        System.out.println("random numbers between " + min + " to " + max + ":");
//
//        for (int i = 0; i < 5; i++) {
//            int randomNum = ran.nextInt(max - min + 1) + min;
//            System.out.println(randomNum);
//        }
//    }

//    public static void reverse(int[] number) {
//        int left = 0;
//        int right = number.length - 1;
//        while (left < right) {
//
//            int temp = number[left];
//            number[left] = number[right];
//            number[right] = temp;
//            left++;
//            right--;
//        }  }

}