//2 pointer
#include <iostream>
using namespace std;
#include <algorithm>
int main(){
    int arr[]={1,2,3,4,5,6,9,7,8};
    int n= sizeof(arr)/sizeof(arr[0]);
    int sum=9;
    int i=0;
    int j=n-1;
    bool found=false;
    sort(arr, arr+n);
    while (i<j)
    {
       int s=arr[i]+arr[j];
       if(s==sum){
        found=true;
        break;
       }
       else if(s<sum){
        i++;
       }
       else {
        j--;
       }
    }
    if(found==true){
        cout<<"yes";
    }
    else{
        cout<<"false";
    }
}