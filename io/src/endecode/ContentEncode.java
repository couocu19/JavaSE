package endecode;

//编码：字符串-->字节
import java.io.UnsupportedEncodingException;

public class ContentEncode {
    public static void main(String[] args)throws UnsupportedEncodingException {
        String mag = "性命生命使命222";

        //编码：字节数组
        //一个中文3个字节
        //由字符串转变为字节数组的过程
        byte[] datas = mag.getBytes();
        //默认使用工程的的字符街
        System.out.println(datas.length);
        datas = mag.getBytes("UTF-16LE");
        System.out.println(datas.length);

    }
}
