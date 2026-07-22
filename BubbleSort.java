// public class BubbleSort {
// public static void main(String[] args) {
// // 0 1 2 3 4 5 6 7 8
// int a[] = { 23, 45, 1, 67, 73, 20, 40, 37, 55 };
// int a[] = { 23, 45, 1, 67, 73, 20, 37, 40, 55 };
// int a[] = { 23, 45, 1, 67, 73, 20, 37, 40, 55 };
// int a[] = { 23, 45, 1, 67, 20, 73, 37, 40, 55 };
// int a[] = { 23, 45, 1, 20, 67, 73, 37, 40, 55 };
// int a[] = { 23, 45, 1, 20, 67, 73, 37, 40, 55 };
// int a[] = { 23, 1, 45, 20, 67, 73, 37, 40, 55 };
// int a[] = { 1, 23, 45, 20, 67, 73, 37, 40, 55 };
// if(a8 < a7) { swap a8 with a7 }
// if(a7 < a6) { swap a7 with a6 }
// if(a6 < a5) { swap a6 with a5}
// 345 > 123
// 0x345 > 0x123

// . . .
// if(a1 < a0) { swap a1 with a0 }

// int n = a.length; // n = 9
// // int a[] = { 23, 1, 45, 67, 73, 20, 40, 37, 55 };
// // int a[] = { 23, 1, 45, 67, 73, 20, 40, 37, 55 };
// // int a[] = { 23, 1, 45, 67, 20, 73, 40, 37, 55 };
// // int a[] = { 23, 1, 45, 67, 20, 40, 73, 37, 55 };
// // int a[] = { 23, 1, 45, 67, 20, 40, 37, 73, 55 };
// // int a[] = { 23, 1, 45, 67, 20, 40, 37, 55, 73 };
// // if(a0 > a1 ) swap a0 with a1
// // if(a1 > a2 ) swap a1 with a2
// // if(a2 > a3) swap a2 with a3
// // . . .
// // if(an-2 > an-1 ) swap an-2 with an-1

// bubbleSort(a);
// printArray(a);
// // 0 1 2 3 4 5 6 7 8
// int a[] = { 23, 45, 1, 67, 73, 20, 40, 37, 55 }; a0 with a1 smaller on a0
// int a[] = { 23, 45, 1, 67, 73, 20, -40, 37, 55 }; a0 with a2
// int a[] = { 1, 45, 23, 67, 73, 20, -40, 37, 55 }; a0 with a3 smaller on a0
// int a[] = { 1, 45, 23, 67, 73, 20, -40, 37, 55 }; a0 with a4
// int a[] = { 1, 45, 23, 67, 73, 20, -40, 37, 55 }; a0 with a5
// int a[] = { -40, 45, 23, 67, 73, 20, 1, 37, 55 }; a0 with a6
// int a[] = { -40, 45, 23, 67, 73, 20, 1, 37, 55 }; a0 with a7
// int a[] = { -40, 45, 23, 67, 73, 20, 1, 37, 55 }; a0 with a8

// }

public static void bubbleSort(int a[]) {
    int n = a.length;
    for (int j = n - 1; j > 0; j--) {
        for (int i = 0; i < j; i++) {
            if (a[i] > a[i + 1]) {
                int t = a[i];
                a[i] = a[i + 1];
                a[i + 1] = t;
            }
            printArray(a);
        }
    }
}

public static void printArray(int a[]) {
    for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
    }
    System.out.println();
}
