/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* middleNode(struct ListNode* head){
    int count_of_nodes = 0;
    
    struct ListNode *temp = head;

    while (temp != NULL) {
        count_of_nodes++;
        temp = temp->next;
    }
        
    for (int i = 0; i < (count_of_nodes/2); i++) {
        head = head->next;
    }
     
    return head;
}
