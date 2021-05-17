package com.practice.P1_100.P51_60;

/**
 * NO.50 跳跃游戏
 * 给定一个非负整数数组nums ，你最初位于数组的 第一个下标 。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个下标。
 *
 * 示例1：
 * 输入：nums = [2,3,1,1,4]
 * 输出：true
 * 解释：可以先跳 1 步，从下标 0 到达下标 1, 然后再从下标 1 跳 3 步到达最后一个下标。
 *
 * 示例2：
 * 输入：nums = [3,2,1,0,4]
 * 输出：false
 * 解释：无论怎样，总会到达下标为 3 的位置。但该下标的最大跳跃长度是 0 ， 所以永远不可能到达最后一个下标。
 *
 * 提示：
 * 1 <= nums.length <= 3 * 104
 * 0 <= nums[i] <= 105
 */
public class CanJump {
    /**
     * 看到这道题第一反应，有点刷回溯dfs刷的走火入魔了，第一反应竟然是画树，dfs！爷直接穷举剪枝深度遍历
     * 但一看标签，用贪心，算了，明天再复习一遍贪心再说把
     * @param nums
     * @return
     */
    public boolean solution(int[] nums){

        return false;
    }
}
