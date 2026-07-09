class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
         int left = 0;
         int right = 0;
         int max = 0;
        

         
         while (right < s.length()){
            char ch = s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
                 int presentLength = right - left + 1;
                if ( presentLength > max ){
                    max = presentLength;
                }
             right ++;
            }
            else {

                set.remove(s.charAt(left));
                left++;

            }
         }

         return max ;
    }

}