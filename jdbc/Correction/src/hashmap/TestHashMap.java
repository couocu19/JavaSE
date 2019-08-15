package hashmap;
import java.util.*;
public class TestHashMap<K,V>implements MyMapInterfa {
    private final int CAPACITY = 16;
    private final float FACTOR = 0.75f;
    private int size = 0;
    Node[] table = new Node[CAPACITY];

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public Object put(Object key,Object value){
        //计算key的hash值
        int hashValue = hash(key);
        //计算应该存放的位置
        int i = indexFor(hashValue,table.length);
        for(Node node = table[i];node != null; node = node.next){
            Object k;
            if(node.hash == hashValue && ((k = node.key)==key || key.equals(k))){
                Object oldValue = node.value;
                node.value = value;
                return oldValue;
            }
        }
        addEntry(key,value,hashValue,i);
        return null;
    }
    public Object get(Object key){
        int hashValue = hash(key);

        int i = indexFor(hashValue,table.length);

        for(Node node = table[i];node != null;node =node.next){
            if(node.key.equals(key) && hashValue == node.hash){
                return node.value;
            }
        }
        return  null;
    }

    public void addEntry(Object key,Object value,int hashValue,int i){
        if (++size >= table.length * FACTOR){
            Node[] newTable = new Node[table.length << 1];

            transfer(table,newTable);
            table = newTable;
        }
        Node eNode = table[i];

        table[i] = new Node(hashValue,key,value,eNode);
    }

    public void transfer(Node[] src,Node[] newTable){
        int newCapacity = newTable.length;
        for(int j = 0;j< src.length;j++){
            Node e = src[j];
            if(e!= null){
                src[j] = null;
                do{
                    Node next = e.next;
                    int i = indexFor(e.hash,newCapacity);
                    e.next = newTable[i];
                    newTable[i] = e;
                    e = next;
                }while( e != null);
            }
        }
    }
    //获取插入的位置，根据Object对象的hashcode，获取hash值
    public int hash(Object key){
        int h;
        return (key == null)? 0 :(h = key.hashCode()) ^ (h>>>16);
    }

    //获取插入的位置（取模运算，有瑕疵）
    public int indexFor(int hashValue,int length){
        return hashValue %length;
    }
    static class Node implements MyMapInterfa.Entry{
        int hash;
        Object key;
        Object value;
        Node next;
        public Node(int hash, Object key, Object value, Node next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public Object getvalue() {
            return value;
        }

        public Object getKey(){
            return key;
        }
    }
}


