package org.sample.ai.componentkit.sample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bytechef.ai.componentkit.tool.ToolCallbackProviderFactory;

@Configuration
public class SampleAiComponentkitConfiguration {

    @Bean
    ToolCallbackProviderFactory integrationToolCallbackProviderFactory(
        @Value("${bytechef.ai.componentkit.api-key}") String apiKey,
        @Value("${bytechef.ai.componentkit.base-url:'https://app.bytechef.io'}") String baseUrl) {

        return new ToolCallbackProviderFactory(apiKey, baseUrl);
    }
}
