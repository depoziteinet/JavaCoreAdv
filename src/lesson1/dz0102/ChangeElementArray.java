package lesson1.dz0102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeElementArray {
    public static void main(String[] args) {
        String[] arrStr = {"А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И"};
        Integer[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Массив String до: \n" + Arrays.toString(arrStr));
        System.out.println("Массив String после перемены элементов с индексом 0 и 5: \n" + Arrays.toString(ChangeEl(0, 5, arrStr)));
        System.out.println("--------------------------------------");
        System.out.println("Массив Integer до: \n" + Arrays.toString(arrInt));
        System.out.println("Массив Integer после перемены элементов с индексом 0 и 5: \n" + Arrays.toString(ChangeEl(0, 5, arrInt)));

        System.out.println("--------------------------------------\nArrayList<String>\n");
        List<String> listArrStr =  ChangeToArrayList(arrStr);
        System.out.println(listArrStr.toString());
        System.out.println("--------------------------------------\nArrayList<Integer>\n");
        List<Integer> listArrInt = ChangeToArrayList(arrInt);
        System.out.println(listArrInt.toString());

    }

    public static <T> T[] ChangeEl(int index1, int index2, T[] arr){
        T temp = arr[index1] ;
        arr[index1] = arr[index2];
        arr[index2] = temp;
    return arr;
    }


    public static <T> List<T> ChangeToArrayList(T[] arr) {
        List<T> listArr = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            listArr.add(i, arr[i]);
        }
        return listArr;
    }

 }
