import java.util.Scanner;
class DeletionAtTheIndex{
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        //Array size
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        display(arr,N);
        N = deletionAtTheIndex(arr,N,3);
        display(arr,N);

        N = deletionAtTheIndex(arr,N,2);
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
    public static int deletionAtTheIndex(int arr[], int N,int idx){
        if(N<arr.length && idx<N && idx>=0){
            for(int i=idx;i<N;i++){
                arr[i]=arr[i+1];
            }
            arr[N-1]=0;
            return --N;
        }
        return N;
    }
}