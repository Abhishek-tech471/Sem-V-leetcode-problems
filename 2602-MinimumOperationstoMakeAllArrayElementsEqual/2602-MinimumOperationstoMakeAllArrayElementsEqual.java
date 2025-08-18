// Last updated: 8/18/2025, 6:12:10 PM
class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {
        Arrays.sort(nums);

        List<Long> ll = new ArrayList<>();
        List<Long> sum = new ArrayList<>();
        sum.add((long)nums[0]);
        for(int i=1; i<nums.length;i++){
            sum.add(sum.get(i-1)+nums[i]);
        }

        for(int i=0; i<queries.length;i++){
            int a= queries[i];
            int mid= mid(nums,a);
            
            long left = sum.get(mid);
            long right = sum.get(sum.size()-1)-left;
            System.out.println(mid);
            ll.add(Math.abs(left-a*(long)(mid+1))+Math.abs(right-a*(long)(nums.length-(mid+1))));
            
        }
        return ll;
    }

    public int mid(int [] nums, int i){
        int lo=0;
        int hi = nums.length-1;
        int ans=0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]<=i){
                ans = mid;
                lo=mid+1;   
            }
            else{
                hi= mid-1;
            }
        }
        return ans;
    }
}