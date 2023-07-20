class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      LinkedList<Integer> list=new  LinkedList<>();
      for (int i : asteroids) {
            while (!list.isEmpty() && list.getLast() > 0 && list.getLast() < -i)
                list.pollLast();
            if (list.isEmpty() || i > 0 || list.getLast() < 0)
                list.add(i);
            else if (i < 0 && list.getLast() == -i)
                list.pollLast();
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}