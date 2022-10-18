/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 и возвращающий новый массив, каждый элемент которого равен разности элементов двух
  входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
  оповестить пользователя.
*/


import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        int[] array_1 = {5,5,5,5};
        int[] array_2 = {4,3,2,1}; // Для проверки можно изменить количество элементов
        System.out.println(Arrays.toString(ElementDifference(array_1,array_2)));
    }

    public static int[] ElementDifference(int[] array_1, int[] array_2){
        if (array_1.length != array_2.length){
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] array_difference = new int[array_1.length];
        for (int i = 0; i < array_1.length; i++) {
            array_difference[i] = array_1[i] - array_2[i];
        }
        return array_difference;
    }
}
