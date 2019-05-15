package com.GrizzlyStore.Model;

public class Login {
String userName,password;
int attempt,currentStatus;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAttempt() {
	return attempt;
}
public void setAttempt(int attempt) {
	this.attempt = attempt;
}
public int getCurrentStatus() {
	return currentStatus;
}
public void setCurrentStatus(int currentStatus) {
	this.currentStatus = currentStatus;
}
public Login(String userName, String password, int attempt, int currentStatus) {
	super();
	this.userName = userName;
	this.password = password;
	this.attempt = attempt;
	this.currentStatus = currentStatus;
}
public Login() {
	super();
	// TODO Auto-generated constructor stub
}

}
