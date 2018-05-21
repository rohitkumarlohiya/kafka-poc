package com.lloyds.springbootreactivekafka.service;

import com.lloyds.springbootreactivekafka.domain.DocumentMessage;

public interface DocumentProcessorService {

	public DocumentMessage processDocument(DocumentMessage message);
}
