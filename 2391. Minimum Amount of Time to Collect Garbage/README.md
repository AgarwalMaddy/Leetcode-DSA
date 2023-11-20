
<!-- 2391. Minimum Amount of Time to Collect Garbage -->

<h1>
  <a href="https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/?envType=daily-question&envId=2023-11-20">2391. Minimum Amount of Time to Collect Garbage</a>
</h1>

<h2>Problem Description</h2>

<p>
  You are given a 0-indexed array of strings <code>garbage</code> where <code>garbage[i]</code> represents the assortment of garbage at the ith house. <code>garbage[i]</code> consists only of the characters 'M', 'P' and 'G' representing one unit of metal, paper and glass garbage respectively. Picking up one unit of any type of garbage takes 1 minute.
</p>

<p>
  You are also given a 0-indexed integer array <code>travel</code> where <code>travel[i]</code> is the number of minutes needed to go from house i to house i + 1.
</p>

<p>
  There are three garbage trucks in the city, each responsible for picking up one type of garbage. Each garbage truck starts at house 0 and must visit each house in order; however, they do not need to visit every house.
</p>

<p>
  Only one garbage truck may be used at any given moment. While one truck is driving or picking up garbage, the other two trucks cannot do anything.
</p>

<p>
  Return the minimum number of minutes needed to pick up all the garbage.
</p>

<h3>Example 1:</h3>

<p><strong>Input:</strong></p>

<pre>
garbage = ["G","P","GP","GG"], travel = [2,4,3]
</pre>

<strong>Output:</strong>

<pre>
21
</pre>

<strong>Explanation:</strong>

<p>
  The paper garbage truck:<br>
  1. Travels from house 0 to house 1<br>
  2. Collects the paper garbage at house 1<br>
  3. Travels from house 1 to house 2<br>
  4. Collects the paper garbage at house 2<br>
  Altogether, it takes 8 minutes to pick up all the paper garbage.<br>
  The glass garbage truck:<br>
  1. Collects the glass garbage at house 0<br>
  2. Travels from house 0 to house 1<br>
  3. Travels from house 1 to house 2<br>
  4. Collects the glass garbage at house 2<br>
  5. Travels from house 2 to house 3<br>
  6. Collects the glass garbage at house 3<br>
  Altogether, it takes 13 minutes to pick up all the glass garbage.<br>
  Since there is no metal garbage, we do not need to consider the metal garbage truck.<br>
  Therefore, it takes a total of 8 + 13 = 21 minutes to collect all the garbage.
</p>

<h3>Example 2:</h3>

<p><strong>Input:</strong></p>

<pre>
garbage = ["MMM","PGM","GP"], travel = [3,10]
</pre>

<strong>Output:</strong>

<pre>
37
</pre>

<strong>Explanation:</strong>

<p>
  The metal garbage truck takes 7 minutes to pick up all the metal garbage.<br>
  The paper garbage truck takes 15 minutes to pick up all the paper garbage.<br>
  The glass garbage truck takes 15 minutes to pick up all the glass garbage.<br>
  It takes a total of 7 + 15 + 15 = 37 minutes to collect all the garbage.
</p>

<h2>Constraints:</h2>

<ul>
  <li><code>2 <= garbage.length <= 10^5</code></li>
  <li><code>garbage[i]</code> consists of only the letters 'M', 'P', and 'G'.</li>
  <li><code>1 <= garbage[i].length <= 10</code></li>
  <li><code>travel.length == garbage.length - 1</code></li>
  <li><code>1 <= travel[i] <= 100</code></li>
</ul>

<!-- End of 2391. Minimum Amount of Time to Collect Garbage -->
