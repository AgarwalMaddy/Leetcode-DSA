<!-- 1561. Maximum Number of Coins You Can Get -->

<h1>
  <a href="https://leetcode.com/problems/maximum-number-of-coins-you-can-get/description/?envType=daily-question&envId=2023-11-24">1561. Maximum Number of Coins You Can Get</a>
</h1>

<h2>Problem Description</h2>

<p>
  There are 3n piles of coins of varying size, you and your friends will take piles of coins as follows:
</p>

<ul>
  <li>In each step, you will choose any 3 piles of coins (not necessarily consecutive).</li>
  <li>Of your choice, Alice will pick the pile with the maximum number of coins.</li>
  <li>You will pick the next pile with the maximum number of coins.</li>
  <li>Your friend Bob will pick the last pile.</li>
  <li>Repeat until there are no more piles of coins.</li>
</ul>

<p>
  Given an array of integers <code>piles</code> where <code>piles[i]</code> is the number of coins in the <code>ith</code> pile.
</p>

<p>
  Return the maximum number of coins that you can have.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
piles = [2,4,1,2,7,8]
</pre>

<strong>Output:</strong>

<pre>
9
</pre>

<strong>Explanation:</strong>

<p>
  Choose the triplet (2, 7, 8), Alice Pick the pile with 8 coins, you the pile with 7 coins and Bob the last one.<br>
  Choose the triplet (1, 2, 4), Alice Pick the pile with 4 coins, you the pile with 2 coins and Bob the last one.<br>
  The maximum number of coins which you can have are: 7 + 2 = 9.<br>
  On the other hand if we choose this arrangement (1, 2, 8), (2, 4, 7) you only get 2 + 4 = 6 coins which is not optimal.
</p>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
piles = [2,4,5]
</pre>

<strong>Output:</strong>

<pre>
4
</pre>

<h3>Example 3:</h3>

<p><strong>Input:</strong></p>

<pre>
piles = [9,8,7,6,5,1,2,3,4]
</pre>

<strong>Output:</strong>

<pre>
18
</pre>

<h2>Constraints:</h2>

<ul>
  <li><code>3 <= piles.length <= 105</code></li>
  <li><code>piles.length % 3 == 0</code></li>
  <li><code>1 <= piles[i] <= 10^4</code></li>
</ul>

<!-- End of 1561. Maximum Number of Coins You Can Get -->
