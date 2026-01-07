//zeroes to the last using another array
# include <iostream>
using namespace std;
# include <algorithm>
int main(){
int arr[]={1,3,5,0,0,0,7,0,11,0,5,2,7};
int n= sizeof(arr)/sizeof(arr[0]);
int nw[n]={};
int j=0;
for( int i=0;i<n;i++){
     if(arr[i]!=0){
        nw[j++]=arr[i];
     
    }
}
for(int l=0;l<n;l++){
cout<<" "<<nw[l];
}
}