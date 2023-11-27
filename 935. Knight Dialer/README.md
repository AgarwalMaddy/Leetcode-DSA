<!-- 935. Knight Dialer -->

<h1>
  <a href="https://leetcode.com/problems/knight-dialer/?envType=daily-question&envId=2023-11-27">935. Knight Dialer</a>
</h1>

<h2>Problem Description</h2>

<p>
  The chess knight has a unique movement, it may move two squares vertically and one square horizontally, or two squares horizontally and one square vertically (with both forming the shape of an L). The possible movements of chess knight are shown in this diagaram:
</p>

<p>
  <img src="knight_moves_diagram.png" alt="Knight Moves Diagram" width="300">
</p>

<p>
  A chess knight can move as indicated in the chess diagram below:
</p>

<p>
  <img src="knight_phone_pad.png" alt="Knight Phone Pad" width="300">
</p>

<p>
  We have a chess knight and a phone pad as shown above, the knight can only stand on a numeric cell (i.e. blue cell).
</p>

<p>
  Given an integer n, return how many distinct phone numbers of length n we can dial.
</p>

<p>
  You are allowed to place the knight on any numeric cell initially and then you should perform n - 1 jumps to dial a number of length n. All jumps should be valid knight jumps.
</p>

<p>
  As the answer may be very large, return the answer modulo 10<sup>9</sup> + 7.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
n = 1
</pre>

<strong>Output:</strong>

<pre>
10
</pre>

<strong>Explanation:</strong>

<p>
  We need to dial a number of length 1, so placing the knight over any numeric cell of the 10 cells is sufficient.
</p>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
n = 2
</pre>

<strong>Output:</strong>

<pre>
20
</pre>

<strong>Explanation:</strong>

<p>
  All the valid numbers we can dial are [04, 06, 16, 18, 27, 29, 34, 38, 40, 43, 49, 60, 61, 67, 72, 76, 81, 83, 92, 94]
</p>

<h3>Example 3:</h3>

<p><strong>Input:</strong></p>

<pre>
n = 3131
</pre>

<strong>Output:</strong>

<pre>
136006598
</pre>

<strong>Explanation:</strong>

<p>
  Please take care of the mod.
</p>

<h2>Constraints:</h2>

<ul>
  <li><code>1 <= n <= 5000</code></li>
</ul>

<!-- End of 935. Knight Dialer -->
