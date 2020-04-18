//给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。 
//
// 返回删除后的链表的头节点。 
//
// 注意：此题对比原题有改动 
//
// 示例 1: 
//
// 输入: head = [4,5,1,9], val = 5
//输出: [4,1,9]
//解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
// 
//
// 示例 2: 
//
// 输入: head = [4,5,1,9], val = 1
//输出: [4,5,9]
//解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
// 
//
// 
//
// 说明： 
//
// 
// 题目保证链表中节点的值互不相同 
// 若使用 C 或 C++ 语言，你不需要 free 或 delete 被删除的节点 
// 
// Related Topics 链表


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        //当头结点为空时；
        if (head == null) {
            return null;
        }

        //当头结点是删除的节点时；
        if (head.val == val) {
            return head.next;
        }

        //当删除的节点不是头结点时；
        //当前节点
        ListNode cur = head.next;
        //前一个节点
        ListNode pre = head;

        while (cur != null) {
            //当前节点就是删除的节点
            if (cur.val == val) {
                pre.next = cur.next;
                return head;
            } else { //当前结点不是删除的结点
                cur = cur.next;
                pre = pre.next;
            }
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
