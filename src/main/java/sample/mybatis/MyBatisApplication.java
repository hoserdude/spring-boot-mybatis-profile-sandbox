package sample.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sample.mybatis.domain.User;
import sample.mybatis.service.UserService;

@SpringBootApplication
public class MyBatisApplication implements CommandLineRunner {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MyBatisApplication.class, args);
	}

    @Autowired
    private UserService userService;

	@Override
	public void run(String... args) {
        System.out.println("Adding User");
        int userId = userService.addUser(new User("dude@dude.com", "thedude"));
        System.out.println("Getting User");
        User user = userService.getUser(userId);
        System.out.println("Got User: " + user.getUserName());
	}

}
