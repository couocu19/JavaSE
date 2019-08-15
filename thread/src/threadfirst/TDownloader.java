package threadfirst;

public class TDownloader extends Thread {
    private String url;
    private String name;

    public TDownloader(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public void run(){
        WebDownloader wd = new WebDownloader();
        wd.download(url,name);
        System.out.println(name);
    }

    public static void main(String[] args) {
        TDownloader td1 = new TDownloader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1563851795686&di=ce38b1ec943d7253310b75519b8cba50&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F171117%2F9-1G11G11035162.jpg","husband1.jpg");
        TDownloader td2 = new TDownloader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1563851795685&di=6a524b08d165eda5f7f31865e0283359&imgtype=0&src=http%3A%2F%2Fdingyue.nosdn.127.net%2F4jUpTV7OtyxPPVMuJdGkk0qrkOgXA6UKdGItwI5dvGztt1537937625600.jpeg","husband2.jpg");
        TDownloader td3 = new TDownloader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1563851795685&di=7b41f49ff3b0b6be620673b67a56b383&imgtype=0&src=http%3A%2F%2Fn.sinaimg.cn%2Fent%2F4_img%2Fupload%2F1f0ce517%2F20170721%2FkyYg-fyiiahy4532936.jpg","husband3.jpg");

        //启动三个线程
        td1.start();
        td2.start();
        td3.start();

    }
}
