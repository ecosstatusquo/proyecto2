/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.statusquo.operador.bean;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Alvaro
 */
@ManagedBean(name = "utilBean")
@RequestScoped
public class UtilBean {

    public Date getCurrentTime() {
        return new Date();
    }
}