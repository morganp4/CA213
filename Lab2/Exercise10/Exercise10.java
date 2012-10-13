import java.util.*;

class Exercise10 {
    static <T extends Comparable<? super T>> void sort(T[] s) {
        for(int i=0; i<s.length; i++) {
            for(int j = i+1; j<s.length; j++) {
                if(s[i].compareTo(s[j])>0) {
                    T tmp;
                    tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] names = {"Pete","Jill","May","Anne","Tim"};
        sort(names);
        for(String s : names )  {
            System.out.println(s);
        }
    }
}