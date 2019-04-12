package pac;
/*
 * 3、装饰器类 Decorator1.java
 * 采用了典型的对象适配器模式，
 * 它首先拥有一个 Sourcable 对象 source ，
 * 该对象通过构造函 数进行初始化。然后它实现了 Sourcable.java 接口，
 * 以期保持与 source 同样的接口，
 * 并在重写的operation() 方法中调用  source 的 operation() 函数，
 * 在调用前后可以实现自己的输出，这就是装饰器所扩展的功能。
 */
public class Decorator1 implements Sourcable {

	private Sourcable sourcable;
    public Decorator1(Sourcable sourcable){
        super();
        this.sourcable=sourcable;
    }

    public void operation() {
        System.out.println("第1个装饰器前");
        sourcable.operation();
        System.out.println("第1个装饰器后");

    }

}
