package com.lloyds.springbootreactivekafka.processed;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Configuration;

import com.lloyds.springbootreactivekafka.domain.DocumentMessage;

@EnableBinding(ProcessedDocumentSink.class)
@Configuration
public class ProcessedDocumentHandler {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProcessedDocumentHandler.class);

	@StreamListener(ProcessedDocumentSink.INPUT)
	public void handle(final DocumentMessage message) {
		final DateTimeFormatter df = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)
				.withZone(ZoneId.systemDefault());
		final String time = df.format(Instant.ofEpochMilli(message.getTime()));
		LOGGER.info("Processed [{}]: {}", time, message.getContents());
	}
}
