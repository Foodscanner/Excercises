package meinbeanpackage;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Set;
import java.util.HashSet;

public class Honey implements Serializable {
  

  /**
   * Generated serialVersionID
   */
  private static final long serialVersionUID = 3184225447422668567L;
  private Integer id;
  private String name;
  private String taste;
  private Set<Bee> bees = new HashSet<Bee>();
  
  public Honey(){
    //empty standard constructor
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTaste() {
    return taste;
  }

  public void setTaste(String taste) {
    this.taste = taste;
  }

  public Set<Bee> getBees() {
    return bees;
  }

  public void setBees(Set<Bee> bees) {
    this.bees = bees;
  }
  
  @Override
  public String toString() {
    return MessageFormat.format("{0}: id={1}, name={2}",    
    new Object[] { getClass().getSimpleName(), id, name });   }
}
