//reverse the array
# include <iostream>
using namespace std;
# include <algorithm>
int main(){
    int arr[]={1,3,5,7,9,4,8,6,2};
    int n= sizeof(arr)/sizeof(arr[0]);
    int i=0;
    int j=n-1;
    while(i<j){
        swap(arr[i], arr[j]);
        i++;
        j--;
    }
    for(int l=0;l<n;l++){
    cout<<" "<<arr[l];
}
}