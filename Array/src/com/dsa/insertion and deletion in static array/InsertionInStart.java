import java.util.Scanner;
class InsertionInStart{
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        //Array size
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        display(arr,N);
        N = insertionInStart(arr,N,10);
        display(arr,N);

        N = insertionInStart(arr,N,20);
        display(arr,N);

    }

    //Display array
    public static void display(int arr[],int N){
        for(int i = 0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Insert the value at the start
    public static int insertionInStart(int arr[], int N, int val){
        if(N<arr.length){
            for(int i = N;i>=1;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = val;
            N++;
            return N;
        }
        return N;
    }
}