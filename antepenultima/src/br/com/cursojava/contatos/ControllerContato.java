package br.com.cursojava.contatos;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("contatos")
public class ControllerContato {

	private RepositorioContato rep = new RepositorioContato();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contato> getContatos() {
		return rep.buscaTodos();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarContatoPorId(@PathParam("id") Integer id) {
		Contato contato = rep.buscarPorId(id);
		if (contato != null) {
			return Response.ok(contato).build();
		} else {
			return Response.status(Status.NOT_FOUND).build();
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response inserir(Contato contato) {

		if (contato != null && contato.getId() == null) {
			boolean result = rep.salvar(contato);
			if (result) {
				return Response.status(Status.CREATED).build();
			}
		}
		return Response.status(Status.NOT_ACCEPTABLE).build();
	}

}
