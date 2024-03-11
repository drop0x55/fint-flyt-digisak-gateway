package no.fintlabs.instance.gateway.model.digisak;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import no.fintlabs.gateway.instance.validation.constraints.ValidBase64;
import org.springframework.http.MediaType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@EqualsAndHashCode
@Jacksonized
@Builder
public class SubsidyDocument {

    @NotBlank
    private String name;

    @NotNull
    private MediaType mediaType;

    private String encoding;

    @NotNull
    @ValidBase64
    private String base64;
}
