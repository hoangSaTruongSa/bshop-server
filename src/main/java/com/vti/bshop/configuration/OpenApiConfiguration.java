package com.vti.bshop.configuration;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

//http://localhost:8080/swagger-ui/index.html#/
@OpenAPIDefinition(
        info = @Info(
                title = "BShop: Automobile Repair Shop",
                description = "Car Application REST APIs Documentation",
                termsOfService = "https://github.com/hoangSaTruongSa/bshop-client",
                contact = @Contact(
                        name = "Nguyễn Văn Bộ",
                        url = "https://github.com/an",
                        email = "nguyenvanbo1898@gmail.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0"
                ),
                version = "v1.0"
        ),
        servers = @Server(
                description = "Local ENV",
                url = "http://localhost:8080"
        ),
        externalDocs = @ExternalDocumentation(
                description = "BShop Application Github",
                url = "https://github.com/hoangSaTruongSa/bshop-client.git"
        )
)
public class OpenApiConfiguration {
}
