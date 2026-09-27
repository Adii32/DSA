package MergeIntervals;
class CarPooling {

    public boolean carPooling(int[][] trips, int capacity) {
//leetcode 1094
        //
      //Input: trips = [[2,1,5],[3,3,7]], capacity = 4
        //Output: false
        int count[] = new int[1001];

        for (int trip[] : trips) {

            int passenger = trip[0];
            int start = trip[1];
            int end = trip[2];

            // Passengers enter
            count[start] += passenger;

            // Passengers leave
            count[end] -= passenger;
        }

        int c = 0;

        // Calculate current passengers at every location
        for (int val : count) {

            c += val;

            // Capacity exceeded
            if (c > capacity) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        CarPooling obj = new CarPooling();

        int[][] trips = {
                {2, 1, 5},
                {3, 3, 7}
        };

        int capacity = 4;

        boolean result = obj.carPooling(trips, capacity);

        System.out.println("Can complete all trips: " + result);
    }
}