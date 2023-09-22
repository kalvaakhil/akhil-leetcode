# Stable Sort and Position
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>arr[]</strong> of <strong>N</strong> integers which may contain duplicate elements, the index of an&nbsp;element of this array is given to us, the task is to find the final position of this element ( for which the index is given) in the array after the stable sort is applied on the array.&nbsp;</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> N = 10, INDEX = 5
arr[]= {3, 4, 3, 5, 2, 3, 4, 3, 1, 5}
<strong>Output:</strong> 4
<strong>Explanation</strong>: Element initial index – 5 
(third 3) After sorting array by stable 
sorting algorithm,we get array as shown 
below [1(8), 2(4), 3(0), 3(2), 3(5), 3(7),
4(1), 4(6), 5(3), 5(9)] with their 
initial indices shown in parentheses next 
to them,Element's index after sorting = 4.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function <strong>getIndexInSortedArray</strong>() that takes array <strong>arr,&nbsp;</strong>integer<strong> N, </strong>and&nbsp;integer<strong> index</strong>&nbsp;as parameters and returns the number of uneaten leaves.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N).<br>
<strong>Expected Auxiliary Space:</strong> O(1).</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>6</sup></span></p>
</div>