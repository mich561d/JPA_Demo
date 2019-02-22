package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
Simple Entity class for this start-up project
 Use this in your own project by:
  - Delete this class
  - Delete all code that reference this class, in other classes
  - Add your own Entity Classes
*/
@Entity
public class Car implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
  
  String make;

  public Car(String message) {
    this.make = message;
  }
  public Car() {}

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  @Override
  public String toString() {
    return "Car{" + "id=" + id + ", make=" + make + '}';
  }
 
}
