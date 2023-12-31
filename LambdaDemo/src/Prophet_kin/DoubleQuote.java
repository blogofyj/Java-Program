package Prophet_kin;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * java8 :: 用法 （JDK8 双冒号用法）:
 * https://www.cnblogs.com/tietazhan/p/7486937.html?tdsourcetag=s_pctim_aiomsg
 *  
 *
 */
public class DoubleQuote {

}
class AcceptMethod {
	 
    public static void  printValur(String str){
        System.out.println("print value : "+str);
    }
 
    public static void main(String[] args) {
        List<String> al = Arrays.asList("a","b","c","d");
        for (String a: al) {
            AcceptMethod.printValur(a);
        }
      //下面的for each循环和上面的循环是等价的 
        al.forEach(x->{
            AcceptMethod.printValur(x);
        });
    }
}

class MyTest {
    public static void  printValur(String str){
        System.out.println("print value : "+str);
    }
 
    public static void main(String[] args) {
        List<String> al = Arrays.asList("a", "b", "c", "d");
        al.forEach(AcceptMethod::printValur);
        //下面的方法和上面等价的
        Consumer<String> methodParam = AcceptMethod::printValur; //方法参数
        al.forEach(x -> methodParam.accept(x));//方法执行accept
    }
}