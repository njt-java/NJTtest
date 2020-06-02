package string;

import java.util.Arrays;

/**
 * String:底层char[],值不可变，常量池；
 * StringBuffer:底层char[],是可变字符序列，线程安全，效率相对低；
 * StringBuilder:底层char[],是可变字符序列，线程不安全，效率相对高；
 */
public class demo {
    public static void main(String[] args) {
        String a="hello";
        char[] chars = a.toCharArray();
        System.out.println(Arrays.toString(chars));

    }
}
