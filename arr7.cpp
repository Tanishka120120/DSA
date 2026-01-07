//zeroes to the last using swapping
# include <iostream>
using namespace std;
# include <algorithm>
int main(){
int arr[]={1,3,5,0,0,0,7,0,11,0,5,2,7};
int n= sizeof(arr)/sizeof(arr[0]);
int k=0;
for(int i=0;i<n;i++){
    if(arr[i]==0){
        for(int j=n-1;j>i;j--){
            if(arr[j]!=0){
               swap(arr[i], arr[j]);
                
               break;
               cout << " "<<arr[i];
                
            }
            
        }
    }
}
for(int l=0; l<n; l++){
cout<<" "<<arr[l];
 }
}
