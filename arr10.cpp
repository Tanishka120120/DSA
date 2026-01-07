# include <iostream>
using namespace std;
# include <algorithm>
int main(){
    int arr[]={1,5,9,7,3,5,4};
    int n= sizeof(arr)/sizeof(arr[0]);
    int sum=1;
    int curr_sum=0;
    int start=0;
    for(int end=0;end<n;end++){
        curr_sum=curr_sum+arr[end];
        while(curr_sum>sum && start<=end){
            curr_sum-=arr[start];
            start++;
        }
        if(curr_sum==sum){
            cout<<"yes";
            break;
        }
    }
}