package br.com.treinaweb.adoteumpet.api.pet.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PetRequest {

    private String nome;
    private String historia;

    private String foto;

}
