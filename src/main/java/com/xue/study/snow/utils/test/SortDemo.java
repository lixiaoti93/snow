package com.xue.study.snow.utils.test;

public class SortDemo {
    public static void main(String[] args) {
        int[] arr ={1232,54534565,23,6456,32324};
        SortDemo sortDemo =new SortDemo();
        long starTime = System.currentTimeMillis();
        sortDemo.sort(arr);
        long endTime =System.currentTimeMillis();
        System.out.println("冒泡排序：耗时"+(endTime-starTime)+"ms");
        sortDemo.show(arr);

    }
    public void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int tem =arr[j];//临时变量
                    arr[j]=arr[j+1];//将较大值往上移动
                    arr[j+1]=tem;//临时变量保存到第二个元素中
                }

            }

        }

    }
    public void show(int []arr){
        for (int i:arr) {
            System.out.println(i);
        }
    }
}
