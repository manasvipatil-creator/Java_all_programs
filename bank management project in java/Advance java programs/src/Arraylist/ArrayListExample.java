package Arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListExample {



    public static void main(String args[]) {

        try {
            ArrayList<Integer> list=new ArrayList<>(1000);

            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);

            list.add(1);
            list.add(1);

            Field field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);

            Object[] elementData = (Object[]) field.get(list);
            System.out.println("ArrayList capacity:"+elementData.length);

            list.add(1);

            elementData = (Object[]) field.get(list);
            System.out.println("Array capacity:" + elementData.length);

            System.out.println("ArrayList size:"+list.size());

        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}


