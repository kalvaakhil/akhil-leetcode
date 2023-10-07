class Step {
    int xValue, direction, stepsTaken;
    
    public Step(int xValue, int direction, int stepsTaken) {
        this.xValue = xValue;
        this.direction = direction;
        this.stepsTaken = stepsTaken;
    }
    
    @Override
    public int hashCode() {
        return (this.xValue + 1) * direction;
    }
    
    @Override
    public boolean equals(Object o) {
        Step that = (Step) o;
        return this.xValue == that.xValue && this.direction == that.direction;
    }
    
}

class Solution {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        Set<Step> seen = new HashSet<>();
        for (int f : forbidden) {
            seen.add(new Step(f, 1, 0));
            seen.add(new Step(f, -1, 0));
        }
        Queue<Step> q = new LinkedList<>();
        q.add(new Step(0, 1, 0));
        while (!q.isEmpty()) {
            Step currStep = q.remove();
            if (currStep.xValue == x) return currStep.stepsTaken;
            //try moving forward
            // the reason why 6000 is becase: target x is max 2000, and a max 2000, 
            // that means, x + a with max value to x + a + a 
            if (currStep.xValue + a <= 6000) {
                Step nextStep = new Step(currStep.xValue + a, 1, currStep.stepsTaken + 1);
                if (!seen.contains(nextStep)) {
                    q.add(nextStep);
                    seen.add(nextStep);
                }
            }
            //try moving backward
            if (currStep.direction != -1 && currStep.xValue - b > 0) {
                Step nextStep = new Step(currStep.xValue - b, -1, currStep.stepsTaken + 1);
                if (!seen.contains(nextStep)) {
                    q.add(nextStep);
                    seen.add(nextStep);
                }
            }
        }
        return -1;
    }
}