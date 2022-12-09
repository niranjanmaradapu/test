
package com.otsi.testdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.otsi.testdemo.dto.TestVO;

/**
 * @author Sudheer.Swamy
 *
 */
@RestController
public class TestController {

	private static final String msg = "successful";

	@GetMapping("test")
	public ResponseEntity<?> testDocker() {
		TestVO test = new TestVO();
		test.setMessage(msg);
		return new ResponseEntity<>(test, HttpStatus.OK);

	}

	@GetMapping("test-user")
	public ResponseEntity<?> testingDocker(@RequestParam(name = "user", required = false) String user) {
		if (StringUtils.isEmpty(user)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "user input is empty");
		}
		if (user.equalsIgnoreCase("test-user")) {
			TestVO test = new TestVO();
			test.setMessage(msg);
			return new ResponseEntity<>(test, HttpStatus.OK);
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "invalid user name");
		}
	}

}
