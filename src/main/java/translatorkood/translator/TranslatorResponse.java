package translatorkood.translator;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TranslatorResponse {

	public TranslatorResponse(String text) {
		this.text = text;
	}

	@JsonProperty("text")
	private String text;
}
