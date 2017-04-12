/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.opensymphony.xwork2.ActionSupport;
import entity.User;

/**
 *
 * @author Nazrul
 */
public class LoginAction extends ActionSupport{
        private static final long serialVersionUID = 1L;
        UserDao dao = new UserDao();
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
 @Override
    public void validate() {
        if (user.getName().length() == (0)) {
            this.addFieldError("user.name", "Name is required");
        }
        if (user.getPass().length() == (0)) {
            this.addFieldError("user.pass", "Password is required");
        }
    }

    public String loginU(){
         if (dao.find(user.getName(), user.getPass())) {
            return SUCCESS;
        } else {
            this.addActionError("Invalid username and password");
        }
        return INPUT;
    }
   
public String addUser(){
    user.setName(user.getName());
        user.setPass(user.getPass());
        if(dao.add(user)){
            return SUCCESS;
        }else{
            this.addActionError("Data did not save");
        }
        return INPUT;

}        
    
}
