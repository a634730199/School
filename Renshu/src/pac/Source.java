package pac;
/*
 * 2、 Source.java 是 Sourcable.java 的一个实现，
 * operation() 方法的实现就是简单的负责往控制台输出一个字符串：
 */
public class Source implements Sourcable {

	public void operation() {
        System.out.println("原始类的方法");
    }

}
