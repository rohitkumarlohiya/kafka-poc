package com.lloyds.springbootreactivekafka.test;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;

import com.lloyds.springbootreactivekafka.domain.DocumentMessage;

@EnableBinding(GenerateDocumentMessageSource.class)
public class TimerSource {

	@InboundChannelAdapter(value = GenerateDocumentMessageSource.OUTPUT, poller = @Poller(fixedDelay = "1000", maxMessagesPerPoll = "1"))
	public DocumentMessage timerMessageSource() {
		return new DocumentMessage("hello world", System.currentTimeMillis());
	}
}
