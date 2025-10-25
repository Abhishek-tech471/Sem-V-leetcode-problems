// Last updated: 10/25/2025, 3:55:44 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a =1;
        List<Integer> ll = new ArrayList<>();
        for(int i = 1; i<n;i++){
            if(nums[i]==nums[i-1]){
                a++;
            }
            else{
                if(a>n/3){
                    ll.add(nums[i-1]);
                }
                a=1;

            }
        }
        if(a>n/3){
                    ll.add(nums[nums.length-1]);
                }
        return ll;
    }
}