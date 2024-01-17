import java.util.Scanner;
class DeletionAtTheStart{
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        //Array size
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        display(arr,N);
        N = deletionAtTheStart(arr,N);
        display(arr,N);

        N = deletionAtTheStart(arr,N);
        display(arr,N);

    }

    //Display array
    public static void display(int arr[],int N){
        for(int i = 0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Delete the value at the end
    public static int deletionAtTheStart(int arr[], int N){
        if(N<arr.length){
            for(int i=0;i<N;i++){
                arr[i]=arr[i+1];
            }
            arr[N-1]=0;
            return --N;
        }
        return N;
    }
}