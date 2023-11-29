<!-- 191. Number of 1 Bits -->

<h1>
  <a href="https://leetcode.com/problems/number-of-1-bits/?envType=daily-question&envId=2023-11-29">191. Number of 1 Bits</a>
</h1>

<h2>Problem Description</h2>

<p>
  Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
</p>

<p><strong>Note:</strong></p>

<p>
  Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
</p>

<p>
  In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
n = 00000000000000000000000000001011
</pre>

<strong>Output:</strong>

<pre>
3
</pre>

<strong>Explanation:</strong>

<p>
  The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
</p>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
n = 00000000000000000000000010000000
</pre>

<strong>Output:</strong>

<pre>
1
</pre>

<strong>Explanation:</strong>

<p>
  The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
</p>

<h3>Example 3:</h3>

<p><strong>Input:</strong></p>

<pre>
n = 11111111111111111111111111111101
</pre>

<strong>Output:</strong>

<pre>
31
</pre>

<strong>Explanation:</strong>

<p>
  The input binary string 11111111111111111111111111111101 has a total of thirty-one '1' bits.
</p>

<h2>Constraints:</h2>

<p>
  The input must be a binary string of length 32.
</p>

<p><strong>Follow up:</strong></p>

<p>
  If this function is called many times, how would you optimize it?
</p>

<!-- End of 191. Number of 1 Bits -->
