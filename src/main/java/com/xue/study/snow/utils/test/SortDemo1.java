package com.xue.study.snow.utils.test;

/**
 * 直接选择排序
 */
public class SortDemo1 {
    public static void main(String[] args) {
        int[] arr ={23,6,1,242,5,6765,31231,65687,312312745,4342,76575,412412,7696,141546,374885,3278,63463};
        SortDemo1 sortDemo1 = new SortDemo1();
        sortDemo1.sort(arr);

    }

    public void sort(int[] arr) {
        int index ;
        for (int i = 1; i < arr.length; i++) {
            index=0;
            for (int j = 1; j <=arr.length -i; j++) {

                if (arr[j] > arr[index]) {
                    index = j;
                }

            }
            //交换最大值的位置到集合最后一位
            int temp = arr[arr.length - i];
            arr[arr.length - i] = arr[index];
            arr[index] = temp;

        }
        show(arr);
    }

    /**
     * 遍历数组
     * @param arr
     */
    public void show(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
