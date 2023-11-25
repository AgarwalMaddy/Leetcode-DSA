<!-- 1685. Sum of Absolute Differences in a Sorted Array -->

<h1>
  <a href="https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/?envType=daily-question&envId=2023-11-25">1685. Sum of Absolute Differences in a Sorted Array</a>
</h1>

<h2>Problem Description</h2>

<p>
  You are given an integer array <code>nums</code> sorted in non-decreasing order.
</p>

<p>
  Build and return an integer array <code>result</code> with the same length as <code>nums</code> such that <code>result[i]</code> is equal to the summation of absolute differences between <code>nums[i]</code> and all the other elements in the array.
</p>

<p>
  In other words, <code>result[i]</code> is equal to <code>sum(|nums[i]-nums[j]|)</code> where <code>0 <= j < nums.length</code> and <code>j != i</code> (0-indexed).
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = [2,3,5]
</pre>

<strong>Output:</strong>

<pre>
[4,3,5]
</pre>

<strong>Explanation:</strong>

<p>
  Assuming the arrays are 0-indexed, then<br>
  <code>result[0] = |2-2| + |2-3| + |2-5| = 0 + 1 + 3 = 4</code>,<br>
  <code>result[1] = |3-2| + |3-3| + |3-5| = 1 + 0 + 2 = 3</code>,<br>
  <code>result[2] = |5-2| + |5-3| + |5-5| = 3 + 2 + 0 = 5</code>.
</p>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = [1,4,6,8,10]
</pre>

<strong>Output:</strong>

<pre>
[24,15,13,15,21]
</pre>

<h2>Constraints:</h2>

<ul>
  <li><code>2 <= nums.length <= 105</code></li>
  <li><code>1 <= nums[i] <= nums[i + 1] <= 10^4</code></li>
</ul>

<!-- End of 1685. Sum of Absolute Differences in a Sorted Array -->
