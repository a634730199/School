package pac;
/*
 * 装饰器类Decorator3.java 是第三个装饰器，
 * 不同的是它装饰的内容不一样，即输出了不同的字符串。其源代码如程序
 */
public class Decorator3 implements Sourcable {

	private Sourcable sourcable;
    public Decorator3(Sourcable sourcable){
        super();
        this.sourcable=sourcable;
    }
    public void operation() {
        System.out.println("第3个装饰器前");
        sourcable.operation();
        System.out.println("第3个装饰器后");

    }

}
