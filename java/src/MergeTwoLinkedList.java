package java.src;

public class MergeTwoLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=new ListNode(-1);
        ListNode ans=temp;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                ans.next=list1;
                list1=list1.next;
            }else{
                ans.next=list2;
                list2=list2.next;
            }
            ans=ans.next;
        }
        ans.next = list1==null?list2:list1;
        return temp.next;
    }
}