package autowire;

import org.springframework.beans.factory.annotation.Autowired;


public class Outer {

	// 注入方式1
//	@Autowired
//	private Inner inner;



	// 注入方式2
	private Inner inner;

	public Inner getInner() {
		return inner;
	}

	@Autowired
	public void setInner(Inner inner) {
		this.inner = inner;
	}

	// 注入方式3
//	private Inner inner;
//
//	@Autowired
//	public Outer(Inner inner) {
//		this.inner = inner;
//	}
}
