//designpatterns.builder.ActorBuilder.java
package designpatterns.builder;

public abstract class ActorBuilder {
	protected Actor actor = new Actor();
	
	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildCostume();
	public abstract void buildHairstyle();

    //��������������һ����������Ϸ��ɫ����
	public Actor createActor() {
		return actor;
	}
}