class Solution {
      public int minLengthAfterRemovals(List<Integer> input) {
        Map<Integer, Integer> map = new HashMap<>();
        // Step 1: Create a frequency map to count occurrences of each number
        for (int num : input) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
       // Step 2: Create a max heap to store numbers and their frequencies in descending order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(map.values());

        while (maxHeap.size() > 1) {
            // Step 3: remove 2  numbers with the highest frequencies
            int first_max = maxHeap.poll();
            int second_max = maxHeap.poll();

            first_max--;
            second_max--;

            if (first_max != 0) maxHeap.offer(first_max);
            if (second_max != 0) maxHeap.offer(second_max);
        }

        int sum = 0;
		// Step 4: Calculate the minimum length
        while (maxHeap.size() > 0) {
            sum += maxHeap.poll();
        }

        return sum;
    }
}