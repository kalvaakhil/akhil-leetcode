# Maximum weight difference
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>arr</strong>&nbsp;of size <strong>n</strong>. The task is to choose <strong>k</strong> numbers from the array such that the absolute difference between the sum of chosen numbers and the sum of remaining numbers is maximum. </span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n = 5, k = 2
arr[] = {8, 4, 5, 2, 10}
<strong>Output:</strong> 17
<strong>Explanation:</strong> If we select 2 and 4,
then abs((2+4) - (8+5+10)) = 17.
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n = 8, k = 3
arr[] = {1, 1, 1, 1, 1, 1, 1, 1}
<strong>Output:</strong> 2
<strong>Explanation:
</strong>We can select any 3 1's.
</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>solve()</strong>&nbsp;which takes the array of integers&nbsp;<strong>arr, n</strong>&nbsp;and&nbsp;<strong>k&nbsp;</strong>as parameters and returns an integer&nbsp;denoting the answer.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(n*Logn)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= k &lt;= n &lt;=10<sup>5</sup><br>
1 &lt;= arr[i] &lt;= 10<sup>6</sup></span></p>

<p>&nbsp;</p>
</div>