import java.util.ArrayList;
import java.util.Collections;


public class sortirouka {


    public static void selectionsrt(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Найдем индекс минимального элемента в несортированной части
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Поменяем местами найденный минимальный элемент с первым элементом
            if (minIndex != i) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void insertionsrt(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Сдвигаем элементы, которые больше ключа, вправо
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            // Вставляем ключ в правильное место
            array[j + 1] = key;
        }
    }

    public static void bubblesrt(int[] array) {
        int n = array.length;
        boolean swapped;

        // Внешний цикл для каждого элемента массива
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Внутренний цикл для сравнения и перестановки соседних элементов
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Меняем элементы местами
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true; // Фиксируем, что произошла замена
                }
            }

            // Если не было замен, массив отсортирован
            if (!swapped) {
                break;
            }
        }
    }

    static class mergeSort {

        public static void mergesrt(int[] array, int left, int right) {
            if (left < right) {
                // Находим середину массива
                int mid = (left + right) / 2;

                // Сортируем первую и вторую половины
                mergesrt(array, left, mid);
                mergesrt(array, mid + 1, right);

                // Сливаем отсортированные половины
                merge(array, left, mid, right);
            }
        }

        // Метод для слияния двух подмассивов
        public static void merge(int[] array, int left, int mid, int right) {
            // Определяем размеры двух подмассивов для слияния
            int n1 = mid - left + 1;
            int n2 = right - mid;

            // Создаем временные массивы
            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];

            // Копируем данные во временные массивы
            for (int i = 0; i < n1; ++i) {
                leftArray[i] = array[left + i];
            }
            for (int j = 0; j < n2; ++j) {
                rightArray[j] = array[mid + 1 + j];
            }

            // Индексы для временных массивов и исходного массива
            int i = 0, j = 0;
            int k = left;

            // Сливаем временные массивы обратно в исходный массив
            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    array[k] = leftArray[i];
                    i++;
                } else {
                    array[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            // Копируем оставшиеся элементы leftArray, если есть
            while (i < n1) {
                array[k] = leftArray[i];
                i++;
                k++;
            }

            // Копируем оставшиеся элементы rightArray, если есть
            while (j < n2) {
                array[k] = rightArray[j];
                j++;
                k++;
            }
        }
    }

    public static void shell(int[] array) {
        int n = array.length;

        // Начинаем с большого промежутка и уменьшаем его на каждом шаге
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // Сортируем элементы, находящиеся на расстоянии "gap" друг от друга
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;

                // Сдвигаем элементы, чтобы найти правильное место для array[i]
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }

                // Вставляем temp на правильную позицию
                array[j] = temp;
            }
        }
    }

    public static void hibbardSort(int[] array) {
        int n = array.length;
        int k = 1;

        // Находим максимальное значение k для h_k < n
        while ((1 << k) - 1 < n) k++;

        for (int gap = (1 << (k - 1)) - 1; gap > 0; gap = (1 << --k) - 1) {

            for (int i = gap; i < n; i++) {

                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {

                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

    static class ShellPratt {

        // Функция для генерации последовательности Пратта
        private static int[] generate(int n) {
            ArrayList<Integer> pratt = new ArrayList<>();

            // Генерация шагов Пратта (2^i * 3^j) в пределах размера массива n
            for (int i = 1; i <= n; i *= 2) {
                for (int j = i; j <= n; j *= 3) {
                    pratt.add(j);
                }
            }

            // Преобразуем список в массив и сортируем его по убыванию
            Collections.sort(pratt, Collections.reverseOrder());
            return pratt.stream().mapToInt(Integer::intValue).toArray();
        }

        // Функция сортировки Shell Sort по Пратту
        public static void shpratt(int[] array) {
            int n = array.length;
            int[] gaps = generate(n); // Получаем последовательность Пратта

            // Основной цикл сортировки
            for (int gap : gaps) {
                for (int i = gap; i < n; i++) {
                    int temp = array[i];
                    int j = i;
                    while (j >= gap && array[j - gap] > temp) {
                        array[j] = array[j - gap];
                        j -= gap;
                    }
                    array[j] = temp;
                }
            }
        }

    }

    public class QuickSort {

        // Метод для разделения массива
        private static int partition(int[] array, int low, int high) {
            // Выбор опорного элемента как медианы из трех
            int mid = low + (high - low) / 2;
            int pivot = array[mid];
            // Перемещение опорного элемента в конец
            swap(array, mid, high);
            int storeIndex = low;

            for (int i = low; i < high; i++) {
                if (array[i] < pivot) {
                    swap(array, i, storeIndex);
                    storeIndex++;
                }
            }
            // Перемещение опорного элемента на его окончательную позицию
            swap(array, storeIndex, high);
            return storeIndex;
        }

        // Метод для обмена элементов массива
        private static void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        // Основной метод быстрой сортировки
        public static void quickSort(int[] array, int low, int high) {
            while (low < high) {
                int pivotIndex = partition(array, low, high);
                // Рекурсивно сортируем меньшую подчасть
                if (pivotIndex - low < high - pivotIndex) {
                    quickSort(array, low, pivotIndex - 1);
                    low = pivotIndex + 1; // Сортируем правую часть
                } else {
                    quickSort(array, pivotIndex + 1, high);
                    high = pivotIndex - 1; // Сортируем левую часть
                }
            }
        }
    }
        public class heapsort {

            public static void heapSort(int[] array) {

                int n = array.length;
                for (int i = n / 2 - 1; i >= 0; i--) {

                    heapy(array, n, i);
                }

                for (int i = n - 1; i > 0; i--) {

                    int temp = array[0];
                    array[0] = array[i];
                    array[i] = temp;

                    heapy(array, i, 0);
                }
            }


            private static void heapy(int[] array, int n, int i) {
                int largest = i;
                int left = 2 * i + 1;
                int right = 2 * i + 2;


                if (left < n && array[left] > array[largest]) {

                    largest = left;
                }


                if (right < n && array[right] > array[largest]) {

                    largest = right;
                }


                if (largest != i) {

                    int swap = array[i];
                    array[i] = array[largest];
                    array[largest] = swap;

                    heapy(array, n, largest);
                }
            }
        }
    }
