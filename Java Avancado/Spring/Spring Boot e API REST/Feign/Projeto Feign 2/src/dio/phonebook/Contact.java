package dio.phonebook;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contact {

    private Long id;
    private String nome;
    private String telefone;

}
