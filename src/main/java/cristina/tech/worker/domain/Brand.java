package cristina.tech.worker.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Embeddable data object, part of the {@link Dress} domain aggregate.
 */
@NoArgsConstructor(force = true) //Jackson JSON needs this for deserialization
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Brand implements Serializable {

    @JsonProperty("logo_url")
    String logoUrl;
    String name;

    public Brand(String logoUrl, String name) {
        this.logoUrl = logoUrl;
        this.name = name;
    }
}
