package com.gokhanbilgin.business.abstracts;

import com.gokhanbilgin.core.entities.User;
import com.gokhanbilgin.core.utilities.results.DataResult;
import com.gokhanbilgin.core.utilities.results.Result;

public interface UserService {
	Result add(User user);

	DataResult<User> findByEmail(String email);

}
