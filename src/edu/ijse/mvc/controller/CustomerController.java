/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.model.CustomerModel;
import java.sql.SQLException;

/**
 *
 * @author Teshan
 */
public class CustomerController {
    private CustomerModel customerModel;
    
    public CustomerController()throws Exception{
        customerModel =new CustomerModel();
    }
    
    public CustomerDto searchCustomer(String custId) throws SQLException{
        CustomerDto customerDto=customerModel.getCustomer(custId);
        return customerDto;
    }
}

