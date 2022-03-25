package com.amdocs.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.amdocs.model.User;

@FeignClient(name = "user-service")
public interface UserClient {

	@GetMapping("user/getalluser")
	public List<User> getAccountUser();

}
