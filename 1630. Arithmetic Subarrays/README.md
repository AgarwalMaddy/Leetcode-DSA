<!-- 1630. Arithmetic Subarrays -->

<h1>
  <a href="https://leetcode.com/problems/arithmetic-subarrays/?envType=daily-question&envId=2023-11-23">1630. Arithmetic Subarrays</a>
</h1>

<h2>Problem Description</h2>

<p>
  A sequence of numbers is called arithmetic if it consists of at least two elements, and the difference between every two consecutive elements is the same. More formally, a sequence <code>s</code> is arithmetic if and only if <code>s[i+1] - s[i] == s[1] - s[0]</code> for all valid <code>i</code>.
</p>

<p>
  For example, these are arithmetic sequences:
</p>

<ul>
  <li>1, 3, 5, 7, 9</li>
  <li>7, 7, 7, 7</li>
  <li>3, -1, -5, -9</li>
</ul>

<p>
  The following sequence is not arithmetic:
</p>

<ul>
  <li>1, 1, 2, 5, 7</li>
</ul>

<p>
  You are given an array of <code>n</code> integers, <code>nums</code>, and two arrays of <code>m</code> integers each, <code>l</code> and <code>r</code>, representing the <code>m</code> range queries, where the <code>ith</code> query is the range [<code>l[i]</code>, <code>r[i]</code>]. All the arrays are 0-indexed.
</p>

<p>
  Return a list of boolean elements <code>answer</code>, where <code>answer[i]</code> is true if the subarray <code>nums[l[i]]</code>, <code>nums[l[i]+1]</code>, ... , <code>nums[r[i]]</code> can be rearranged to form an arithmetic sequence, and false otherwise.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = [4,6,5,9,3,7], l = [0,0,2], r = [2,3,5]
</pre>

<strong>Output:</strong>

<pre>
[true,false,true]
</pre>

<strong>Explanation:</strong>

<p>
  In the 0th query, the subarray is [4,6,5]. This can be rearranged as [6,5,4], which is an arithmetic sequence.<br>
  In the 1st query, the subarray is [4,6,5,9]. This cannot be rearranged as an arithmetic sequence.<br>
  In the 2nd query, the subarray is [5,9,3,7]. This can be rearranged as [3,5,7,9], which is an arithmetic sequence.
</p>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = [-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10], l = [0,1,6,4,8,7], r = [4,4,9,7,9,10]
</pre>

<strong>Output:</strong>

<pre>
[false,true,false,false,true,true]
</pre>

<h2>Constraints:</h2>

<ul>
  <li><code>n == nums.length</code></li>
  <li><code>m == l.length</code></li>
  <li><code>m == r.length</code></li>
  <li><code>2 <= n <= 500</code></li>
  <li><code>1 <= m <= 500</code></li>
  <li><code>0 <= l[i] < r[i] < n</code></li>
  <li><code>-10^5 <= nums[i] <= 10^5</code></li>
</ul>

<!-- End of 1630. Arithmetic Subarrays -->
