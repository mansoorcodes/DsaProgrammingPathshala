package M1BeginWithProgramming._2Arrays;

public class AllElementsCountInArray {

    public static void main(String[] args) {
        int arr[] = {1,5,4,3,4,3,2,4,3,2,1,5,7,3,8,9};
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(arr[j] == arr[i]){
                    if(i > j){
                        break;
                    }
                    else{
                        count++;
                    }
                }
            }
            if(count != 0){
                System.out.println(arr[i]+ " "+count);
            }
        }
    }
}