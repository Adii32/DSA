package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;
//
//class RoomEndTime{
//    long endTime;
//    int ind;
//    RoomEndTime(long endTime,int ind){
//        this.endTime = endTime;
//        this.ind = ind;
//    }
//}
//public class MeetingRoomsIIIOptimized {
//    public int find(int n,int meetings[][]) {
//        PriorityQueue<Integer> availableRooms = new PriorityQueue<>();
//        PriorityQueue<RoomEndTime> occupiedRooms = new PriorityQueue<>((a, b) -> {
//            if (a.endTime == b.endTime) {
//                return a.ind - b.ind;
//            }
//            return Long.compare(a.endTime, b.endTime);
//        });
//        int counts[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            availableRooms.add(i);
//        }
//        Arrays.sort(meetings,(a, b)->Integer.compare(a[0],b[0]));
//    for(int i=0;i<meetings.length;i++){
//        int startTime = meetings[i][0];
//        int endTime = meetings[i][1];
//        if(!occupiedRooms.isEmpty()){
//            if(startTime>=occupiedRooms.peek().endTime){
//                RoomEndTime ret = occupiedRooms.poll();
//                availableRooms.add(ret.ind);
//            }
//            else{
//                break;
//            }
//        }
//        if(availableRooms.isEmpty()){
//            RoomEndTime roomEndTime = occupiedRooms.poll();
//            long duration = endTime-startTime;
//            roomEndTime.endTime = roomEndTime.endTime+duration;
//            counts[roomEndTime.ind]++;
//            occupiedRooms.add(new RoomEndTime(roomEndTime.endTime,roomEndTime.ind));
//        }
//        else {
//            int room = availableRooms.poll();
//            counts[room]++;
//            occupiedRooms.add(new RoomEndTime(endTime,room));
//        }
//    }
//    int maxRoomCountInd = 0;
//    for(int i=1;i<n;i++){
//        if(counts[i]>counts[maxRoomCountInd]){
//            maxRoomCountInd =i;
//        }
//    }
//    return  maxRoomCountInd;
//    }
class EndTime{
    int endTime;
    int index;
    EndTime(int endTime,int index){
        this.endTime= endTime;
        this.index = index;
    }
}
public class MeetingRoomsIIIOptimized {
    public int find(int arr[][],int n) {
        PriorityQueue<Integer> availableRoom = new PriorityQueue<>();
        PriorityQueue<EndTime> occupiedRoom = new PriorityQueue<>((a, b) -> {
            if (a.endTime == b.endTime) {
                return a.index - b.index;
            }
            return Long.compare(a.endTime, b.endTime);
        });
      for(int i=0;i<n;i++){
          availableRoom.add(i);
      }
      int counts[] = new int[n];
      for(int i=0;i<arr.length;i++){
          int startTime = arr[i][0];
          int endTime = arr[i][1];
          while(!occupiedRoom.isEmpty()){
              if (startTime>=occupiedRoom.peek().endTime){
                  EndTime endTime1 = occupiedRoom.poll();
                  availableRoom.add(endTime1.index);
              }
              else {
                  break;
              }
          }
           if(availableRoom.isEmpty()){
               long duration = endTime-startTime;
             EndTime oc = occupiedRoom.poll();
             oc.endTime+=duration;
           counts[oc.index]++;
           occupiedRoom.add(new EndTime(oc.endTime,oc.index));
           }
           else {
               int roomIndex = availableRoom.poll();
               counts[roomIndex]++;
               occupiedRoom.add(new EndTime(endTime,roomIndex));
           }
      }
      int maxIndCount=0;
      for(int i=1;i<n;i++){
          if(counts[i]>counts[maxIndCount]){
              maxIndCount=i;
          }
      }
      return  maxIndCount;
    }
    public static void main(String [] args){
     int arr[][] = {{0,10},{1,5},{2,7},{3,4}};
     MeetingRoomsIIIOptimized mr = new MeetingRoomsIIIOptimized();
     System.out.println(mr.find(arr,2));
    }
}
