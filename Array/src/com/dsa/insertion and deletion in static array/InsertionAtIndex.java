import java.util.Scanner;
class InsertionAtIndex{
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        //Array size
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        display(arr,N);
        N = insertionAtIndex(arr,N,10,5);
        display(arr,N);

        N = insertionAtIndex(arr,N,20,0);
        display(arr,N);

        N = insertionAtIndex(arr,N,30,3);
        display(arr,N);



    }

    //Display array
    public static void display(int arr[],int N){
        for(int i = 0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Insert the value at the specific index
    public static int insertionAtIndex(int arr[], int N, int val,int idx){
        if(idx<=N && N<arr.length && idx>=0){
            for(int i = N;i>idx;i--){
                arr[i] = arr[i-1];
            }
            arr[idx] = val;
            N++;
            return N;
        }
        return N;
    }
}