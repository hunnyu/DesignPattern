package pattern.factory;

/**************************************************************************
 * 我们将创建一个 Shape接口和实现Shape接口的实体类。下一步是定义工厂类 ShapeFactory。
 * FactoryPatternDemo，我们的演示类使用 ShapeFactory 来获取 Shape对象。
 * 它将向 ShapeFactory 传递信息（CIRCLE / RECTANGLE / SQUARE），以便获取它所需对象的类型。
 **************************************************************************/

public interface Shape {
	void draw();
}
