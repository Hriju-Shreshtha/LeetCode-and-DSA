class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        i=0
        hashSet= {}
        while i<len(nums) :
            complementIndex= hashSet.get(nums[i])
            if complementIndex != None :
                return [i, complementIndex]
            hashSet[target-nums[i]]= i
            i+=1
        return nums


        