package com.mohannad.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;


public class TodoForm extends ActionForm {
    String content ;
    String date;


    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        System.out.println("validate");
        ActionErrors errors = new ActionErrors();

        if( getContent() == null || ("".equals(getContent() ) ) ||  getDate() == null || ("".equals(getDate() ) ) ){
            errors.add("common.name.err",
                    new ActionMessage("error.common.name.required"));
        }

        return errors;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        content="";
        date="";
    }
}
