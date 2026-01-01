//duplicates algo

# include <iostream>
# include <algorithm>
using namespace std;
int main(){
    int arr[]={1,2,5,1,5,4,1,2,5,3,8,7,9,7,9,7};
    int n= sizeof(arr)/sizeof(arr[0]);
    sort(arr, arr+n);
    for(int k=0; k<n; k++){
        cout<<" "<<arr[k];
    } 
    cout<<"\n";
    int i=0;
    for(int j=1; j<n; j++){
        if(arr[j] != arr[i]){
            i++;
            arr[i]=arr[j];
        }   
    
    }
    for(int k=0; k<i+1; k++){
        cout<<" "<<arr[k];
    } 
}