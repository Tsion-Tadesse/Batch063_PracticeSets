package practiceSet;

import java.io.File;
import java.util.*;

public class PractiveSet12 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        // immutable class
        int id = 12;
        String name = "John";
        ImmutableClass ic = new ImmutableClass(id, name);
        System.out.println(ic.getId() + " " + ic.getName());
        name = "Merry";
        System.out.println(ic.getName()); // test

        String s = CapitalizeFirstStr("hello world this is tsion");
        System.out.println("The capitalized word is: " + s);

        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        mergeList(l1, l2);

        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(1, 3, 3, 4));
        unionOfTwoSets(s1, s2);

        double ms = 12345;
        convertMstoMinSec(ms);

        int[] arr = { 1, 3, 4, 2, 3, 6 };
        boolean test1 = checkIfValueExsist(arr, 2);
        System.out.println(test1);
        boolean test2 = checkIfValueExsist(arr, 7);
        System.out.println(test2);

        int largest = findLargest(arr);
        System.out.println("Largest Array alue is: " + largest);

        double averg = calculateAvg(arr);
        System.out.printf("The average is: %.4f", averg);
        System.out.println("");
        Calendar d1 = Calendar.getInstance();
        Calendar d2 = Calendar.getInstance();
        addDates(d1, d2);

        int count = countFileLine("test.txt");
        System.out.println("Total number of lines: " + count);

    }

    // Program to add two dates
    public static void addDates(Calendar d1, Calendar d2) { //
        Calendar sumDate;
        d1 = Calendar.getInstance();
        d2 = Calendar.getInstance();
        sumDate = (Calendar) d1.clone();
        sumDate.add(Calendar.DATE, d2.get(Calendar.DATE));
        sumDate.add(Calendar.MONTH, d2.get(Calendar.MONTH));
        sumDate.add(Calendar.YEAR, d2.get(Calendar.YEAR));

        System.out.println(sumDate.getTime());
        // return sumDate;
    }

    // java program to count number of lines present in a file
    public static int countFileLine(String fname) {
        int count = 0;
        try {
            File f = new File(fname);
            Scanner in = new Scanner(f);
            while (in.hasNextLine()) {
                in.nextLine();
                count += 1;
            }
            in.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
        return count;
    }

    // Java program to Capitalize the first charachter of each word
    public static String CapitalizeFirstStr(String str) {
        String newStr = "";
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            char ch;
            if (i == 0) {
                ch = Character.toUpperCase(str.charAt(i));
                newStr += ch;
            } else if (str.charAt(i) == ' ') {
                newStr += " ";
                ch = Character.toUpperCase(str.charAt(i + 1));
                newStr += ch;
            } else if (str.charAt(i - 1) != ' ') {
                ch = str.charAt(i);
                newStr += ch;
            } else {
                continue;
            }
        }
        return newStr;
    }

    // Java program to merge two lists
    public static void mergeList(List<Integer> l1, List<Integer> l2) {
        List<Integer> ml = new ArrayList<Integer>();
        for (int e : l1) {
            ml.add(e);
        }
        for (int e2 : l2) {
            ml.add(e2);
        }
        System.out.println(ml);
    }

    // calculate the union of two sets
    public static void unionOfTwoSets(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> unionSet = new HashSet<Integer>();
        for (int i : s1) {
            unionSet.add(i);
        }
        for (int i : s2) {
            unionSet.add(i);
        }
        System.out.println(unionSet);
    }

    // convert miliseconds to Minutes and seconds
    public static void convertMstoMinSec(double milisecs) {
        double minutes, seconds;
        seconds = milisecs / 1000;
        minutes = seconds / 60;

        System.out.println(milisecs + " Millisecond is: " + seconds + " seconds");
        System.out.printf("%.4fminutes \n", minutes);
    }

    // Java program to check if an Array contains a given Value
    public static boolean checkIfValueExsist(int[] arr, int n) {
        boolean doesExsist = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                doesExsist = true;
                break;
            }
        }
        return doesExsist;
    }

    // java program to find the largest element of an Array
    public static int findLargest(int[] arr) {
        int largest;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        largest = arr[arr.length - 1];
        return largest;
    }

    // Java program to calculate Average Using Arrays
    public static double calculateAvg(int[] arr) {
        double avg;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        avg = Double.valueOf(sum) / Double.valueOf(arr.length);

        return avg;
    }
}

// immutable class
final class ImmutableClass {

    // private variables
    private final int id;
    private final String name;

    // getter not setter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

}