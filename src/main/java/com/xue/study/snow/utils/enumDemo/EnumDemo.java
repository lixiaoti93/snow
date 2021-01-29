package com.xue.study.snow.utils.enumDemo;

public class EnumDemo {
    enum EnumDemo_A{
        Strug_A("A"),
        Strug_B("B"),
        Strug_C(3);
        private String descripation;
        private int i=8;
        private EnumDemo_A(String descripation){
            this.descripation=descripation;
        }
        private EnumDemo_A(int i){
            this.i=this.i+i;
        }

        public String getDescripation() {
            return descripation;
        }

        public int getI() {
            return i;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <EnumDemo_A.values().length ; i++) {
            System.out.println(EnumDemo_A.values()[i].getDescripation());
        }
        System.out.println(EnumDemo_A.valueOf("Strug_C").getI());
    }
}
