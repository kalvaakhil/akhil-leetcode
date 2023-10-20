# Fill array with 1's
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array of <strong>0</strong> and <strong>1</strong>. In how many iterations it is possible that the whole array can be filled with 1's, if in a single iteration immediate neighbours of 1's can be filled.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
n = 4
a[] = {1, 0, 1, 0}
<strong>Output:</strong>
1
<strong>Explanation:</strong>
Both the 0s has 1 as their immediate neighbour.
So, only one iteration is required to fill the
array with 1.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
n = 5
a[] = {0, 0, 1, 0, 0}</span>
<span style="font-size:18px"><strong>Output:</strong>
2</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>minMoves()</strong>&nbsp;which takes the array <strong>A[]</strong> and its size <strong>N</strong><strong> </strong>as inputs and returns the minimum number of iterations to fill the whole array with 1's (if possible). If it is not possible to fill the array with 1s, return -1&nbsp;. </span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>7</sup><br>
0 &lt;= A<sub>i </sub>&lt;= 1</span></p>
</div>