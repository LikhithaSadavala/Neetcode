class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for(final int num:nums){
            if(!unique.add(num)){
                return true;
        }
       }
        return false;
    }
}
