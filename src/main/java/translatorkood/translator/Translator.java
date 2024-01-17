package translatorkood.translator;

import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
@Validated
public class Translator {

	@JsonProperty("text")
	@NotNull
	@Min(value = 1, message = "Translated text can't be empty!")
	@Max(value = 250, message = "Translated text can't be more than 250!")
	private String text;

	@JsonProperty("sourceLang")
	@Nullable
	private String sourceLang;

	@JsonProperty("targetLang")
	private String targetLang;
}
