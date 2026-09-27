package Heap;

import java.util.Arrays;


public class MeetingRoomsIIIBruteForce {

    public static int find(int n, int[][] meetings) {

//        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
//
//        long[] endTimesOfRooms = new long[n];
//        int[] counts = new int[n];
////[1,20],[2,10],[3,5],[4,9],[6,8]
//        for (int i = 0; i < meetings.length; i++) {
////[1,20],[2,10]
//            int startTime = meetings[i][0];
//            int endTime = meetings[i][1];
//     //st=1,et=20,minInd=0
//            int minInd = 0;
//            boolean isRoomAllocated = false;
//
//            for (int room = 0; room < n; room++) {
//                if (startTime >= endTimesOfRooms[room]) {
//                    endTimesOfRooms[room] = endTime;
//
//                    counts[room]++;
//                    isRoomAllocated = true;
//
//                    break;
//                }
//
//
//
//                if (endTimesOfRooms[room] < endTimesOfRooms[minInd]) {
//                    minInd = room;
//
//                }
//            }
//
//            // No room available -> delay meeting
//            if (!isRoomAllocated) {
//                long duration = endTime - startTime;
//
//                endTimesOfRooms[minInd] =
//                        endTimesOfRooms[minInd] + duration;
//
//                counts[minInd]++;
//            }
        Arrays.sort(meetings,(a,b)->a[0]-b[0]);
int counts[] = new int[n];
int endTimes[] = new int[n];
for(int i=0;i<meetings.length;i++){
    int startTime = meetings[i][0];
    int endTime = meetings[i][1];
    int minInd=0;
    boolean isRoomAllocated=false;
    for(int room=0;room<n;room++){
        if(startTime>=endTimes[room]){
          endTimes[room] = endTime;
          counts[room]++;
          isRoomAllocated=true;
          break;
        }
        if(endTimes[room]<endTimes[minInd]){
            minInd = room;
        }
    }
    if(!isRoomAllocated){
        int duration = endTime-startTime;
        endTimes[minInd]+=duration;
        counts[minInd]++;
    }
}
int maxIndCount=0;
for(int i=0;i<counts.length;i++){
    if(counts[i]>counts[maxIndCount]){
        maxIndCount = i;
    }
}
return  maxIndCount;

    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 20},
                {2, 10},
                {3, 5},
                {4, 9},
                {6, 8}
        };

        System.out.println(find(3, arr));
    }
}