package com.kt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kt.dto.UserCreateRequest;

@RestController
public class UserController {
	@PostMapping("users")
	@ResponseStatus(HttpStatus.CREATED)
	// loginID, password, name, birthday
	// json형태의 body에 담겨서 post요청으로 /users 가 들어오면
	// @RequestBody를 보고 jacksonObjectMapper가 동작해서 json을 읽어서 dto로 변환
	public void create(@RequestBody UserCreateRequest request) {
		// jackson object mapper -> json to dto를 매핑
	}
}
