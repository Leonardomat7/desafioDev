package com.desafio.dev.controller;

import com.desafio.dev.XmlProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@RestController
@RequestMapping("/api/upload")
public class UploadController {

    private final XmlProcessor xmlProcessor;

    @Autowired
    public UploadController(XmlProcessor xmlProcessor) {
        this.xmlProcessor = xmlProcessor;
    }

    @PostMapping("/upload")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O arquivo está vazio.");
        }

        try {
            xmlProcessor.processarXml(file);
            return ResponseEntity.status(HttpStatus.OK).body("Arquivo XML processado com sucesso.");
        } catch (JAXBException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao processar o arquivo XML.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
