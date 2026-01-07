# include <iostream>
using namespace std;
# include <algorithm>
int main(){
    //int arr[]={7,1,5,3,6,4};
    //int sum=0;
    //int w=1;
    //int n=sizeof(arr)/sizeof(arr[0]);
    /*for(int i=0; i<=n-w; i++){
        int curr_sum=0;
        for(int j=i; j<i+w; j++ ){
          curr_sum+=arr[j];
        }
        sum=max(curr_sum, sum);

    }
    cout<<sum;*/
    //sliding window
    /*int w_sum=0;
    for(int i=0; i<w; i++){
        w_sum+=arr[i];
    }
    sum=w_sum;
    for(int k=w; k<n; k++){
        w_sum+= arr[k];
        w_sum-=arr[k-w];
        sum=max(sum, w_sum);
    }
    cout<<sum;*/
    /*int k=0;
    int l=0;
    int p=0;
    int m=0;
    for(int i=0; i<n;i++){
        k=*min_element(arr, arr+n);
        for( l=0;l<n;l++){
            if(arr[l]==k){
                break;
            }
        }
        
        for (int j=l;j<n;j++){
           m=max(arr[j], m); 
        }
    }
    
    cout<<k<<" "<<m<<" "<<m-k;*/
    int arr[]={7,51,55,47,9,8,5,3,6,4};
    int n=sizeof(arr)/sizeof(arr[0]);
    int mini=arr[0];
    int max_profit=0;
    for(int i=1;i<n; i++){
        max_profit=max(max_profit, arr[i]-mini);
        mini=min(mini,arr[i]);
    }
    cout<<max_profit;

}
