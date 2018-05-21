package com.lloyds.springbootreactivekafka.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.SendTo;

import com.lloyds.springbootreactivekafka.domain.DocumentMessage;
import com.lloyds.springbootreactivekafka.service.DocumentProcessorService;

@EnableBinding(DocumentProcessorChannel.class)
@Configuration
public class DocumentProcessor {

	@Autowired
	private DocumentProcessorService docProcessorService;

	@StreamListener(DocumentProcessorChannel.INPUT)
	@SendTo(DocumentProcessorChannel.OUTPUT)
	public DocumentMessage transform(final DocumentMessage docMessage) {
		// its synchronous call i.e. if process document takes time to process document
		// it will delay everything
		return docProcessorService.processDocument(docMessage);
	}
}
