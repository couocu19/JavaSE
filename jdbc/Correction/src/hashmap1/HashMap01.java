package hashmap1;
import java.util.*;
import java.lang.*;
//自定义一个hashmap
public class HashMap01<K,V>{

    Nodes[] table;//位桶数组
    int size;  //存放的键值对的个数

    public HashMap01(){
        table = new Nodes[16];
    }

    public void put(K key,V value){
        //如果要完善，还需要考虑数组扩容的问题！
        //定义一个新的节点对象
        Nodes newnode = new Nodes();
        newnode.hash = myHash(key.hashCode(),table.length);
        newnode.key = key;
        newnode.value = value;
        newnode.next = null;

        Nodes temp = table[newnode.hash];
        Nodes islast = null;
        boolean keyRepeat = false;
        if(temp == null){
            //如果数组元素为空，则直接将新节点加进去
            table[newnode.hash] = newnode;
            size++;
        }
        else{
            while(temp!=null) {
            //如果不为空，则遍历对应数组位置下的链表
            //如果key的值相同，则新的key对应的value覆盖旧的
              if(temp.key.equals(key)){
                  keyRepeat = true;
                  temp.value = value;
                //只覆盖value的值即可，其他的值（key,hash,next）保持不变
                  break;
            }else{
                    //如果key的值没有重复，则遍历链表的下一个元素
                    islast = temp;
                    temp = temp.next;
                }
            }
            //将要put的新元素添加到链表的表头
            if(!keyRepeat) {
                islast.next = newnode;
                size++;
            }
        }
    }

    public int myHash(int v,int length){
        return (v&(length-1));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        //两个循环分别遍历数组和数组中的元素对性的链表
        for(int i = 0;i<table.length;i++){
            Nodes temp = table[i];
            while(temp != null){
                sb.append(temp.key+":"+temp.value+",");
                temp = temp.next;
            }
        }
        sb.setCharAt(sb.length()-1,'}');
        return sb.toString();
    }

    public V get(K key){
        int hash = myHash(key.hashCode(),table.length);
        V value = null;
        if(table[hash]!=null){
            Nodes temp = table[hash];
            while(temp!=null){
                if(temp.key.equals(key)){
                    value = (V)temp.value;
                    break;
                }else{
                    temp = temp.next;
                }
            }
        }
        return value;
    }

    public static void main(String[] args) {
        HashMap01<Integer,String> m1 = new HashMap01<>();
        m1.put(10,"coucou");
        m1.put(20,"shidx");
        m1.put(53,"haha");
        m1.put(69,"熊楚");
        m1.put(85,"张弛");
        System.out.println(m1.get(53));
        System.out.println(m1);
    }
 }
