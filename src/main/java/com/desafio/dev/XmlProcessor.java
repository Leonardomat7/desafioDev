package com.desafio.dev;

import com.desafio.dev.model.Agente;
import com.desafio.dev.model.Agentes;
import com.desafio.dev.repository.AgenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class XmlProcessor {

    private final AgenteRepository agenteRepository;

    @Autowired
    public XmlProcessor(AgenteRepository agenteRepository) {
        this.agenteRepository = agenteRepository;
    }

    public void processarXml(MultipartFile multipartFile) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Agentes.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        File tempFile = File.createTempFile("tempXml", ".xml");
        multipartFile.transferTo(tempFile);

        Agentes agentes = (Agentes) unmarshaller.unmarshal(tempFile);
        List<Agente> listaDeAgentes = agentes.getAgentes();

        for (Agente agente : listaDeAgentes) {
            agenteRepository.save(agente);
        }
        tempFile.delete();
    }
}
