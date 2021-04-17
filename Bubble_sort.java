package tugasmodul4;

public class Bubble_sort {
    public static void bubblesort(int[] A) {
        int i =1, j, n = A.length;
        int temp;
        while (i < n){
            j = n - 1;
            while (j>=i){
                if (A[j-1] > A[j]){
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j - 1] = temp;
                }
                j = j - 1;
            }
            i = i + 1;
        }
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int A[] = {25, 7, 9, 13, 3};
        Bubble_sort.tampil(A);
        Bubble_sort.bubblesort(A);
        Bubble_sort.tampil(A);
        
        System.out.println("Muhammad Nur Iskandar Rizqi");
}
}

