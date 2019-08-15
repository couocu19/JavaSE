package tcp;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String s = "I am good";
        String[] newsS = s.split("&");
        System.out.println(Arrays.toString(newsS));


    }
}
