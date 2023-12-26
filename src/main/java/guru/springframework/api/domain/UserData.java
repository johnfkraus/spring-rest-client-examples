package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserData implements Serializable {
  List<User> data;

  public UserData() {
    data = new ArrayList<>();
  }

  public List<User> getData() {
    return data;
  }

  public void setData(List<User> data) {
    this.data = data;
  }
}
