package hashmap;

public class TestMain {
    public static void main(String[] args) {
        TestHashMap myHashMap = new TestHashMap();

        for(int i = 0;i < 500;i++){
            myHashMap.put("" +i,"value:"+i);
        }

        for(int i = 0;i<500;i++){
            System.out.println(myHashMap.get(""+i));
        }
    }
}
