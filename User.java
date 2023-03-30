public class User {
  private String username;
  private String password;
  public User(String username,String password){
    this.username = username;
    this.password = password;
  }
  //getter
  public String getUsername(){
    return this.username;
  }
  public String getPassword(){
    return this.password;
  }
  //setter
  public void setPassword(String password){
    this.password = password;
  }
}
