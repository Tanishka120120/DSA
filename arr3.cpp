//prefix sum
# include <iostream>
using namespace std;
int main(){
    int arr[]={1,2,3,4,5,6,7,8,9};
    int n= sizeof(arr)/sizeof(arr[0]);
    int sum=0;
    int s=3;
    int e=8;
    /*for(int i=s-1; i<e; i++){
        sum=sum+arr[i];
    }*/
   int prefix[n]={};
   prefix[0]=arr[0];
   for(int i=1; i<n; i++){
    prefix[i]=prefix[i-1] +arr[i];
   }
   sum= prefix[e]-prefix[s-1];
   for(int k=0;k<n;k++){
    cout<<" "<<prefix[k];
   }
   cout<<"\n"<<sum;
}