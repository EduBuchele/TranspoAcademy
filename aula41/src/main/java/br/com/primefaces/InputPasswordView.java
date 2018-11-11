package br.com.primefaces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class InputPasswordView {

	private String password4;
	private String password5;

	public String getPassword4() {
		return password4;
	}

	public void setPassword4(String password4) {
		this.password4 = password4;
	}

	public String getPassword5() {
		return password5;
	}

	public void setPassword5(String password5) {
		this.password5 = password5;
	}

}
