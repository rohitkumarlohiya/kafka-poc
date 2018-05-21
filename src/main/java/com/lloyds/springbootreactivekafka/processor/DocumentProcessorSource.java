package com.lloyds.springbootreactivekafka.processor;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface DocumentProcessorSource {
	String OUTPUT = "processoroutput";

	@Output(DocumentProcessorSource.OUTPUT)
	MessageChannel output();
}
