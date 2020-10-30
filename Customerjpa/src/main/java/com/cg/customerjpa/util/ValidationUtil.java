package com.cg.customerjpa.util;

import com.cg.customerjpa.exceptions.*;

public class ValidationUtil {

	public static void checkArgumentNotNull(Object argument) {
		if (argument == null) {
			throw new InvalidArgumentException("arg can't be null");
		}
	}

	public static void checkName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidCustomerNameException("name is not valid");
		}

	}


}
