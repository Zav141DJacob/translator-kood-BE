package translatorkood.translator;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.deepl.api.DeepLException;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class TranslatorController {

	@Autowired
	TranslatorService translatorService;

	@PostMapping("/translate")
	public TranslatorResponse translate(@RequestBody Translator body)
			throws DeepLException, InterruptedException, BadRequestException, ResponseStatusException {
		return translatorService.translate(body);
	}
}
