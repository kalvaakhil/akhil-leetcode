class Solution {
    public boolean isBulky(int a, int b, int c, int d) {
        double val = Math.pow(10, 4);
        if(a >= val || b >= val || c >= val || d >= val) {
            return true;
        }
        else if((long) a * b * c >= Math.pow(10, 9)) {
            return true;
        }
        return false;
    }

    public boolean isHeavy(int mass) {
        if(mass >= 100) {
            return true;
        }
        return false;
    }

    public String categorizeBox(int length, int width, int height, int mass) {
        boolean x = isBulky(length, width, height, mass);
        boolean y = isHeavy(mass);
        System.out.println(x + " " + y);
        if(x && y) {
            return "Both";
        }
        else if(x && !(y)) {
            return "Bulky";
        }
        else if(y && !(x)) {
            return "Heavy";
        }
        else {
            return "Neither";
        }
    }
}