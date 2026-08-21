public class Elevator_Requests1 {
    public int elevatorRequests(int n, int[] requests) {
        int len=requests.length;
        int sum=requests[0];
        for(int i=1;i<len;i++){
            int diff=Math.abs(requests[i-1]-requests[i]);
            sum+=diff;
        }
        return sum;
        //TC-> O(n).
        //SC-> O(1).
    }
}
