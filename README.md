# gs-1-ai-upskilling

## Membros
- Nome: Guilherme Korus Daoud — RM: 97826
- Nome: Rafael Jun Miura - RM: 98845

## Tema
Plataformas de upskilling e reskilling baseadas em IA

## Descrição do tema
As Plataformas de Upskilling e Reskilling baseadas em Inteligência Artificial (IA) são soluções tecnológicas projetadas para ajudar indivíduos e empresas a aprimorar ou redefinir habilidades de maneira mais eficiente e personalizada. Essas plataformas utilizam IA para oferecer uma experiência de aprendizado mais adaptativa, otimizada e focada nas necessidades específicas de cada usuário, seja no desenvolvimento de novas competências (upskilling) ou na reinvenção de habilidades para diferentes funções (reskilling)

## Resumo da finalidade da API
API simples que expõe informações do tema via endpoint GET `/info`. Implementada em Java + Spring Boot, sem persistência.

## Como executar localmente
1. Buildar: `mvn clean package`
2. Rodar: `java -jar target/gs-1-ai-upskilling-0.0.1-SNAPSHOT.jar`
3. A API fica em `http://localhost:8081`
4. Swagger UI: `http://localhost:8081/swagger-ui.html` ou `http://localhost:8081/swagger-ui/index.html`

## Docker
Build da imagem local:
```bash
docker build -t <SEU_DOCKERHUB_USERNAME>/gs-1-ai-upskilling:latest .
