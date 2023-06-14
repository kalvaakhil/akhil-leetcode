<h2><a href="https://practice.geeksforgeeks.org/problems/decreasing-sequence2722/1">Decreasing Sequence</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">A sequence <strong>a[0], a[1], …, a[N-1]</strong> is called decreasing if <strong>a[i] &gt;= a[i+1] </strong>for each <strong>i: 0 &lt;= i &lt;&nbsp;N-1</strong>. You are given a sequence of numbers <strong>a[0], a[1],…, a[N-1]</strong> and a positive integer <strong>K</strong>. In each 'operation', you may subtract <strong>K</strong> from any element of the sequence.&nbsp;You are required to find the minimum number of 'operations' to make the given sequence decreasing.<br>
<strong>Note: </strong>As the answer can be large return your answer modulo <strong>10<sup>9</sup>+7</strong>.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 4, K = 5
A[] = {1, 1, 2, 3}
<strong>Output:</strong>
3
<strong>Explanation:</strong>
One operation is required to change a[2] = 2
into -3 and two opertations are required to
change a[3] = 3 into -7. The resulting
sequence will be 1 1 -3 -7. Hence, in
total 3 operations are required.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N=5, K = 2
A[] = {5, 4, 3, 2, 1}
<strong>Output:</strong>
0
<strong>Explanation:</strong>
The sequence is already decreasing. Hence,
no operations are required in both the cases.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>minMoves()</strong>&nbsp;which takes the array <strong>A[]</strong>, its size <strong>N </strong>and an integer <strong>K </strong>as inputs and returns the minimum number of ‘operations’. Return your answer modulo <strong>10<sup>9</sup>+7</strong>.</span></p>

<p><br>
<br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>6</sup><br>
1 &lt;= K &lt;= 100<br>
-10<sup>6</sup> &lt;= a[] &lt;= 10<sup>6</sup> </span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Mathematical</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;