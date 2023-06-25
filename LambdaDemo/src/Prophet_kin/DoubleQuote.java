package Prophet_kin;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * java8 :: �÷� ��JDK8 ˫ð���÷���:
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
      //�����for eachѭ���������ѭ���ǵȼ۵� 
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
        //����ķ���������ȼ۵�
        Consumer<String> methodParam = AcceptMethod::printValur; //��������
        al.forEach(x -> methodParam.accept(x));//����ִ��accept
    }
}