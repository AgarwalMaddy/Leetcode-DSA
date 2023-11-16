<!-- 2543. Check if Point Is Reachable -->

<h1>
  <a href="https://leetcode.com/problems/check-if-point-is-reachable/">2543. Check if Point Is Reachable</a>
</h1>

<h2>Problem Description</h2>

<p>
  There exists an infinitely large grid. You are currently at point (1, 1), and you need to reach the point <code>(targetX, targetY)</code> using a finite number of steps.
</p>

<p>
  In one step, you can move from point <code>(x, y)</code> to any one of the following points:
</p>

<ol>
  <li><code>(x, y - x)</code></li>
  <li><code>(x - y, y)</code></li>
  <li><code>(2 * x, y)</code></li>
  <li><code>(x, 2 * y)</code></li>
</ol>

<p>
  Given two integers <code>targetX</code> and <code>targetY</code> representing the X-coordinate and Y-coordinate of your final position, return <code>true</code> if you can reach the point from <code>(1, 1)</code> using some number of steps, and <code>false</code> otherwise.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
targetX = 6, targetY = 9
</pre>

<strong>Output:</strong>

<pre>
false
</pre>

<strong>Explanation:</strong>

<p>
  It is impossible to reach <code>(6,9)</code> from <code>(1,1)</code> using any sequence of moves, so <code>false</code> is returned.
</p>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
targetX = 4, targetY = 7
</pre>

<strong>Output:</strong>

<pre>
true
</pre>

<strong>Explanation:</strong>

<p>
  You can follow the path <code>(1,1) -> (1,2) -> (1,4) -> (1,8) -> (1,7) -> (2,7) -> (4,7)</code>.
</p>

<h2>Constraints:</h2>

<ul>
  <li><code>1 <= targetX, targetY <= 10^9</code></li>
</ul>

<!-- End of 2543. Check if Point Is Reachable -->
