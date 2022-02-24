public class BubbleSort {
    static int[] list = {3,7,9,5,1};
    public static void bubbleSort(int[] list) {
        //boolean next = true;
        for (int k = 1; k < list.length; k++) {
            for (int i =0;i< list.length -k; i++) {
                //next=false;
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}

