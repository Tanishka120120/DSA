# include <iostream>
using namespace std;
# include <map>
int main(){
    int arr[]={1,2,3,4,5,5,8,1,2,2};
    int n=sizeof(arr)/sizeof(arr[0]);
    /*bool visited[n]={false};
    for(int i=0; i<n;i++){
        if(visited[i]){continue;}
        int freq=1;

        cout<<arr[i];
        
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                freq++;
                visited[j]=true;
            }
        }
        cout<<" " <<freq<<"\n";
        
    }
    for(int k=0;k<n;k++){
        cout<<bool(visited[k]);//typecasting
    }*/
   map<int, int> freq;
   for(int i=0;i<n;i++){
    freq[arr[i]]++;
   }
   for (auto it : freq) {
        cout << it.first << " -> " << it.second << endl;
    }
    
}