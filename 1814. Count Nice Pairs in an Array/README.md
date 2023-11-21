<!-- 1814. Count Nice Pairs in an Array -->

<h1>
  <a href="https://leetcode.com/problems/count-nice-pairs-in-an-array/description/?envType=daily-question&envId=2023-11-21">1814. Count Nice Pairs in an Array</a>
</h1>

<h2>Problem Description</h2>

<p>
  You are given an array <code>nums</code> that consists of non-negative integers. Let us define <code>rev(x)</code> as the reverse of the non-negative integer <code>x</code>. For example, <code>rev(123)</code> = 321, and <code>rev(120)</code> = 21. A pair of indices (i, j) is nice if it satisfies all of the following conditions:
</p>

<ul>
  <li><code>0 <= i < j < nums.length</code></li>
  <li><code>nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])</code></li>
</ul>

<p>
  Return the number of nice pairs of indices. Since that number can be too large, return it modulo 10^9 + 7.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = [42,11,1,97]
</pre>

<strong>Output:</strong>

<pre>
2
</pre>

<strong>Explanation:</strong>

<p>
  The two pairs are:<br>
  - (0,3) : 42 + rev(97) = 42 + 79 = 121, 97 + rev(42) = 97 + 24 = 121.<br>
  - (1,2) : 11 + rev(1) = 11 + 1 = 12, 1 + rev(11) = 1 + 11 = 12.
</p>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = [13,10,35,24,76]
</pre>

<strong>Output:</strong>

<pre>
4
</pre>

<h2>Constraints:</h2>

<ul>
  <li><code>1 <= nums.length <= 10^5</code></li>
  <li><code>0 <= nums[i] <= 10^9</code></li>
</ul>

<!-- End of 1814. Count Nice Pairs in an Array -->
