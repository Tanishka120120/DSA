#include <iostream>
using namespace std;
struct l1
{int data;
l1* next;
};
int main(){
    l1*head=new l1{1,nullptr};
    head->next=new l1{2,nullptr};
    head->next->next= new l1{3, nullptr};
    l1* temp=head;
    while(temp!=nullptr){
        cout<<temp->data ;
        temp=temp->next;
    }
}

