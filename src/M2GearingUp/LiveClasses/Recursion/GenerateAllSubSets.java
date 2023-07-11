package M2GearingUp.LiveClasses.Recursion;

public class GenerateAllSubSets {

}

/**
 * #incude<iostream>
 *
 * using namespace std;
 *
 * void allss(int* arr, int n, int idx, int* temp,int size){
 * if(idx==n){
 * for(int i=0;i<size-1;i++)
 * cout<< tmep[i]<<" ";
 * cout<< endl;
 * return;
 * }
 * temp[size]=arr[idx];
 * allss(arr,n,idx+1,temp,size+1);
 * allss(arr,n,idx+1,temp,size);
 *
 * }
 * int main(){
 * int n;
 * cin >> n;
 * int arr[n];
 * for(int i=0;i<n;i++){
 * cin>>arr[i];
 * int temp[n];
 * allss(arr,n,0,temp,0);
 *
 * return 0;
 * }
 * }
 */