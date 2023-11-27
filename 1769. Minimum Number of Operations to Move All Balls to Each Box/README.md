<!-- 1769. Minimum Number of Operations to Move All Balls to Each Box -->

<h1>
  <a href="https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/">1769. Minimum Number of Operations to Move All Balls to Each Box</a>
</h1>

<h2>Problem Description</h2>

<p>
  You have n boxes. You are given a binary string <code>boxes</code> of length n, where <code>boxes[i]</code> is '0' if the ith box is empty, and '1' if it contains one ball.
</p>

<p>
  In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if <code>abs(i - j) == 1</code>. Note that after doing so, there may be more than one ball in some boxes.
</p>

<p>
  Return an array <code>answer</code> of size n, where <code>answer[i]</code> is the minimum number of operations needed to move all the balls to the ith box.
</p>

<p>
  Each <code>answer[i]</code> is calculated considering the initial state of the boxes.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
boxes = "110"
</pre>

<strong>Output:</strong>

<pre>
[1,1,3]
</pre>

<strong>Explanation:</strong>

<p>
  The answer for each box is as follows:
</p>

<ol>
  <li>First box: you will have to move one ball from the second box to the first box in one operation.</li>
  <li>Second box: you will have to move one ball from the first box to the second box in one operation.</li>
  <li>Third box: you will have to move one ball from the first box to the third box in two operations, and move one ball from the second box to the third box in one operation.</li>
</ol>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
boxes = "001011"
</pre>

<strong>Output:</strong>

<pre>
[11,8,5,4,3,4]
</pre>

<h2>Constraints:</h2>

<ul>
  <li><code>n == boxes.length</code></li>
  <li><code>1 <= n <= 2000</code></li>
  <li><code>boxes[i]</code> is either '0' or '1'.</li>
</ul>

<!-- End of 1769. Minimum Number of Operations to Move All Balls to Each Box -->
