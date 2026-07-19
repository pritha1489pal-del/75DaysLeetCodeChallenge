class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        a = {}

        for i, num in enumerate(nums):
            complement = target - num

            if complement in a:
                return [a[complement], i]

            a[num] = i