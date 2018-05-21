package com.lloyds.springbootreactivekafka.processor;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface DocumentProcessorSink {
	String INPUT = "processorinput";

	@Input(DocumentProcessorSink.INPUT)
	SubscribableChannel input();
}
