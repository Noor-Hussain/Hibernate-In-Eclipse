package in.entity.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
//@Table(name="mytable")  // we can set table name like this other wise only write tale annotation this annottion will create class name for table 
public class User {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column
 private long id;
	@Column
 private String name;
	@Column
 private String email;
	@Column
 private String pssword;
	@Column
 private String gender;
	@Column
 private String city;
 
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPssword() {
	return pssword;
}
public void setPssword(String pssword) {
	this.pssword = pssword;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
}
