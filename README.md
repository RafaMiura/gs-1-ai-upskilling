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
2. Executar: `mvn spring-boot:run`
3. A API fica em `http://localhost:8081`
4. Swagger UI: `http://localhost:8081/swagger-ui.html` ou `http://localhost:8081/swagger-ui/index.html`

##URL DA IMAGEM NO DOCKER
https://hub.docker.com/layers/rafaooo/gs-1-ai-upskilling/latest/images/sha256-5f1f383923feb52acda704baa645e4abf8b2f56643fd75f6a838eab07d911292

##DESCRIÇÃO DOS WORKFLOWS
-Continuous Integration (CI)

Executado em push nas branches feature/*, release, e hotfix.
Realiza o build completo do projeto E executa todos os testes unitários.
Garante que cada nova alteração esteja compilando, funcional e empacotável.

-Continuous Delivery (CD)

Faz login no Docker Hub, constrói a imagem Docker da aplicação e publica automaticamente no repositório Docker Hub do projeto.
Garante entrega contínua e automatizada da aplicação.




