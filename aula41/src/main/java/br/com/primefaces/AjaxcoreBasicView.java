package br.com.primefaces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AjaxcoreBasicView {
     
    private String text;
 
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}