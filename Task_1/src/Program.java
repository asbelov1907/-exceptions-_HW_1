import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
    // Method1(5,0); //Нельзя делить на ноль
   // Method2("apple.txt"); //Чтение несуществующего файла
        //  Method3("5","Егор"); //Арифметические операции со строками, которые нельзя преобразовать в числа
    }

    public static void Method1(int number_1, int number_2){
        System.out.println(number_1/number_2);
    }

    public static void Method2(String file_name) throws FileNotFoundException {
        FileReader a = new FileReader(file_name);

    }

    public static void Method3(String number_1, String number_2){
        System.out.println(Integer.parseInt(number_1) + Integer.parseInt(number_2));
    }
}
