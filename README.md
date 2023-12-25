[![CircleCI](https://circleci.com/gh/springframeworkguru/spring-rest-client-examples.svg?style=svg)](https://circleci.com/gh/springframeworkguru/spring-rest-client-examples)
# Spring Rest Client Examples

This repository is for an example application built in my Spring Framework 5 - Beginner to Guru

You can learn about my Spring Framework 5 Online course [here.](http://courses.springframework.guru/p/spring-framework-5-begginer-to-guru/?product_id=363173)




The service of apifaketory is down. Please use https://jsonplaceholder.typicode.com/users as an alternative API.The service of apifaketory is down. Please use https://jsonplaceholder.typicode.com/users as an alternative API.

@Override
public List<User> getUsers(Integer limit) {
List<User> userData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users?_limit=" + limit, List.class);
return userData;
}

{
"id": 1,
"name": "Leanne Graham",
"username": "Bret",
"email": "Sincere@april.biz",
"address": {
"street": "Kulas Light",
"suite": "Apt. 556",
"city": "Gwenborough",
"zipcode": "92998-3874",
"geo": {
"lat": "-37.3159",
"lng": "81.1496"
}
},
"phone": "1-770-736-8031 x56442",
"website": "hildegard.org",
"company": {
"name": "Romaguera-Crona",
"catchPhrase": "Multi-layered client-server neural-net",
"bs": "harness real-time e-markets"
}
},