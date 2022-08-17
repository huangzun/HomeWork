package WeLost;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Lost[] lostArray = new Lost[5];
        lostArray[0] = new CardLost("张三", 2021215321, "2021.12.12", "体育学院","中心食堂");
        lostArray[1] = new CardLost("李四", 2021215369, "2022.8.2", "经管学院","第五教学楼");
        lostArray[2] = new CardLost("王五", 2021213578, "2022.7.8", "通信学院","第三教学楼");
        lostArray[3] = new BookLost("王六", 2020205984, "2022.3.4", "高等数学","公寓管理中心");
        lostArray[4] = new BookLost("吴起", 2019164865, "2021.11.4", "线性代数","莘莘食堂");
        System.out.println("排序前：");
        for (Lost a : lostArray) {
            System.out.println(a);
         }
        System.out.println("******************************");
        System.out.println("排序后：");
        Solution s = new Solution();
        s.sortLost(lostArray);
        System.out.println("******************************");
        System.out.print("请输入关键字词：");
        Scanner sc = new Scanner(System.in);
        String key=sc.nextLine();
        Lost[] array=s.selectByKeyword(lostArray,key);
        for (int i=0;i<array.length;i++){
            if (array[i]!=null)
                System.out.println(array[i]);
        }
        }
    }

