/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* removeNthFromEnd(struct ListNode* head, int n){

    // Remove the index = length - n
    
    struct ListNode *temp = head;
    
    int count_of_nodes = 0;
    
    while (temp != NULL) {
        count_of_nodes++;
        temp = temp->next;
    }
    
    // Edge case: if one node free and set to null
    
     // Edge case: if two node free and set the second to null;
    
    if (count_of_nodes == 1) {
        free(head);
        head = NULL;
        return head;
    } 
    else if (count_of_nodes == 2) {
        if (n == 1) {
           head->next = NULL;
        } else {
            struct ListNode *firstNode = head;
            head = head->next;
            firstNode->next = NULL;
            free(firstNode);
        }
        
        return head;
    } 
    
    // Get to the n element of the target, save a temporary variable
    
    // detach link from n-1 element 
    
    // n-1 element attach to n+1 elemnt
    
    // detetch n element from n+1 element
    
    // free n element
    
    // set n element to null
    
    else {
        struct ListNode *prev_node = head;
        
        struct ListNode *cur_node = head;
        
        if (n == count_of_nodes) {
            head = head->next;
        } 
        else {
            for (int i = 0; i < count_of_nodes-n; i++) {
                cur_node = cur_node->next;
            }
        
            for (int i = 0; i < (count_of_nodes-n)-1; i++) {
                prev_node = prev_node->next;
            }
        
            prev_node->next = NULL;
            prev_node->next = cur_node->next;
            cur_node->next = NULL;
            free(cur_node);
        
        }
        
        return head;
    }
    
    
}
