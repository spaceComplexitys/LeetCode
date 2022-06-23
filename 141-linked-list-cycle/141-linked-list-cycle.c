/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    // Save the val of pos in a array 
   struct ListNode *slow = head;
   struct ListNode *fast = NULL;

    if(!head || !(head->next))
        return false;
    
    fast=head->next;
    
    while(slow!=fast)
    {
        if(fast==NULL)
        {
            return false;
        }
        slow=slow->next;
        if(fast->next && fast->next->next)
            fast=fast->next->next;
        else
            fast = fast->next;
    }
    return true;
}