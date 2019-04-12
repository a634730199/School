package pac;
/*
 * 装饰器类Decorator2.java 是另一个装饰器，
 * 不同的是它装饰的内容不一样，即输出了不同的字符串。其源代码如
 */
public class Decorator2 implements Sourcable {

	private Sourcable sourcable;
    public Decorator2(Sourcable sourcable){
        super();
        this.sourcable=sourcable;
    }
    public void operation() {
        System.out.println("第2个装饰器前");
        sourcable.operation();
        System.out.println("第2个装饰器后");

    }

}
