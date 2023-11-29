<!-- 2147. Number of Ways to Divide a Long Corridor -->

<h1>
  <a href="https://leetcode.com/problems/number-of-ways-to-divide-a-long-corridor/?envType=daily-question&envId=2023-11-28">2147. Number of Ways to Divide a Long Corridor</a>
</h1>

<h2>Problem Description</h2>

<p>
  Along a long library corridor, there is a line of seats and decorative plants. You are given a 0-indexed string <code>corridor</code> of length n consisting of letters 'S' and 'P' where each 'S' represents a seat and each 'P' represents a plant.
</p>

<p>
  One room divider has already been installed to the left of index 0, and another to the right of index <code>n - 1</code>. Additional room dividers can be installed. For each position between indices <code>i - 1</code> and <code>i</code> (1 ≤ i ≤ n - 1), at most one divider can be installed.
</p>

<p>
  Divide the corridor into non-overlapping sections, where each section has exactly two seats with any number of plants. There may be multiple ways to perform the division. Two ways are different if there is a position with a room divider installed in the first way but not in the second way.
</p>

<p>
  Return the number of ways to divide the corridor. Since the answer may be very large, return it modulo 10<sup>9</sup> + 7. If there is no way, return 0.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
corridor = "SSPPSPS"
</pre>

<strong>Output:</strong>

<pre>
3
</pre>

<strong>Explanation:</strong>

<p>
  There are 3 different ways to divide the corridor.
</p>

<p>
  The black bars in the above image indicate the two room dividers already installed.
</p>

<p>
  Note that in each of the ways, each section has exactly two seats.
</p>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
corridor = "PPSPSP"
</pre>

<strong>Output:</strong>

<pre>
1
</pre>

<strong>Explanation:</strong>

<p>
  There is only 1 way to divide the corridor, by not installing any additional dividers.
</p>

<p>
  Installing any would create some section that does not have exactly two seats.
</p>

<h3>Example 3:</h3>

<p><strong>Input:</strong></p>

<pre>
corridor = "S"
</pre>

<strong>Output:</strong>

<pre>
0
</pre>

<strong>Explanation:</strong>

<p>
  There is no way to divide the corridor because there will always be a section that does not have exactly two seats.
</p>

<h2>Constraints:</h2>

<ul>
  <li><code>n == corridor.length</code></li>
  <li><code>1 ≤ n ≤ 10<sup>5</sup></code></li>
  <li><code>corridor[i]</code> is either 'S' or 'P'.</li>
</ul>

<!-- End of 2147. Number of Ways to Divide a Long Corridor -->
