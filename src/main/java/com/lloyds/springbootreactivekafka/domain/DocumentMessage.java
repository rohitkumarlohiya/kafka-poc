package com.lloyds.springbootreactivekafka.domain;

public class DocumentMessage {
	private String contents;
	private long time;

	public DocumentMessage() {
		super();
	}

	public DocumentMessage(String contents, long time) {
		super();
		this.contents = contents;
		this.time = time;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "DocumentMessage [contents=" + contents + ", time=" + time + "]";
	}

}
