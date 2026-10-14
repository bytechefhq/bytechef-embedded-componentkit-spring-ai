package org.sample.ai.componentkit.sample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bytechef.componentkit.tool.ToolCallbackProviderFactory;

@Configuration
public class SampleAiComponentkitConfiguration {

    @Bean
    ToolCallbackProviderFactory integrationToolCallbackProviderFactory(
        @Value("${bytechef.componentkit.api-key}") String apiKey,
        @Value("${bytechef.componentkit.base-url:'https://app.bytechef.io'}") String baseUrl) {

        return new ToolCallbackProviderFactory(apiKey, baseUrl);
    }
}
