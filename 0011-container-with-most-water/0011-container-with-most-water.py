class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        lft= 0
        rght = len(height) - 1
        max_area = 0

        while lft < rght:
            width = rght - lft
            area = min(height[lft], height[rght]) * width
            max_area = max(max_area, area)

            if height[lft] < height[rght]:
                lft += 1
            else:
                rght -= 1

        return max_area