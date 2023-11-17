<!-- 1877. Minimize Maximum Pair Sum in Array -->

<h1>
  <a href="https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/?envType=daily-question&envId=2023-11-17">1877. Minimize Maximum Pair Sum in Array</a>
</h1>

<h2>Problem Description</h2>

<p>
  The pair sum of a pair <code>(a,b)</code> is equal to <code>a + b</code>. The maximum pair sum is the largest pair sum in a list of pairs.
</p>

<p>
  For example, if we have pairs <code>(1,5)</code>, <code>(2,3)</code>, and <code>(4,4)</code>, the maximum pair sum would be <code>max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8</code>.
</p>

<p>
  Given an array <code>nums</code> of even length <code>n</code>, pair up the elements of <code>nums</code> into <code>n / 2</code> pairs such that:
</p>

<ol>
  <li>Each element of <code>nums</code> is in exactly one pair, and</li>
  <li>The maximum pair sum is minimized.</li>
</ol>

<p>
  Return the minimized maximum pair sum after optimally pairing up the elements.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = [3,5,2,3]
</pre>

<strong>Output:</strong>

<pre>
7
</pre>

<strong>Explanation:</strong>

<p>
  The elements can be paired up into pairs <code>(3,3)</code> and <code>(5,2)</code>.<br>
  The maximum pair sum is <code>max(3+3, 5+2) = max(6, 7) = 7</code>.
</p>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
nums = [3,5,4,2,4,6]
</pre>

<strong>Output:</strong>

<pre>
8
</pre>

<strong>Explanation:</strong>

<p>
  The elements can be paired up into pairs <code>(3,5)</code>, <code>(4,4)</code>, and <code>(6,2)</code>.<br>
  The maximum pair sum is <code>max(3+5, 4+4, 6+2) = max(8, 8, 8) = 8</code>.
</p>

<h2>Constraints:</h2>

<ul>
  <li><code>n == nums.length</code></li>
  <li><code>2 <= n <= 10^5</code></li>
  <li><code>n</code> is even.</li>
  <li><code>1 <= nums[i] <= 10^5</code></li>
</ul>

<!-- End of 1877. Minimize Maximum Pair Sum in Array -->
