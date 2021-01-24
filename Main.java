package se测试;

//每组数据输入一个字符串，且字符串最大长度不超过100，且只包含字母，不可能为空串，区分大小写
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z' || s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z'){
                int j = 0;
                for (; j < stringBuffer.length(); j++) {
                    if(s1.charAt(i) == stringBuffer.charAt(j)){
                        break;
                    }
                }
                if(j >= stringBuffer.length()){
                    stringBuffer.append(s1.charAt(i));
                }
            }
        }
        System.out.println(stringBuffer.toString());
    }
}
