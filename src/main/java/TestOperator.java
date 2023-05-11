import com.sun.org.apache.xpath.internal.operations.Bool;

public class TestOperator {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");

        Boolean isEqual = s1 == s2;
        System.out.println(isEqual);
        System.out.println(s1.equals(s2));

        //赋值运算符
        byte b = 10;
        b = (byte) (b + 1);     //手动强转
        b += 1;     //默认会强转
        System.out.println(b);

        //自增自减
        int x = 15;
        int y = x++;    //先把x的值赋给y，x再++
        System.out.println("x = " + x + ", y = " + y);

        x = 15;
        y = ++x;    //x先++，再把x的值赋给y
        System.out.println("x = " + x + ", y = " + y);

        //
        x = 23;
        x = x++;    //temp = 23; x++ ; x = temp;
        System.out.println(x);

    }
}
