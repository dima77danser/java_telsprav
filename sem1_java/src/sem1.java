import java.time.LocalTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//public class sem1 {
//    public static void main(String[] args){
//        System.out.println("как тебя зовут?");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("Привет"+ name);
//    }
//}


//Задание No1+
//        📌 В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
//📌 "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        📌 "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        📌 "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        📌 "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

public class sem1 {
    public static void main(String[] args) {
        System.out.println(task4(2,-3));     //менять методы здесь, в зависимости от задания /task3("Добро пожаловать на курс по Java")
    }

//    static void task() {
//        System.out.println("как тебя зовут?");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        LocalTime localTime = LocalTime.now();
//        int hour = localTime.getHour();
//        if (hour >= 5 && hour < 12) {
//            System.out.println("доброе утро" + name);
//        } else if (hour < 18) {
//            System.out.println("добрый день" + name);
//        } else if (hour < 23) {
//            System.out.println("добрый вечер" + name);
//        } else {
//            System.out.println("доброй ночи" + name);
//        }
//    }



//    static void task1(){
//        //    Задание No2
////📌 Дан массив двоичных чисел, например [1,1,0,1,1,1],
////    вывести максимальное количество подряд идущих 1.
//        int[] arr = {1,0,1,1,0,1,1,1,1};
//        int count = 0;
//        int maxones = 0;
//        for (int i =0; i<arr.length; i++){
//            if (arr[i]==1) count++;
//            else {
//                if (maxones <count){
//                    maxones=count;
//                }
//                count =0;
//            }
//        }
//        if (maxones <count){
//            maxones=count;
//        }
//        System.out.println(maxones);
//    }

   // static void task2(){
//        Задание No3
//📌 Дан массив nums = [3,2,2,3] и число val = 3.
//📌 Если в массиве есть числа, равные заданному, нужно перенести
//        эти элементы в конец массива.
//📌 Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.
//       int[] nums = {3,2,1,3,7,3};
//       int val = 3;
//       int[] tempArr = new int[nums.length];
//       Arrays.fill(tempArr,val); // создаю массив со всеми var
//       int currentInd = 0;
//       for (int i = 0; i < nums.length; i++) {
//           if (nums[i] != val) {
//               tempArr[currentInd++] = nums[i];
//           }
//       }
//       System.out.println((Arrays.toString(tempArr))); //перевожу массив в норму
//    }

//    static void task3(String str) {
////        Задание No5 (доп)
////📌 Во фразе "Добро пожаловать на курс по Java"
////        переставить слова в обратном порядке.
//        String[] arr = str.split(" ");
//        for (int i = arr.length-1; i >=0 ; i--) {
//            if (i !=arr.length-1) {
//                arr[i] = arr[i].toLowerCase();
//            }
//            System.out.print(arr[i]+ " ");
//        }

    static double task4(int a,int b){
//        Задание No6 (доп)
//📌 Реализовать функцию возведения числа а в степень b. a, b из Z.
// Сводя количество выполняемых действий к минимуму.
//📌 Пример 1: а = 3, b = 2, ответ: 9
//📌 Пример 2: а = 2, b = -2, ответ: 0.25
//📌 Пример 3: а = 3, b = 0, ответ: 1
        if (b ==0) {
            return 1;
        }
        double res = a;
        for (int i = 1; i <Math.abs(b) ; i++) {
            res*=a;
        }
        return b>0 ? res : 1/res;

    }

}