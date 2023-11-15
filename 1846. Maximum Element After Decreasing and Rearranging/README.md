<!-- Maximum Value After Insertion -->

<h1>
  <a href="https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/?envType=daily-question&envId=2023-11-15">Maximum Value After Insertion</a>
</h1>

<h2>Problem Description</h2>

<p>
  You are given an array of positive integers <code>arr</code>. Perform some operations (possibly none) on <code>arr</code> so that it satisfies these conditions:
</p>

<ol>
  <li>The value of the first element in <code>arr</code> must be 1.</li>
  <li>The absolute difference between any 2 adjacent elements must be less than or equal to 1. In other words, <code>abs(arr[i] - arr[i - 1]) <= 1</code> for each <code>i</code> where <code>1 <= i < arr.length</code> (0-indexed). <code>abs(x)</code> is the absolute value of <code>x</code>.</li>
</ol>

<p>
  There are 2 types of operations that you can perform any number of times:
</p>

<ol>
  <li>Decrease the value of any element of <code>arr</code> to a smaller positive integer.</li>
  <li>Rearrange the elements of <code>arr</code> to be in any order.</li>
</ol>

<p>
  Return the maximum possible value of an element in <code>arr</code> after performing the operations to satisfy the conditions.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
arr = [2,2,1,2,1]
</pre>

<strong>Output:</strong>

<pre>
2
</pre>

<strong>Explanation:</strong>

<p>
  We can satisfy the conditions by rearranging <code>arr</code> so it becomes [1,2,2,2,1].<br>
  The largest element in <code>arr</code> is 2.
</p>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
arr = [100,1,1000]
</pre>

<strong>Output:</strong>

<pre>
3
</pre>

<strong>Explanation:</strong>

<p>
  One possible way to satisfy the conditions is by doing the following:<br>
  1. Rearrange <code>arr</code> so it becomes [1,100,1000].<br>
  2. Decrease the value of the second element to 2.<br>
  3. Decrease the value of the third element to 3.<br>
  Now <code>arr</code> = [1,2,3], which satisfies the conditions.<br>
  The largest element in <code>arr</code> is 3.
</p>

<h3>Example 3:</h3>

<p><strong>Input:</strong></p>

<pre>
arr = [1,2,3,4,5]
</pre>

<strong>Output:</strong>

<pre>
5
</pre>

<strong>Explanation:</strong>

<p>
  The array already satisfies the conditions, and the largest element is 5.
</p>

<h2>Constraints:</h2>

<ul>
  <li><code>1 <= arr.length <= 105</code></li>
  <li><code>1 <= arr[i] <= 10^9</code></li>
</ul>

<!-- End of Maximum Value After Insertion -->
