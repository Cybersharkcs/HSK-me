package com.hskme.rs;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.hskme.dto.DictionnaireDto;
import com.hskme.service.DictionnaireDtoService;
import com.hskme.service.DictionnaireDtoServiceImpl;

@Path("/DictionnaireDto")
@Component
public class DictionnaireDtoResource {
	@Resource(name="dictionnaireDtoServiceImpl")
	DictionnaireDtoServiceImpl dico;
	
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public DictionnaireDto getDictionnaire() {
    	System.out.println("Entering dictionnaireDto get method");
        return dico.unmarshallDictionnaire();
    }
  
//    @POST
//    public Response post(Product product) {
//        Products.put(product);
//        return Response.ok(product).build();
//    }
//  
//    @GET
//    public Response get() {
//        List<Product> products = Products.get();
//        GenericEntity<List<Product>> entity = new GenericEntity<List<Product>>(products) {};
//        return Response.ok(entity).build();
//    }
	
}
