package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.extern.jackson.Jacksonized;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
@Document(collection = "registro")
@Jacksonized
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Registro{
    @JsonProperty("NUMERO_AUTORIZACION")
    public String nUMERO_AUTORIZACION;
    @JsonProperty("TIPO_DOCUMENTO_AFILIADO")
    public String tIPO_DOCUMENTO_AFILIADO;
    @JsonProperty("ID_AFILIADO")
    public String iD_AFILIADO;
    @JsonProperty("CODIGO_PRESTACION")
    public String cODIGO_PRESTACION;
    @JsonProperty("CANTIDAD_PRESTADA")
    public int cANTIDAD_PRESTADA;
    @JsonProperty("VALOR_UNITARIO_PRESTACION")
    public int vALOR_UNITARIO_PRESTACION;
    @JsonProperty("FECHA_PRESTACION")
    public String fECHA_PRESTACION;
    @JsonProperty("LINEA")
    public int lINEA;
}


