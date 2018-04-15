/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mst;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Randy_000
 */
public class Customer {
    
   static List<Customer> allCustomers = new ArrayList<>();
    
    
    //constructor variables
  private int customerX;
  private int customerY;
  private int customerCount;
  
  //int[][] customer = new int[][];
    //public List customer[][];
  public Customer(int objCustomerX, int objCustomerY, int objCustomerCount) 
  {
      customerX = objCustomerX;
      customerY = objCustomerY;
      customerCount = objCustomerCount;
  }
  
  

  //These are the get and sets for the customer class
  
  public int getCustomerX() {
      return customerX;
  }
  
  public void setCustomerX(int customerX){
      this.customerX = customerX;
  }
  
    public int getCustomerY() {
      return customerY;
  }
  
  public void setCustomerY(int customerY){
      this.customerY = customerY;
  }
  
    public int getCustomerCount() {
      return customerCount;
  }
  
  public void setCustomerCount(int customerCount){
      this.customerCount = customerCount;
  }
  
  //public void FindMidpoint(customer){
      
  //}
}
