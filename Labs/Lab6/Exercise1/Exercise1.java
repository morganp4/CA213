import java.util.*;

class Exercise1 {
    public static void main(String[] args) {
        MyArrayList<String> ws = new MyArrayList<String>();
        ws.addFirst("cat");
        ws.addFirst("dog");
        ws.addFirst("cow");
        ws.addFirst("dog");
        ws.addFirst("pig");
        System.out.println(ws.indexOf("dog"));
        ws.remove(ws.indexOf("dog"));
        System.out.println(ws.indexOf("dog"));
        System.out.println(ws.indexOf("hen"));
    }
}