
import java.util.Random;

public class main{

    public static void main(String[] args) {

        int counter = 0;

        int[] random_bubble_time = new int[11];
        int[] sorted_bubble_time = new int[11];
        int[] almost_sorted_bubble_time = new int[11];
        int[] reverse_sorted_bubble_time = new int[11];

        int[] random_insertion_time = new int[11];
        int[] sorted_insertion_time = new int[11];
        int[] almost_sorted_insertion_time = new int[11];
        int[] reverse_sorted_insertion_time = new int[11];

        int[] random_selection_time = new int[11];
        int[] sorted_selection_time = new int[11];
        int[] almost_sorted_selection_time = new int[11];
        int[] reverse_sorted_selection_time = new int[11];

        int[] random_quick_time = new int[11];
        int[] sorted_quick_time = new int[11];
        int[] almost_sorted_quick_time = new int[11];
        int[] reverse_sorted_quick_time = new int[11];

        int[] random_merge_time = new int[11];
        int[] sorted_merge_time = new int[11];
        int[] almost_sorted_merge_time = new int[11];
        int[] reverse_sorted_merge_time = new int[11];

        int[] random_shell_time = new int[11];
        int[] sorted_shell_time = new int[11];
        int[] almost_sorted_shell_time = new int[11];
        int[] reverse_sorted_shell_time = new int[11];

        int[] random_heap_time = new int[11];
        int[] sorted_heap_time = new int[11];
        int[] almost_sorted_heap_time = new int[11];
        int[] reverse_sorted_heap_time = new int[11];

        int[] random_hibbard_time = new int[11];
        int[] sorted_hibbard_time = new int[11];
        int[] almost_sorted_hibbard_time = new int[11];
        int[] reverse_sorted_hibbard_time = new int[11];

        int[] random_pratt_time = new int[11];
        int[] sorted_pratt_time = new int[11];
        int[] almost_sorted_pratt_time = new int[11];
        int[] reverse_sorted_pratt_time = new int[11];



        for (int n=0; n<100001; n = n + 10000){

            int[] sortArr = new int[n+1];

            function.Functions.array_randomizer(sortArr); // рандомный массив
            random_bubble_time[counter] = (int) function.Functions.get_bubble_time(sortArr);


            function.Functions.array_sort(sortArr);

            sorted_bubble_time[counter] = (int) function.Functions.get_bubble_time(sortArr);


            function.Functions.almost(sortArr);

            almost_sorted_bubble_time[counter] = (int) function.Functions.get_bubble_time(sortArr);


            function.Functions.reverse_sort_array(sortArr);

            reverse_sorted_bubble_time[counter] = (int) function.Functions.get_bubble_time(sortArr);



            function.Functions.array_randomizer(sortArr);

            random_insertion_time[counter] = (int) function.Functions.get_insertion_time(sortArr);



            function.Functions.array_sort(sortArr);

            sorted_insertion_time[counter] = (int) function.Functions.get_insertion_time(sortArr);





            function.Functions.almost(sortArr);

            almost_sorted_insertion_time[counter] = (int) function.Functions.get_insertion_time(sortArr);



            function.Functions.reverse_sort_array(sortArr);

            reverse_sorted_insertion_time[counter] = (int) function.Functions.get_insertion_time(sortArr);





            function.Functions.array_randomizer(sortArr);

            random_selection_time[counter] = (int) function.Functions.get_selection_time(sortArr);



            function.Functions.array_sort(sortArr);

            sorted_selection_time[counter] = (int) function.Functions.get_selection_time(sortArr);



            function.Functions.almost(sortArr);

            almost_sorted_selection_time[counter] = (int) function.Functions.get_selection_time(sortArr);



            function.Functions.reverse_sort_array(sortArr);

            reverse_sorted_selection_time[counter] = (int) function.Functions.get_selection_time(sortArr);





            function.Functions.array_randomizer(sortArr);

            random_quick_time[counter] = (int) function.Functions.get_quick_time(sortArr);



            function.Functions.array_sort(sortArr);

            sorted_quick_time[counter] = (int) function.Functions.get_quick_time(sortArr);



            function.Functions.almost(sortArr);

            almost_sorted_quick_time[counter] = (int) function.Functions.get_quick_time(sortArr);



            function.Functions.reverse_sort_array(sortArr);

            reverse_sorted_quick_time[counter] = (int) function.Functions.get_quick_time(sortArr);




            function.Functions.array_randomizer(sortArr);

            random_merge_time[counter] = (int) function.Functions.get_merge_time(sortArr);



            function.Functions.array_sort(sortArr);

            sorted_merge_time[counter] = (int) function.Functions.get_merge_time(sortArr);



            function.Functions.almost(sortArr);

            almost_sorted_merge_time[counter] = (int) function.Functions.get_merge_time(sortArr);



            function.Functions.reverse_sort_array(sortArr);

            reverse_sorted_merge_time[counter] = (int) function.Functions.get_merge_time(sortArr);



            function.Functions.array_randomizer(sortArr);

            random_shell_time[counter] = (int) function.Functions.get_shell_time(sortArr);


            function.Functions.array_sort(sortArr);

            sorted_shell_time[counter] = (int) function.Functions.get_shell_time(sortArr);



            function.Functions.almost(sortArr);

            almost_sorted_shell_time[counter] = (int) function.Functions.get_shell_time(sortArr);



            function.Functions.reverse_sort_array(sortArr);

            reverse_sorted_shell_time[counter] = (int) function.Functions.get_shell_time(sortArr);



            function.Functions.array_randomizer(sortArr);

            random_heap_time[counter] = (int) function.Functions.get_heap_time(sortArr);

            function.Functions.array_sort(sortArr);

            sorted_heap_time[counter] = (int) function.Functions.get_heap_time(sortArr);

            function.Functions.almost(sortArr);

            almost_sorted_heap_time[counter] = (int) function.Functions.get_heap_time(sortArr);

            function.Functions.reverse_sort_array(sortArr);

            reverse_sorted_heap_time[counter] = (int) function.Functions.get_heap_time(sortArr);



            function.Functions.array_randomizer(sortArr);

            random_hibbard_time[counter] = (int) function.Functions.get_hibbard_time(sortArr);

            function.Functions.array_sort(sortArr);

            sorted_hibbard_time[counter] = (int) function.Functions.get_hibbard_time(sortArr);

            function.Functions.almost(sortArr);

            almost_sorted_hibbard_time[counter] = (int) function.Functions.get_hibbard_time(sortArr);

            function.Functions.reverse_sort_array(sortArr);

            reverse_sorted_hibbard_time[counter] = (int) function.Functions.get_hibbard_time(sortArr);



            function.Functions.array_randomizer(sortArr);

            random_pratt_time[counter] = (int) function.Functions.get_pratt_time(sortArr);

            function.Functions.array_sort(sortArr);

            sorted_pratt_time[counter] = (int) function.Functions.get_pratt_time(sortArr);

            function.Functions.almost(sortArr);

            almost_sorted_pratt_time[counter] = (int) function.Functions.get_pratt_time(sortArr);

            function.Functions.reverse_sort_array(sortArr);

            reverse_sorted_pratt_time[counter] = (int) function.Functions.get_pratt_time(sortArr);


            counter++;

        }

        function.Functions.clearFile("//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/bubble.txt");

        function.Functions.writeStringToFile("Random array, bubble_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/bubble.txt");
        function.Functions.writeArrayToFile(random_bubble_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/bubble.txt");

        function.Functions.writeStringToFile("Sorted array, bubble_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/bubble.txt");
        function.Functions.writeArrayToFile(sorted_bubble_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/bubble.txt");

        function.Functions.writeStringToFile("Almost sorted array, bubble_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/bubble.txt");
        function.Functions.writeArrayToFile(almost_sorted_bubble_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/bubble.txt");

        function.Functions.writeStringToFile("Reverse-sorted array, bubble_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/bubble.txt");
        function.Functions.writeArrayToFile(reverse_sorted_bubble_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/bubble.txt");



        function.Functions.clearFile("//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/insertion.txt");

        function.Functions.writeStringToFile("Random array, insertion_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/insertion.txt");
        function.Functions.writeArrayToFile(random_insertion_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/insertion.txt");

        function.Functions.writeStringToFile("Sorted array, insertion_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/insertion.txt");
        function.Functions.writeArrayToFile(sorted_insertion_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/insertion.txt");

        function.Functions.writeStringToFile("Almost sorted array, insertion_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/insertion.txt");
        function.Functions.writeArrayToFile(almost_sorted_insertion_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/insertion.txt");

        function.Functions.writeStringToFile("Reverse-sorted array, insertion_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/insertion.txt");
        function.Functions.writeArrayToFile(reverse_sorted_insertion_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/insertion.txt");



        function.Functions.clearFile("//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/selection.txt");

        function.Functions.writeStringToFile("Random array, selection_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/selection.txt");
        function.Functions.writeArrayToFile(random_selection_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/selection.txt");

        function.Functions.writeStringToFile("Sorted array, selection_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/selection.txt");
        function.Functions.writeArrayToFile(sorted_selection_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/selection.txt");

        function.Functions.writeStringToFile("Almost sorted array, selection_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/selection.txt");
        function.Functions.writeArrayToFile(almost_sorted_selection_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/selection.txt");

        function.Functions.writeStringToFile("Reverse-sorted array, selection_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/selection.txt");
        function.Functions.writeArrayToFile(reverse_sorted_selection_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/selection.txt");



        function.Functions.clearFile("//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/quick.txt");

        function.Functions.writeStringToFile("Random array, quick_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/quick.txt");
        function.Functions.writeArrayToFile(random_quick_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/quick.txt");

        function.Functions.writeStringToFile("Sorted array, quick_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/quick.txt");
        function.Functions.writeArrayToFile(sorted_quick_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/quick.txt");

        function.Functions.writeStringToFile("Almost sorted array, quick_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/quick.txt");
        function.Functions.writeArrayToFile(almost_sorted_quick_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/quick.txt");

        function.Functions.writeStringToFile("Reverse-sorted array, quick_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/quick.txt");
        function.Functions.writeArrayToFile(reverse_sorted_quick_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/quick.txt");



        function.Functions.clearFile("//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/merge.txt");

        function.Functions.writeStringToFile("Random array, merge_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/merge.txt");
        function.Functions.writeArrayToFile(random_merge_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/merge.txt");

        function.Functions.writeStringToFile("Sorted array, merge_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/merge.txt");
        function.Functions.writeArrayToFile(sorted_merge_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/merge.txt");

        function.Functions.writeStringToFile("Almost sorted array, merge_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/merge.txt");
        function.Functions.writeArrayToFile(almost_sorted_merge_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/merge.txt");

        function.Functions.writeStringToFile("Reverse-sorted array, merge_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/merge.txt");
        function.Functions.writeArrayToFile(reverse_sorted_merge_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/merge.txt");



        function.Functions.clearFile("//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/shell.txt");

        function.Functions.writeStringToFile("Random array, shell_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/shell.txt");
        function.Functions.writeArrayToFile(random_shell_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/shell.txt");

        function.Functions.writeStringToFile("Sorted array, shell_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/shell.txt");
        function.Functions.writeArrayToFile(sorted_shell_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/shell.txt");

        function.Functions.writeStringToFile("Almost sorted array, shell_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/shell.txt");
        function.Functions.writeArrayToFile(almost_sorted_shell_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/shell.txt");

        function.Functions.writeStringToFile("Reverse-sorted array, shell_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/shell.txt");
        function.Functions.writeArrayToFile(reverse_sorted_shell_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/shell.txt");



        function.Functions.clearFile("//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/heap.txt");

        function.Functions.writeStringToFile("Random array, heap_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/heap.txt");
        function.Functions.writeArrayToFile(random_heap_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/heap.txt");

        function.Functions.writeStringToFile("Sorted array, heap_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/heap.txt");
        function.Functions.writeArrayToFile(sorted_heap_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/heap.txt");

        function.Functions.writeStringToFile("Almost sorted array, heap_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/heap.txt");
        function.Functions.writeArrayToFile(almost_sorted_heap_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/heap.txt");

        function.Functions.writeStringToFile("Reverse-sorted array, heap_sort:", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/heap.txt");
        function.Functions.writeArrayToFile(reverse_sorted_heap_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/heap.txt");



        function.Functions.clearFile("//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/hibbard.txt");

        function.Functions.writeStringToFile("Random array, shell_sort(Hibbard sequence):", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/hibbard.txt");
        function.Functions.writeArrayToFile(random_hibbard_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/hibbard .txt");

        function.Functions.writeStringToFile("Sorted array, shell_sort(Hibbard sequence):", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/hibbard.txt");
        function.Functions.writeArrayToFile(sorted_hibbard_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/hibbard.txt");

        function.Functions.writeStringToFile("Almost sorted array, shell_sort(Hibbard sequence):", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/hibbard.txt");
        function.Functions.writeArrayToFile(almost_sorted_hibbard_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/hibbard.txt");

        function.Functions.writeStringToFile("Reverse-sorted array, shell_sort(Hibbard sequence):", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/hibbard.txt");
        function.Functions.writeArrayToFile(reverse_sorted_hibbard_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/hibbard.txt");




        function.Functions.clearFile("//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/pratt.txt");

        function.Functions.writeStringToFile("Random array, shell_sort(Pratt sequence):", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/pratt.txt");
        function.Functions.writeArrayToFile(random_pratt_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/pratt.txt");

        function.Functions.writeStringToFile("Sorted array, shell_sort(Pratt sequence):", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/pratt.txt");
        function.Functions.writeArrayToFile(sorted_pratt_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/pratt.txt");

        function.Functions.writeStringToFile("Almost sorted array, shell_sort(Pratt sequence):", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/pratt.txt");
        function.Functions.writeArrayToFile(almost_sorted_pratt_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/pratt.txt");

        function.Functions.writeStringToFile("Reverse-sorted array, shell_sort(Pratt sequence):", "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/pratt.txt");
        function.Functions.writeArrayToFile(reverse_sorted_pratt_time, "//Users/dmitrijstrelnikov/IdeaProjects/aisd1/src/pratt.txt");

    }

}


