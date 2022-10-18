/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода
единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        double[] array_1 = {5,6,5,5};
        double[] array_2 = {4,3,2,1}; // Для проверки можно изменить количество элементов
        System.out.println(Arrays.toString(ElementDivision(array_1,array_2)));
    }

    public static double[] ElementDivision(double[] array_1, double[] array_2){
        if (array_1.length != array_2.length){
            throw new RuntimeException("Длины массивов не равны");
        }
        double[] array_division = new double[array_1.length];
        for (int i = 0; i < array_1.length; i++) {
            if (array_2[i] == 0){
                throw new RuntimeException("Делить на 0 нельзя");
            }
            array_division[i] = array_1[i] / array_2[i];
        }
        return array_division;
    }
}
