// Last updated: 2/8/2026, 1:37:00 AM
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> hash= new HashSet<>();
        int count =0;
        for(String s : words){
            String rev= new StringBuilder(s).reverse().toString();
            if(hash.contains(rev)){
                count ++;
            }
            else{
                hash.add(s);
            }
        }
        return count;
    }
}