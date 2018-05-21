package com.lloyds.springbootreactivekafka.test;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface GenerateDocumentMessageSource {
	String OUTPUT = "generateinput";

	@Output(GenerateDocumentMessageSource.OUTPUT)
	MessageChannel output();
}
