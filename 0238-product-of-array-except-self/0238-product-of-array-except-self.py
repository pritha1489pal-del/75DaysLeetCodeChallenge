class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        answer = [1] * n

        # Prefix products
        p= 1
        for i in range(n):
            answer[i] = p
            p*= nums[i]

        # Suffix products
        s= 1
        for i in range(n - 1, -1, -1):
            answer[i] *= s
            s*= nums[i]

        return answer
