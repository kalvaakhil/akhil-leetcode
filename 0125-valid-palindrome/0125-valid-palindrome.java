class Solution {
    public boolean isPalindrome(String s) {
                String normalized = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        // Check if the normalized string reads the same forward and backward
        int left = 0;
        int right = normalized.length() - 1;
        
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    // }
}