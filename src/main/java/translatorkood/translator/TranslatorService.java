package translatorkood.translator;

import javax.validation.Valid;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.deepl.api.DeepLException;
import com.deepl.api.TextResult;

@Service
public class TranslatorService {

//	This might be better suited for a Repository, but it feels awkward to create one just to fetch API_KEY
	@Value("${deepl.api.key}")
	private String API_KEY;

	public TranslatorResponse translate(@Valid Translator body)
			throws DeepLException, InterruptedException, BadRequestException {
		com.deepl.api.Translator translator = new com.deepl.api.Translator(API_KEY);
		TextResult result = translator.translateText(body.getText(), body.getSourceLang(), body.getTargetLang());
		return new TranslatorResponse(result.getText());
	}
}
