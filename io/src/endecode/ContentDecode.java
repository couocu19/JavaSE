package endecode;

import java.io.UnsupportedEncodingException;

public class ContentDecode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "性命生命使命222";
        byte[] datas = msg.getBytes();
        //默认使用工程的的字符街
        //解码：
        // msg = new String(datas);
        msg = new String(datas,0,datas.length,"UTF-8");
        System.out.println(msg);
    }
}
