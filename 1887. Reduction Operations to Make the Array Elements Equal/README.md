<!-- 1887. Reduction Operations to Make the Array Elements Equal -->

<h1>
  <a href="https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal/description/?envType=daily-question&envId=2023-11-19">1887. Reduction Operations to Make the Array Elements Equal</a>
</h1>

<h2>Problem Description</h2>

<p>
  Given an integer array <code>nums</code>, your goal is to make all elements in <code>nums</code> equal. To complete one operation, follow these steps:
</p>

<ol>
  <li>Find the largest value in <code>nums</code>. Let its index be <code>i</code> (0-indexed) and its value be <code>largest</code>. If there are multiple elements with the largest value, pick the smallest <code>i</code>.</li>
  <li>Find the next largest value in <code>nums</code> strictly smaller than <code>largest</code>. Let its value be <code>nextLargest</code>.</li>
  <li>Reduce <code>nums[i]</code> to <code>nextLargest</code>.</li>
</ol>

<p>
  Return the number of operations to make all elements in <code>nums</code> equal.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = [5,1,3]
</pre>

<strong>Output:</strong>

<pre>
3
</pre>

<strong>Explanation:</strong>

<p>
  It takes 3 operations to make all elements in <code>nums</code> equal:<br>
  1. <code>largest = 5</code> at index <code>0</code>. <code>nextLargest = 3</code>. Reduce <code>nums[0]</code> to <code>3</code>. <code>nums = [3,1,3]</code>.<br>
  2. <code>largest = 3</code> at index <code>0</code>. <code>nextLargest = 1</code>. Reduce <code>nums[0]</code> to <code>1</code>. <code>nums = [1,1,3]</code>.<br>
  3. <code>largest = 3</code> at index <code>2</code>. <code>nextLargest = 1</code>. Reduce <code>nums[2]</code> to <code>1</code>. <code>nums = [1,1,1]</code>.
</p>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = [1,1,1]
</pre>

<strong>Output:</strong>

<pre>
0
</pre>

<strong>Explanation:</strong>

<p>
  All elements in <code>nums</code> are already equal.
</p>

<h3>Example 3:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = [1,1,2,2,3]
</pre>

<strong>Output:</strong>

<pre>
4
</pre>

<strong>Explanation:</strong>

<p>
  It takes 4 operations to make all elements in <code>nums</code> equal:<br>
  1. <code>largest = 3</code> at index <code>4</code>. <code>nextLargest = 2</code>. Reduce <code>nums[4]</code> to <code>2</code>. <code>nums = [1,1,2,2,2]</code>.<br>
  2. <code>largest = 2</code> at index <code>2</code>. <code>nextLargest = 1</code>. Reduce <code>nums[2]</code> to <code>1</code>. <code>nums = [1,1,1,2,2]</code>.<br>
  3. <code>largest = 2</code> at index <code>3</code>. <code>nextLargest = 1</code>. Reduce <code>nums[3]</code> to <code>1</code>. <code>nums = [1,1,1,1,2]</code>.<br>
  4. <code>largest = 2</code> at index <code>4</code>. <code>nextLargest = 1</code>. Reduce <code>nums[4]</code> to <code>1</code>. <code>nums = [1,1,1,1,1]</code>.
</p>

<h2>Constraints:</h2>

<ul>
  <li><code>1 <= nums.length <= 5 * 10^4</code></li>
  <li><code>1 <= nums[i] <= 5 * 10^4</code></li>
</ul>

<!-- End of 1887. Reduction Operations to Make the Array Elements Equal -->
