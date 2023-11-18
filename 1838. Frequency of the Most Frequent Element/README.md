<!-- 1838. Frequency of the Most Frequent Element -->

<h1>
  <a href="https://leetcode.com/problems/frequency-of-the-most-frequent-element/description/?envType=daily-question&envId=2023-11-18">1838. Frequency of the Most Frequent Element</a>
</h1>

<h2>Problem Description</h2>

<p>
  The frequency of an element is the number of times it occurs in an array.
</p>

<p>
  You are given an integer array <code>nums</code> and an integer <code>k</code>. In one operation, you can choose an index of <code>nums</code> and increment the element at that index by 1.
</p>

<p>
  Return the maximum possible frequency of an element after performing at most <code>k</code> operations.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = [1,2,4], k = 5
</pre>

<strong>Output:</strong>

<pre>
3
</pre>

<strong>Explanation:</strong>

<p>
  Increment the first element three times and the second element two times to make <code>nums = [4,4,4]</code>.<br>
  4 has a frequency of 3.
</p>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = [1,4,8,13], k = 5
</pre>

<strong>Output:</strong>

<pre>
2
</pre>

<strong>Explanation:</strong>

<p>
  There are multiple optimal solutions:<br>
  - Increment the first element three times to make <code>nums = [4,4,8,13]</code>. 4 has a frequency of 2.<br>
  - Increment the second element four times to make <code>nums = [1,8,8,13]</code>. 8 has a frequency of 2.<br>
  - Increment the third element five times to make <code>nums = [1,4,13,13]</code>. 13 has a frequency of 2.
</p>

<h3>Example 3:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = [3,9,6], k = 2
</pre>

<strong>Output:</strong>

<pre>
1
</pre>

<h2>Constraints:</h2>

<ul>
  <li><code>1 <= nums.length <= 10^5</code></li>
  <li><code>1 <= nums[i] <= 10^5</code></li>
  <li><code>1 <= k <= 10^5</code></li>
</ul>

<!-- End of 1838. Frequency of the Most Frequent Element -->
