class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> map = new HashMap<>();
        
        for (int i = 0; i < values.length; i++) {
            List<String> equation = equations.get(i);
            String dividend = equation.get(0);
            String divisor = equation.get(1);
            double quotient = values[i];
            if(!map.containsKey(dividend)) {
                map.put(dividend, new HashMap<>());
            }
            if (!map.containsKey(divisor)) {
                map.put(divisor, new HashMap<>());
            }
            map.get(dividend).put(divisor, quotient);
            map.get(divisor).put(dividend, 1 / quotient);
        }
        double[] res = new double[queries.size()];
        for (int i = 0; i < res.length; i++) {
            List<String> query = queries.get(i);
            if (!map.containsKey(query.get(0)) || !map.containsKey(query.get(1))) {
                res[i] = -1;
            } else{
                res[i] = dfs(map, query.get(0), query.get(1), 1.0, new HashSet<String>());
            }
        }
        return res;
    }
    private double dfs(Map<String, Map<String, Double>> map, String start, String target, double r, Set<String> seen) {
        
        if (start.equals(target)) {
            return r;
        }
        Map<String, Double> m = map.get(start);
        for (String s : m.keySet()) {
            if (seen.contains(s)) {
                continue;
            }
            seen.add(s);
            double res = dfs(map, s, target, r * m.get(s), seen);
            if (res != -1) {
                return res;
            }
            seen.remove(s);
        }
        return -1;
    }
}