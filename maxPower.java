class Solution {
    public int maxPower(String s) {
        if (s.length()==1) return 1;
        else {
        //ArrayList<Integer> out = new ArrayList<>();
        int max=0;
        for (int i=0;i<s.length()-1;i++) {
            int count = 1;
            while (i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
                count++;
                i++;
            }
            //out.add(count);
            if (count>max) {
                max=count;
            }
        }
        
        /*for (int a:out) {
            if (a>max) {
                max=a;
            }
        }*/
        return max;
        }
    }
}
