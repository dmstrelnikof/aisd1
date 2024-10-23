import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class function {
    static class Functions{

        public static void almost(int[] array){

            Functions.array_randomizer(array);

            sortirouka.QuickSort.quickSort(array, array.length/100*90, array.length-1);

        }

        public static void clearFile(String filePath) {

            File file = new File(filePath);
            try (FileWriter writer = new FileWriter(file)) {

                // Записываем пустую строку в файл
                writer.write("");
                System.out.println("Файл успешно очищен: " + filePath);

            } catch (IOException e) {
                System.err.println("Ошибка при очистке файла: " + e.getMessage());
            }
        }


        public static void reverse_sort_array(int[] array){

            for(int i = 0; i<array.length; i++){
                array[i] = i;
            }

            Functions.reverse_sort(array);

        }



        public static void array_sort(int[] array){

            for(int i = 0; i<array.length; i++){
                array[i] = i;
            }
            sortirouka.QuickSort.quickSort(array, 0, array.length-1);
        }

        public static void array_randomizer(int[] array){

            for(int i = 0; i<array.length; i++){
                array[i] = i;
            }

            Functions.shuffle(array);

        }

        public static long get_bubble_time(int[] array){
            long startTime = System.currentTimeMillis();
            sortirouka.bubblesrt(array);
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }

        public static long get_selection_time(int[] array){
            long startTime = System.currentTimeMillis();
            sortirouka.selectionsrt(array);
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }

        public static long get_insertion_time(int[] array){
            long startTime = System.currentTimeMillis();
            sortirouka.insertionsrt(array);
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }

        public static long get_quick_time(int[] array){
            long startTime = System.currentTimeMillis();
            sortirouka.QuickSort.quickSort(array, 0, array.length-1);
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }

        public static long get_merge_time(int[] array){
            long startTime = System.currentTimeMillis();
            sortirouka.mergeSort.mergesrt(array, 0, array.length-1);
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }

        public static long get_shell_time(int[] array){
            long startTime = System.currentTimeMillis();
            sortirouka.shell(array);
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }

        public static long get_hibbard_time(int[] array){
            long startTime = System.currentTimeMillis();
            sortirouka.hibbardSort(array);
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }

        public static long get_pratt_time(int[] array){
            long startTime = System.currentTimeMillis();
            sortirouka.ShellPratt.shpratt(array);
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }



        public static long get_heap_time(int[] array){
            long startTime = System.currentTimeMillis();
            sortirouka.heapsort.heapSort(array);
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }



        public static void writeStringToFile(String content, String fileName) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                writer.write(content); // Записываем строку в файл
                writer.newLine(); // Добавляем новую строку (опционально)
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл: " + e.getMessage());
            }
        }

        public static void writeArrayToFile(int[] array, String fileName) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                for (int elem : array) {
                    writer.write(String.valueOf(elem)); // Записываем элемент
                    writer.write(", "); // Добавляем пробел между элементами
                }
                writer.newLine(); // Добавляем новую строку после записи массива
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл: " + e.getMessage());
            }
        }


        public static void reverse_sort(int[] sortArr){

            for (int i = 0; i < sortArr.length / 2; i++) {
                // Сохраняем текущее значение
                int temp = sortArr[i];
                // Меняем местами элементы
                sortArr[i] = sortArr[sortArr.length - 1 - i];
                sortArr[sortArr.length - 1 - i] = temp;
            }
        }

        public static void shuffle(int[] array) {
            Random random = new Random();
            for (int i = array.length - 1; i > 0; i--) {
                // Генерируем случайный индекс от 0 до i
                int j = random.nextInt(i + 1);
                // Меняем местами элементы array[i] и array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
}
