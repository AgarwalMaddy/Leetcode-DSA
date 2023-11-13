<!-- 2785. Sort Vowels in a String -->
<h2><a href="https://leetcode.com/problems/sort-vowels-in-a-string/description/">2785. Sort Vowels in a String </a></h2>


<h2>Problem Description</h2>

<p>
  Given a 0-indexed string <code>s</code>, permute <code>s</code> to get a new string <code>t</code> such that:
</p>

<ul>
  <li>All consonants remain in their original places. More formally, if there is an index <code>i</code> with <code>0 <= i < s.length</code> such that <code>s[i]</code> is a consonant, then <code>t[i] = s[i]</code>.</li>
  <li>The vowels must be sorted in nondecreasing order of their ASCII values. More formally, for pairs of indices <code>i, j</code> with <code>0 <= i < j < s.length</code> such that <code>s[i]</code> and <code>s[j]</code> are vowels, then <code>t[i]</code> must not have a higher ASCII value than <code>t[j]</code>.</li>
</ul>

<p>Return the resulting string.</p>

<p>
  The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in lowercase or uppercase. Consonants comprise all letters that are not vowels.
</p>

<h3>Example 1:</h3>

<p>
  <strong>Input:</strong>
  <pre>s = "lEetcOde"</pre>
  <strong>Output:</strong>
  <pre>"lEOtcede"</pre>
  <strong>Explanation:</strong>
  'E', 'O', and 'e' are the vowels in <code>s</code>; 'l', 't', 'c', and 'd' are all consonants. The vowels are sorted according to their ASCII values, and the consonants remain in the same places.
</p>

<h3>Example 2:</h3>

<p>
  <strong>Input:</strong>
  <pre>s = "lYmpH"</pre>
  <strong>Output:</strong>
  <pre>"lYmpH"</pre>
  <strong>Explanation:</strong>
  There are no vowels in <code>s</code> (all characters in <code>s</code> are consonants), so we return "lYmpH".
</p>

<h2>Constraints:</h2>

<ul>
  <li><code>1 <= s.length <= 105</code></li>
  <li><code>s</code> consists only of letters of the English alphabet in uppercase and lowercase.</li>
</ul>

<!-- End of 2785. Sort Vowels in a String -->
