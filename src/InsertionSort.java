public class InsertionSort {
    //static int[] list = {9,5,3,6,2,4,8,7,1};

    public static void insertionSort(int[] list){
        int n = list.length;
        for (int i = 1; i< n; i++){
            int key = list[i];
            int j = i-1;
            while ((j>-1)&&(list[j]>key)){
                list[j+1] = list[j];
                j--;
            }
            list[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,14,3,2,43,11,58,22};
        System.out.println("Before Insertion Sort");
        for (int i : arr){
            System.out.println(i + " ");
        }
        System.out.println();

        insertionSort(arr);
        for (int array : arr){
            System.out.println(" Print Mang " +array);
        }
    }
}
