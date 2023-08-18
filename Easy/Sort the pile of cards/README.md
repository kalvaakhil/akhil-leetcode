<h2><a href="https://practice.geeksforgeeks.org/problems/sort-the-pile-of-cards3733/1">Sort the pile of cards</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">We have n cards with each card numbered from 1 to n. All cards are randomly shuffled. We are allowed only operation <strong>moveCard(n)</strong> which moves the card with value n to the top of the pile. You are required to find out the minimum number of <strong>moveCard()</strong> operations required to sort the cards in increasing order.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
n  = 5
a[] = {5, 1, 2, 3, 4}
<strong>Output:</strong>
4
<strong>Explanation:</strong>
5 1 2 3 4              //given sequence
4 5 1 2 3              //moveCard(4)
3 4 5 1 2              //moveCard(3)
2 3 4 5 1              //moveCard(2)
1 2 3 4 5              //moveCard(1)
Hence, minimum 4 operations are required.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
n = 4
a[] = {3, 4, 2, 1}
<strong>Output:</strong>
2
<strong>Explanation:</strong>
3 4 2 1             //given sequence
2 3 4 1             //moveCard(2)
1 2 3 4             //moveCard(1)
Hence, minimum 2 operations are required.</span></pre>

<p><br>
<br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>minOps()</strong>&nbsp;which takes the array <strong>a[]</strong> and its size <strong>n </strong>as inputs and returns the minimum number of operations required.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(n)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= n &lt;=10<sup>7</sup>&nbsp;<br>
1 &lt;= a[i] &lt;= n</span><br>
&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>BankBazaar</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;