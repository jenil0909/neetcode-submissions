class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int len = people.length;
    Integer[] indices = IntStream.range(0, people.length)
                                     .boxed()
                                     .toArray(Integer[]::new);

        Arrays.sort(indices, Comparator.comparingInt(i -> people[i]));
        Arrays.sort(people);

       int left = 0, right = len-1;
        int boats = 0;
        
        while (left <= right){
           // # If the lightest and heaviest person can share a boat
            if (people[left] + people[right] <= limit){
                left += 1;
            }
            //# The heaviest person always gets a boat
            right -= 1;
            boats += 1;
        }
        return boats;

    }
}