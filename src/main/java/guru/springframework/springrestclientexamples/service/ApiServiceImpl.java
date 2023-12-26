package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

  private RestTemplate restTemplate;

  public ApiServiceImpl(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

//  @Override
//  public List<User> getUsers(Integer limit) {
//    UserData userData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users?_limit=" + limit, UserData.class);
//    return userData.getData();
//  }

//  @Override
//  public List<User> getUsers(Integer limit) {
//    UserData response = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users?_limit=3", UserData.class);
//    List<User> data = response.getData();
//    return data;
//  }


  @Override
  public User[] getUsers(Integer limit) {

    ResponseEntity<User[]> response = restTemplate.getForEntity(
      "https://jsonplaceholder.typicode.com/users?_limit=3",
      User[].class);
    User[] data = response.getBody();
    return data;
  }

}
