# projeto-api-dashboard

Neste projeto desenvolvi uma API-REST para uma aplicação WEB passada pelo professor da 
cadeira de Programação WEB onde tinhamos tabelas de gerencimento de alunos, professores e 
projetos, utilizando a linguagem Java e o framework Spring Boot que é uma extensão do 
Spring Framework que visa simplificar o processo de configuração e desenvolvimento de 
aplicativos Spring para uma aplicação WEB.

As principais vantagens de usar o Spring Boot são:
1-Facilidade de configuração.
2-Aumento da produtividade.
3-Integração perfeita com o ecossistema Spring.
4-Autossuficiência com um servidor de aplicativos embutido.
5-Suporte para criação de microsserviços.
Essas vantagens tornam o Spring Boot uma escolha excelente para o desenvolvimento em Java, 
proporcionando simplicidade, eficiência e agilidade no processo de desenvolvimento.

Neste projeto também utilizei a arquitetura mais comum para APIs REST, a MVC (Model-View-Controller),
onde temos classes Controladoras, de Serviços e Repositorios. Elas tem as seguintes responsabilidades:

--Os Controladores (Controllers): São responsáveis por receber as solicitações HTTP 
dos clientes e rotear as requisições para os respectivos métodos de manipulação. 
--Os Serviços (Services): Contêm a lógica de negócios do aplicativo. Eles encapsulam a funcionalidade 
específica e fornecem métodos para manipular os dados e executar operações relacionadas à lógica de negócios.
--Os Repositórios (Repositories): São responsáveis pela persistência e recuperação dos dados do aplicativo. 
Eles fornecem métodos para realizar operações de consulta e manipulação dos dados no banco de dados.
--Os Modelos (Models): Representam as entidades ou objetos de negócio do aplicativo.

Também é comum usarmos DTOs(Data Transfer Objects) e Mappers(Mapeadores) para manipular dados entre a camada 
de apresentação (controladores) e a camada de serviço.
Os DTOs são objetos utilizados para transferir dados entre as camadas da aplicação e os Mappers são responsáveis 
por mapear objetos de um tipo para outro.


