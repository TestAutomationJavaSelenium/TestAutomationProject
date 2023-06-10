import java.util.*;

public class Session20_PriorityQueue {

    Scanner sc = new Scanner(System.in);
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    Deque<Integer> deque = new ArrayDeque<>();


    public static void main(String[] args) {
        Session20_PriorityQueue session20PriorityQueue = new Session20_PriorityQueue();
        //session20PriorityQueue.priorityQueue();
        //session20PriorityQueue.dequePass();
        session20PriorityQueue.dequePass();

    }

    public void priorityQueue() {

        priorityQueue.add(23);
        priorityQueue.add(56);
        priorityQueue.add(564);
        priorityQueue.add(676);
        priorityQueue.add(5);
        priorityQueue.add(6);
        System.out.println(priorityQueue);
        priorityQueue.remove(5);
        System.out.println("head is at " + priorityQueue.element());
        System.out.println(priorityQueue);
        System.out.println("peek " + priorityQueue.peek());
        System.out.println(priorityQueue);
        System.out.println("peek " + priorityQueue.poll());
        System.out.println(priorityQueue);
        priorityQueue.remove();
        System.out.println(priorityQueue);
        priorityQueueAdd();
        System.out.println("element added in priority queue using dynamic method " + priorityQueue);
        System.out.println("passing priority queue in list");
        listQueue(priorityQueue);

    }

    public PriorityQueue<Integer> priorityQueueAdd() {

        System.out.println("enter size of queue");
        int size = sc.nextInt();
        System.out.println("pls enter element in Priority queue");
        for (int i = 0; i < size; i++) {
            priorityQueue.add(sc.nextInt());
        }
        return priorityQueue;
    }

    public void listQueue(PriorityQueue<Integer> priorityQueue1) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(priorityQueue1);
        System.out.println(list1);
        list1.remove(4);
        System.out.println("list after removing index 4 :" + list1);
    }

    public Deque<Integer> dequeAdd() {

        System.out.println("enter size of queue");
        int size = sc.nextInt();
        System.out.println("pls enter element in  deque");
        for (int i = 0; i < size; i++) {
            deque.add(sc.nextInt());
        }
        return deque;
    }

    public void dequePass() {
//        dequeAdd();
        System.out.println(dequeAdd());
        deque.offer(1994);
        System.out.println(deque);
        deque.add(45);
        //deque.add(null);
        System.out.println(deque);
        System.out.println("element method will give " + deque.element());
        System.out.println(deque);
        System.out.println("remove from deque " + deque.remove());
        System.out.println(deque);
        System.out.println("poll method " + deque.poll());
        System.out.println(deque);
        System.out.println("peek method " + deque.peek());
        System.out.println(deque);
        System.out.println("peek first " + deque.peekFirst());
        System.out.println(deque);
        System.out.println("peek last " + deque.peekLast());
        System.out.println(deque);
        System.out.println("add first " + deque.offerFirst(34));
        System.out.println(deque);
        System.out.println("add last " + deque.offerLast(67));
        System.out.println(deque);

        System.out.println("enter element in front and end of deque");
        for (int i = 0; i < 3; i++) {
            deque.offerFirst(sc.nextInt());
            deque.offerLast(sc.nextInt());
        }
//        System.out.println("element after adding in deque "+deque);
//        return deque;
        copyDequeIntoListAndPriorityQueue(deque);

    }

//    public void passingDeque(){
//        List<Integer>list1=new ArrayList<>();
//        list1.addAll(dequePass());
//        System.out.println(list1);
//
//    }

    public void copyDequeIntoListAndPriorityQueue(Deque<Integer> manisha) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(manisha);
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.addAll(manisha);
        System.out.println(list1);
        System.out.println(priorityQueue2);
    }

}
