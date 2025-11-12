package com.kt.common;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
	NOT_FOUND_USER(HttpStatus.BAD_REQUEST, "존재하지 않는 유저입니다."),
	NOT_FOUND_PRODUCT(HttpStatus.BAD_REQUEST, "상품을 찾을 수 없습니다."),
	NOT_ENOUGH_STOCK(HttpStatus.BAD_REQUEST, "상품의 재고가 없습니다."),
	NOT_MATCH_OLD_PASSWORD(HttpStatus.BAD_REQUEST, "비밀번호가 일치하지 않습니다."),
	NOT_ALLOW_SAME_PASSWORD(HttpStatus.BAD_REQUEST, "이전과 같은 비밀번호를 사용할 수 없습니다.");

	private final HttpStatus status;
	private final String message;
}
