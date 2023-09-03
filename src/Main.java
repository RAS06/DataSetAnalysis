import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String in = "";
        while(!(in = scanner.nextLine()).equals("end")){
            list.add(in);
        }
        int[] arrIn = new int[list.size()];
        try {
            for (int i = 0; i < list.size(); i++) {
                arrIn[i] = Integer.parseInt(list.get(i));
            }
        } catch (InputMismatchException ime){
            System.out.println("Use numbers you fuckwit.");
        }
        int[] newArr;
        newArr = sort(arrIn);
        for (int i = 0; i < newArr.length; i++){

            System.out.print(newArr[i] + " ");

        }

        System.out.println("\n" + newArr.length + "\n");
        while(!(in = scanner.next()).equals("001")){
            System.out.println(newArr[Integer.parseInt(in) - 1]);
        }

    }
    static int[] sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}