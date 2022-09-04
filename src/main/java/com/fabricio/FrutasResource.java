package com.fabricio;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/frutas")
public class FrutasResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruta> hello() {
        return Fruta.listAll();
    }

    @POST
    @Transactional
    public void notaFruta() {
        Fruta fruta = new Fruta();
        fruta.nome = "morango";
        fruta.qtd = 5;
        fruta.persist();
    }
}