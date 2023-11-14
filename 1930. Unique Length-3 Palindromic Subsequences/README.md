<!-- 1930. Unique Length-3 Palindromic Subsequences -->

<h1>
  <a href="https://leetcode.com/problems/unique-length-3-palindromic-subsequences/description/?envType=daily-question&envId=2023-11-14">1930. Unique Length-3 Palindromic Subsequences</a>
</h1>

<h2>Problem Description</h2>

<p>
  Given a string <code>s</code>, return the number of unique palindromes of length three that are a subsequence of <code>s</code>.
</p>

<p>
  Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.
</p>

<p>
  A palindrome is a string that reads the same forwards and backward.
</p>

<p>
  A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
</p>

<p>
  For example, "ace" is a subsequence of "abcde".
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
s = "aabca"
</pre>

<strong>Output:</strong>

<pre>
3
</pre>

<strong>Explanation:</strong>

<p>
  The 3 palindromic subsequences of length 3 are:
</p>

<ul>
  <li>"aba" (subsequence of "aabca")</li>
  <li>"aaa" (subsequence of "aabca")</li>
  <li>"aca" (subsequence of "aabca")</li>
</ul>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
s = "adc"
</pre>

<strong>Output:</strong>

<pre>
0
</pre>

<strong>Explanation:</strong>

<p>
  There are no palindromic subsequences of length 3 in "adc".
</p>

<h3>Example 3:</h3>

<p><strong>Input:</strong></p>

<pre>
s = "bbcbaba"
</pre>

<strong>Output:</strong>

<pre>
4
</pre>

<strong>Explanation:</strong>

<p>
  The 4 palindromic subsequences of length 3 are:
</p>

<ul>
  <li>"bbb" (subsequence of "bbcbaba")</li>
  <li>"bcb" (subsequence of "bbcbaba")</li>
  <li>"bab" (subsequence of "bbcbaba")</li>
  <li>"aba" (subsequence of "bbcbaba")</li>
</ul>

<h2>Constraints:</h2>

<ul>
  <li><code>3 <= s.length <= 105</code></li>
  <li><code>s</code> consists of only lowercase English letters.</li>
</ul>

<!-- End of 1930. Unique Length-3 Palindromic Subsequences -->
