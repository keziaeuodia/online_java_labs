package generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class GenEx <T extends Number>{
    T num, num2;

    GenEx(T a, T b) {
        num = a;
        num2 = b;
    }

    public T getNum2() {
        return num2;
    }

    public void setNum2(T num2) {
        this.num2 = num2;
    }

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }
}

class Generics1 {
    public static void main(String args[]) {


        GenEx<Integer> obj1 = new GenEx<>(588, 698);
        int i = (Integer) obj1.getNum();
        int j = (Integer) obj1.getNum2();
        System.out.println("value: " + i + ", " + j);

        GenEx<Long> obj2 = new GenEx<>(4876593L, 849506829L);
        long l = (Long) obj2.getNum();
        long k = (Long) obj2.getNum2();
        System.out.println("value: " + l + ", " + k);

        GenEx rawObj = new GenEx(new Float(4.6), new Float(5.8));
        float f = (Float) rawObj.getNum();
        float g = (Float) rawObj.getNum2();
        System.out.println("value: " + f + ", " + g);
    }
}

