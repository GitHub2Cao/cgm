package org.softnovo.seckill.flyweight.benlai;

public class ConcreteFlyweight implements Flyweight {
	private String intrinsicState;

	public ConcreteFlyweight(String state) {
		this.intrinsicState = state;

	}

	@Override
	public void operation(String state) {
		// 具体的功能处理，可能会用到享元内部、外部的状态
	}
}
