package com.mohannad.action;

import com.mohannad.form.TodoForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TodoAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        System.out.println("TodoAction Called");

        TodoForm todoForm = (TodoForm)form;
        if(todoForm !=null) {
            System.out.println(todoForm.getContent());
            System.out.println(todoForm.getDate());
        }else {
            System.out.println("todo form is null");
        }

        return mapping.findForward("success");
    }
}
