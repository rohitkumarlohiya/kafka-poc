package com.lloyds.springbootreactivekafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.lloyds.springbootreactivekafka.domain.DocumentMessage;

@Component
public class DocumentProcessorServiceImpl implements DocumentProcessorService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DocumentProcessorService.class);

	@Override
	public DocumentMessage processDocument(DocumentMessage message) {
		LOGGER.info("Processing document: " + message);
		final String contents = message.getContents().toUpperCase() + "!";
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DocumentMessage(contents, message.getTime());
	}

}
