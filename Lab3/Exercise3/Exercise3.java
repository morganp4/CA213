import java.util.*;

class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        boolean[] results = new boolean[9];
        String miraculous="";
        boolean found=true;

        for(int i=0; i<10; i++) digits.add(i);
        while(digits.get(0)==0) Collections.shuffle(digits);
        while(!(checkMiraculous(digits))) Collections.shuffle(digits);

        for(int i : digits) System.out.print(i);
        System.out.println();
    }

    public static boolean checkMiraculous(ArrayList<Integer> digits) {
        for(int i=2; i<=10; i++) {
            String sum="";
            for(int j=0; j<i; j++) {
                sum = sum + digits.get(j);
            }
            if(Long.parseLong(sum)%i!=0) return false;
        }
        return true;
    }
}