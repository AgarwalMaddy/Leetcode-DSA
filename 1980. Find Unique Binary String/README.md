<!-- 1980. Find Unique Binary String -->

<h1>
  <a href="https://leetcode.com/problems/find-unique-binary-string/?envType=daily-question&envId=2023-11-16">1980. Find Unique Binary String</a>
</h1>

<h2>Problem Description</h2>

<p>
  Given an array of strings <code>nums</code> containing <code>n</code> unique binary strings each of length <code>n</code>, return a binary string of length <code>n</code> that does not appear in <code>nums</code>. If there are multiple answers, you may return any of them.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = ["01","10"]
</pre>

<strong>Output:</strong>

<pre>
"11"
</pre>

<strong>Explanation:</strong>

<p>
  "11" does not appear in <code>nums</code>. "00" would also be correct.
</p>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = ["00","01"]
</pre>

<strong>Output:</strong>

<pre>
"11"
</pre>

<strong>Explanation:</strong>

<p>
  "11" does not appear in <code>nums</code>. "10" would also be correct.
</p>

<h3>Example 3:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = ["111","011","001"]
</pre>

<strong>Output:</strong>

<pre>
"101"
</pre>

<strong>Explanation:</strong>

<p>
  "101" does not appear in <code>nums</code>. "000", "010", "100", and "110" would also be correct.
</p>

<h2>Constraints:</h2>

<ul>
  <li><code>n == nums.length</code></li>
  <li><code>1 <= n <= 16</code></li>
  <li><code>nums[i].length == n</code></li>
  <li><code>nums[i]</code> is either '0' or '1'.</li>
  <li>All the strings of <code>nums</code> are unique.</li>
</ul>

<!-- End of 1980. Find Unique Binary String -->
