package com.bovino.cdcdemoclient.service;

import com.bovino.cdcdemoclient.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@FeignClient(name = "${feign.name}", url = "${feign.url}")
@Service
public interface UserClient {
    @RequestMapping(method = RequestMethod.GET, path = "/user", consumes = "application/json", produces = "application/json")
    List<User> getAllUsers();

    @RequestMapping(method = RequestMethod.GET, path = "/user/{id}", consumes = "application/json", produces = "application/json")
    User getUserById(@PathVariable Integer id);

    @RequestMapping(method = RequestMethod.POST, path = "/user", consumes = "application/json", produces = "application/json")
    User saveNewUser(@RequestBody User user);

    @RequestMapping(method = RequestMethod.DELETE, path = "/user", consumes = "application/json")
    ResponseEntity<Void> deleteUser(@RequestBody Integer[] ids);
}