package com.bovino.cdcdemoclient.service;

import com.bovino.cdcdemoclient.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {
        "feign.url=http://localhost:${stubrunner.runningstubs.test-webapp.port:8082}" })
@AutoConfigureStubRunner(
        ids = "${stubrunner.ids}",
        mappingsOutputFolder = "/mappingsOutput",
        stubsMode = StubRunnerProperties.StubsMode.LOCAL)
// stubsMode pode ser CLASSPATH ou REMOTE, exige setar repositoryRoot do repo dos contratos
public class UserClientTest {

    @Autowired
    private UserClient userClient;

    @Test
    public void getUserByIdAndCreateUserCompliesToContract() {
        User user = new User();
        user.setId(1);
        user.setName("new username 1");
        user.setLogin("new login 1");
        User returnedUser = userClient.saveNewUser(user);
        assertNotNull(returnedUser);
    }

    @Test
    public void getAllUserCompliesToContract() {
        List<User> returnedUsers = userClient.getAllUsers();
        assertNotNull(returnedUsers);
        assertNotEquals(returnedUsers.size(), 0);
    }

    @Test
    public void deleteUserCompliesToContract() {
        Integer[] ids = new Integer[2];
        ids[0] = 1;
        ids[1] = 2;
        ResponseEntity<Void> response = userClient.deleteUser(ids);
        assertEquals(response.getStatusCode().value(), 200);
    }

}