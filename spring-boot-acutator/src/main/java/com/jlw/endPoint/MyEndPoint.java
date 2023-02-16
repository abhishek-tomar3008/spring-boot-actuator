package com.jlw.endPoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "abhi", enableByDefault = true)
public class MyEndPoint {

	@ReadOperation
	public MyEndPointResponse features() {
		return new MyEndPointResponse(263872, "Abhishek", "Active ");
	}

}