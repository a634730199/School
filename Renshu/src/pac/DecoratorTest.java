package pac;
/*
 * 这时，我们就可以像使用对象的适配器模式一样来使用这些装饰器，
 * 使用不同的装饰器就可以达到不同的装饰效果。如下测试类：
 * 首先需要创建一 个源类对象 source ，然后根据将对象使用 Decorator1 来装饰，
 * 并以此使用Decorator2 、 Decorator3 进行装饰，装饰后的对象同样具有与 source 同样的接口。
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Sourcable source = new Source();

        // 装饰类对象
        Sourcable obj = new Decorator1(new Decorator2(new Decorator3(source)));
        obj.operation();
	}

}
