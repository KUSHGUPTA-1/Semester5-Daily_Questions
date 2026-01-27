import java.util.*;
public class Time_Needed_To_Buy_Tickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        //Optimised Approach.
        int time=0;
        for(int i=0;i<tickets.length;i++){
            //k se phele wale elements ke liye hame atleast k pe jitne tickets hai utne times hatana pdega.(Increment time).
            if(i<=k){
                time+=Math.min(tickets[i],tickets[k]);
            }
            //K ke baad wale elements ke liye hame unhe k pe jitne tickets hai unse ek kam baar tk hatana hoga as after that vo queue mai k ke baad finish honge.(Increment time). 
            else{
                time+=Math.min(tickets[i],tickets[k]-1);
            }
        }
        return time;
        //TC->O(N).
        //SC->O(1).

        //Brute force using the Queue.
        // Queue<Integer> q=new LinkedList<>();
        // for(int i=0;i<tickets.length;i++){  
        //     q.offer(i);
        // }
        // //Initially time is zero.
        // int time=0;
        // //Iterate till queue is empty.
        // while(!q.isEmpty()){
        //     int rm=q.poll(); //Person buys the ticket.
        //     tickets[rm]--; //tickets ek se kam honge.
        //     time++; //time 1 second se increment for every purchase.
        //     //If the person is finished buying and is k,then stop.
        //     if(tickets[rm]==0 && rm==k){
        //         break;
        //     }
        //     if(tickets[rm]>0){ //if one person not buys all tickets then goes to end of queue.
        //         q.offer(rm);
        //     }
        // }
        // return time;
        //TC->O(N*M).
        //SC->O(N).
    }
}