package br.com.martins.maisquestoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MaisQuestoesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaisQuestoesApplication.class, args);
    }

}
