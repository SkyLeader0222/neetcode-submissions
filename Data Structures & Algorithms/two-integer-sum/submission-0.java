class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapI = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp = target - nums[i];
            if(mapI.containsKey(comp))
                return new int[]{mapI.get(comp),i};
            mapI.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
}
