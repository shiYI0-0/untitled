package yhra.yhr.shiyan;

import java.util.Random;

public class passwd {
    public static void main(String[] args) {
        System.out.println("麻瓜");
        Random r=new Random();

        for (int i = 0; i < 10; i++) {
            int aa=r.nextInt(99)+1;
            if(aa%2==0){
                System.out.println(aa+"偶数");
            }
            System.out.println(aa);
        }


        System.out.println("aaa");
    }
}
