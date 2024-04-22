import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class sem_2zadacha3 {
    public static void sort(int[] arr) {
        int n= arr.length;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt"))){  //открываем фаил для записи
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1]=temp;
                    }
                }
                writer.println(dtf.format(LocalDateTime.now())+"  " + arrayToString(arr)); //записываем текушее состояние массива в лог файл
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length-1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();

    }


    public static void main(String[] args) {
       int[] arr = {5,1,3,8,78,9,4,2};
       sort(arr);


    }
}
