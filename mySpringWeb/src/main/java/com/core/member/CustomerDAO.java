package com.core.member;

import java.util.List;

import javax.sql.DataSource;

import com.core.reservation.model.Reservation;
import com.core.reservation.model.SearchRequest;
import com.core.reservation.model.SearchResults;
import com.core.reservation.model.User;

public interface CustomerDAO {
   /** 
    * This is the method to be used to initialize
    * database resources ie. connection.
    */
   public void setDataSource(DataSource ds);
   /** 
    * This is the method to be used to create
    * a record in the Student table.
    */
   public Customer create(Customer customer);
   /** 
    * This is the method to be used to list down
    * a record from the Student table corresponding
    * to a passed student id.
    */
   public Customer getCustomer(Integer customer_id);
   /** 
    * This is the method to be used to list down
    * all the records from the Student table.
    */
   public List<Customer> listCustomers();
   /** 
    * This is the method to be used to delete
    * a record from the Student table corresponding
    * to a passed student id.
    */
   public void delete(Integer customer_id);
   /** 
    * This is the method to be used to update
    * a record into the Student table.
    */
   public void update(Customer customer);
   
   /** new user registration  */
   public void createNewGuest(User user);
   
   /** search rooms **/
   public SearchResults searchRooms(SearchRequest searchRequest);
   
   /** make reservation **/
   
   public void makeReservation(Reservation reservation);
   
   
   
   
}
