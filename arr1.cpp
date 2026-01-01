# include <iostream>
using namespace std;
int main(){
  int arr[]={1,2,3,4,5,8,9,6};
  int n= 8;
  int x=10;
  int flag=0;
  for (int i=0; i<n;i++){
    if (arr[i]==x){
      cout<<"yes";
      flag=1;
      break;
    }
  }
  if(flag==0)
  {cout<<"no";}
}