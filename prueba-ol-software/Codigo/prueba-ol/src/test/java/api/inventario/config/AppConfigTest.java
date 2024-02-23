package api.inventario.config;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppConfigTest {

    @Test
    public void testRestTemplateBean() {
        RestTemplate restTemplateMock = Mockito.mock(RestTemplate.class);
        AppConfig appConfig = new AppConfig();
        appConfig.restTemplate();
        RestTemplate restTemplate = appConfig.restTemplate();
        assertNotNull(restTemplate);
    }
}
