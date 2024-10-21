package br.com.cotemig.bandsapi;

import br.com.cotemig.bandsapi.model.Band;
import br.com.cotemig.bandsapi.repository.BandRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BandsApiApplication implements CommandLineRunner {

    @Autowired
    private BandRepository bandRepository;

    private Logger logger = LoggerFactory.getLogger(BandsApiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BandsApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        if(bandRepository.count() == 0) {

            Band[] bands = {
                    new Band("Os Paralamas do Sucesso", "Ela Disse Adeus"),
                    new Band("Os Paralamas do Sucesso", "Meu Erro"),
                    new Band("Os Paralamas do Sucesso", "Lanterna dos Afogados"),
                    new Band("Metallica", "Enter Sandman"),
                    new Band("Metallica", "Nothing Else Matters"),
                    new Band("Metallica", "The Unforgiven"),
                    new Band("Capital Inicial", "Natasha"),
                    new Band("Capital Inicial", "Música Urbana"),
                    new Band("Capital Inicial", "Cai a Noite"),
                    new Band("Daft Punk", "One More Time"),
                    new Band("Daft Punk", "Get Lucky"),
                    new Band("Daft Punk", "Digital Love"),
            };

            for (Band band : bands) {
                bandRepository.save(band);
            }

            logger.info("Tabela de bandas populada com sucesso!");

        }else{
            logger.info("Tabela de bandas já está populada!");

        }
    }
}
