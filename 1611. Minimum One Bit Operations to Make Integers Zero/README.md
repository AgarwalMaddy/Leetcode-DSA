<!-- 1611. Minimum One Bit Operations to Make Integers Zero -->

<h1>
  <a href="https://leetcode.com/problems/minimum-one-bit-operations-to-make-integers-zero/?envType=daily-question&envId=2023-11-30">1611. Minimum One Bit Operations to Make Integers Zero</a>
</h1>

<h2>Problem Description</h2>

<p>
  Given an integer n, you must transform it into 0 using the following operations any number of times:
</p>

<ol>
  <li>Change the rightmost (0th) bit in the binary representation of n.</li>
  <li>Change the ith bit in the binary representation of n if the (i-1)th bit is set to 1 and the (i-2)th through 0th bits are set to 0.</li>
</ol>

<p>
  Return the minimum number of operations to transform n into 0.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
n = 3
</pre>

<strong>Output:</strong>

<pre>
2
</pre>

<strong>Explanation:</strong>

<p>
  The binary representation of 3 is "11".
</p>

<ol>
  <li>"11" -> "01" with the 2nd operation since the 0th bit is 1.</li>
  <li>"01" -> "00" with the 1st operation.</li>
</ol>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
n = 6
</pre>

<strong>Output:</strong>

<pre>
4
</pre>

<strong>Explanation:</strong>

<p>
  The binary representation of 6 is "110".
</p>

<ol>
  <li>"110" -> "010" with the 2nd operation since the 1st bit is 1 and 0th through 0th bits are 0.</li>
  <li>"010" -> "011" with the 1st operation.</li>
  <li>"011" -> "001" with the 2nd operation since the 0th bit is 1.</li>
  <li>"001" -> "000" with the 1st operation.</li>
</ol>

<h2>Constraints:</h2>

<p>
  0 <= n <= 10^9
</p>

<!-- End of 1611. Minimum One Bit Operations to Make Integers Zero -->
