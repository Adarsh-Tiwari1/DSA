// Bubble Sort - Simple but inefficient (O(n²)) 
// Selection Sort - Finds the smallest element and places it in order (O(n²)).
// Insertion Sort - Efficient for small datasets or nearly sorted data (O(n²)).
// Merge Sort - Uses divide-and-conquer, stable, O(n log n).
// Quick Sort - Efficient, but worst-case O(n²); average O(n log n).
// Heap Sort - Uses a binary heap, O(n log n).
// Sorting in Java : Java provides built-in methods for sorting : Arrays.sort() - Sorts primitive and object arrays.|| Collections.sort() - Sorts List objects.
// Stable Sorting : Maintains the order of equal elements (Merge Sort, Insertion Sort).
// Unstable Sorting : May change the order of equal elements (Quick Sort, Heap Sort).


// Bubble sort : Bubble sort me subse bda element subse pache jata hai . isme her pair sort karte hai

/*
class Sorting {
    public static void printArr(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        int[] arr = {8, 5, 7, 6, 3, 9, 1};
        // Bubble Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // Corrected condition
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArr(arr); // Calling the corrected printArr method
    }
}
*/


// Assanding order ke liye insertion sort subse best hota hai.
// selection sort me subse 

// Selection : Selection sort me subse chota element subse aage dalte hai . isme ek loop chalta hai o ek iteration pe ek swap he hota hai . isme choti value her element se check karti hai .
/* 
class Sorting {
    public static void printArr(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println(); // For better output formatting
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 7, 6, 3, 9, 1};

        // Selection Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {  // Corrected loop
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // Swap the found smallest element with arr[i]
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArr(arr); // Print sorted array
    }
}
*/




// Insertion Sorting : 

// aager data sorted hai to insertion sort subse best hota hai.


class Sorting {
    public static void printArr(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println(); // For better output formatting
    }
    public static void main(String[] args) {
        int[] arr = {8, 5, 7, 6, 3, 9, 1};
        // Insertion Sort Algorithm
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) { // Corrected comparison
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        printArr(arr); // Print sorted array
    }
}



// Marge Sort : Divide & Conquer







// Quick Sort .

