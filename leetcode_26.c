#include <stdio.h>
struct ListNode{
    int val;
    struct ListNode* next;
};
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode* newlist = (struct ListNode*) malloc(sizeof(struct ListNode));
    newlist->val = 0;
    newlist->next=NULL;
    while(list1!=NULL && list2!=NULL) {
        if(list1->val<list2->val) {
            insert_at_end(newlist,list1->val);
            list1=list1->next;
        } else if (list2->val<list1->val) {
            insert_at_end(newlist,list2->val);
            list2=list2->next;
        } else {
            insert_at_end(newlist,list1->val);
            list1=list1->next;
            insert_at_end(newlist,list2->val);
            list2=list2->next;
        }
    }
    while(list1!=NULL) {
        insert_at_end(newlist,list1->val);
        list1=list1->next;
    }
    while(list2!=NULL) {
        insert_at_end(newlist,list2->val);
        list2=list2->next;
    }
    struct ListNode* temp;
    temp = newlist;
    newlist=newlist->next;
    free(temp);
    return newlist;
}
void insert_at_end(struct ListNode* first,int x) {
    if(first==NULL) {
        printf("\nEmpty list\n");
        return;
    }
    struct ListNode *temp,*q,*p;
    for(q = first ; q -> next != NULL ; q = q -> next) {
        continue;
    }
    temp = (struct ListNode*) malloc(sizeof(struct ListNode));
    temp -> val = x;
    temp -> next = NULL;
    q -> next = temp;
    return;
}