class Solution(object):
    def uniqueOccurrences(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        frequency = {}

        for num in arr:
            frequency[num] = frequency.get(num, 0) + 1

        return len(frequency.values()) == len(set(frequency.values()))
    