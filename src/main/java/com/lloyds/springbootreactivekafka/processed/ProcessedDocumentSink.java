package com.lloyds.springbootreactivekafka.processed;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ProcessedDocumentSink {
	String INPUT = "processedinput";

	@Input(ProcessedDocumentSink.INPUT)
	SubscribableChannel input();
}
