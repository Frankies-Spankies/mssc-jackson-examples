package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

//Si el NOMBRE perfil mencionado en la anotacion @ActiveProfiles coincide con application-NOMBRE.properties tomara ese archivo de configuracion
//En este ejemplo la anotacion @JsonProperty sobrescribe la estrategia de nombrado snake_case y beerId no hace caso a la estrategia
@ActiveProfiles("snake")
@JsonTest
public class BeerDtoSnakeTest extends BaseTest {

    @Test
    void snakeTest() throws JsonProcessingException {
        BeerDto beerDto = getDto();
        String json = objectMapper.writeValueAsString(beerDto);
        System.out.println(json);
    }
}
