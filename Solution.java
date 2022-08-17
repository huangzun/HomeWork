package WeLost;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    /**
     * 失物排序方法
     *
     * @param lostArray 待排序的失物数组
     */
    public void sortLost(Lost[] lostArray) {
        /*
        1.冒泡排序从小到大给数组排序
        2.将时间转换成整型比较
        3.按时间从小到大排序保存到数组
        */
        for (int i=0;i<lostArray.length;i++) {
            for (int j = i + 1; j < lostArray.length; j++) {
                String s=lostArray[i].getTime();
                StringTokenizer tokenizer = new StringTokenizer(s,".");
                String s1="";
                while(tokenizer.hasMoreTokens()) {
                    s1+=tokenizer.nextToken();
                }
                int S1=Integer.parseInt(s1);
                String t=lostArray[j].getTime();
                StringTokenizer tokenizer1 = new StringTokenizer(t,".");
                String t1="";
                while(tokenizer1.hasMoreTokens()) {
                    t1+=tokenizer1.nextToken();
                }
                int T1=Integer.parseInt(t1);
                if (S1-T1>=0){
                    Lost temp=lostArray[j];
                    lostArray[j]=lostArray[i];
                    lostArray[i]=temp;
                }
            }
        }
        for (Lost b : lostArray) {
            System.out.println(b);
        }

    }


    /**
     * 按关键字搜索失物的方法，关键字只包括可以在字符串里直接找到的，中间不能有缺少的字符串
     * 如：公寓管理中心不可以是公寓中心
     *
     * @param lostArray 失物数组
     * @param keyword   用户输入的关键字
     * @return 返回查找到的失物
     */
    public Lost[] selectByKeyword(Lost[] lostArray, String keyword) {
        final int n=5;
        Lost[] array = new Lost[n];
        for (int i = 0; i < lostArray.length; i++) {
            String a = lostArray[i].getPlace();

                if (a.lastIndexOf(keyword) >=0) {
                    array[i] = lostArray[i];
            }
        }
        return array;
    }
}

