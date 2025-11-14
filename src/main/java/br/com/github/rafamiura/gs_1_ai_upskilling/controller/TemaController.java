package br.com.github.rafamiura.gs_1_ai_upskilling.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class TemaController {

    @GetMapping("/info")
    public Map<String, String> info() {
        return Map.of(
            "tema", "Plataformas de upskilling e reskilling baseadas em IA",
            "membro 1", "Guilherme Korus Daoud",
            "membro 2", "Rafael Jun Miura",
            "descricao", "As Plataformas de Upskilling e Reskilling baseadas em Inteligência Artificial (IA) são soluções tecnológicas projetadas para ajudar indivíduos e empresas a aprimorar ou redefinir habilidades de maneira mais eficiente e personalizada. Essas plataformas utilizam IA para oferecer uma experiência de aprendizado mais adaptativa, otimizada e focada nas necessidades específicas de cada usuário, seja no desenvolvimento de novas competências (upskilling) ou na reinvenção de habilidades para diferentes funções (reskilling)"
        );
    }
}  

