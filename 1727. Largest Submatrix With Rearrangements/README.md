<!-- 1727. Largest Submatrix With Rearrangements -->

<h1>
  <a href="https://leetcode.com/problems/largest-submatrix-with-rearrangements/description/?envType=daily-question&envId=2023-11-26">1727. Largest Submatrix With Rearrangements</a>
</h1>

<h2>Problem Description</h2>

<p>
  You are given a binary matrix <code>matrix</code> of size <code>m x n</code>, and you are allowed to rearrange the columns of the matrix in any order.
</p>

<p>
  Return the area of the largest submatrix within <code>matrix</code> where every element of the submatrix is 1 after reordering the columns optimally.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
matrix = [[0,0,1],[1,1,1],[1,0,1]]
</pre>

<strong>Output:</strong>

<pre>
4
</pre>

<strong>Explanation:</strong>

<p>
  You can rearrange the columns as shown above.<br>
  The largest submatrix of 1s, in bold, has an area of 4.
</p>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
matrix = [[1,0,1,0,1]]
</pre>

<strong>Output:</strong>

<pre>
3
</pre>

<strong>Explanation:</strong>

<p>
  You can rearrange the columns as shown above.<br>
  The largest submatrix of 1s, in bold, has an area of 3.
</p>

<h3>Example 3:</h3>

<p><strong>Input:</strong></p>

<pre>
matrix = [[1,1,0],[1,0,1]]
</pre>

<strong>Output:</strong>

<pre>
2
</pre>

<strong>Explanation:</strong>

<p>
  Notice that you must rearrange entire columns, and there is no way to make a submatrix of 1s larger than an area of 2.
</p>

<h2>Constraints:</h2>

<ul>
  <li><code>m == matrix.length</code></li>
  <li><code>n == matrix[i].length</code></li>
  <li><code>1 <= m * n <= 10^5</code></li>
  <li><code>matrix[i][j]</code> is either <code>0</code> or <code>1</code>.</li>
</ul>

<!-- End of 1727. Largest Submatrix With Rearrangements -->
