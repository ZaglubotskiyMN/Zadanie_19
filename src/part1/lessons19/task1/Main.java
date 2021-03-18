package part1.lessons19.task1;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Map<Character,Character> skobka =new Hashtable<>();
        skobka.put(')','(');
        skobka.put('}','{');
        skobka.put(']','[');
        Scanner s = new Scanner(System.in);
        System.out.println("Введите скобки");
        System.out.format("Порядок скобок : %b%n",isrefactor(s.next(),skobka));

    }
    public static boolean isrefactor(String str,Map<Character,Character> ok){
        Stack<Character> st = new Stack<>();
        for (char c:str.toCharArray()){
            if(ok.containsValue(c)){
                st.push(c);
            } else {
                if (ok.containsKey(c)){
                    if (st.isEmpty() || !ok.get(c).equals(st.pop())){
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}
