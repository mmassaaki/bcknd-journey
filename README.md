# bcknd-journey
aprendizado backend

Entre 01/03 à 30/09/2024, o compromisso é de ter estudos focados de qualidade em programação.

A parte de backend estará originada neste repositório, a parte de frontend ficará à cargo do Miguel

O objetivo final é estarmos com as habilidades em programação afiadas para eventuais oportunidades na carreira e eventualmente poder trabalhar em projetos fora da empresa onde estamos empregados

## Mini projeto de consulta de CEP

O presente projeto foi apenas adaptado de um tutorial. O principal trabalho aqui foi fazê-lo funcionar e, principalmente, explicá-lo.

Trata-se de um consumidor de API (Application Programming Interface), ou seja, uma aplicação que consome um recurso disponibilizado por terceiros de forma que a implementação é focada na construção nova e não naquilo que já está disponibilizado. Trata-se do uso de encapsulamento, que do lado do provedor, garante a proteção contra modificações indesejadas e do lado do consumidor, a possibilidade de usar artefatos prontos.  
No projeto corrente, houve apenas a necessidade de criar uma interface, utilizar um pacote de consumo de json, a classe Scanner e outro de conexão http em uma arquitetura clássica de controlador, serviço e modelo. Segue explicação detalhada.

### Arquitetura

O mini-projeto não seguiu um design pattern nominado. Trata-se de uma arquitetura de camadas genérica, mas que separa bem as responsabilidades e é facilmente legível. Temos o pacote main, que pode ser estabelecido como a camada de apresentação, o pacote serviço, que é onde temos a lógica de negócio e o pacote domínio, que tem as entidades e objetos principais da abstração de negócio.

É importante praticar a modelagem de aplicações em padrões de mercado, pois há grandes vantagens ao utilizá-los:

* Há mais legibilidade, o que facilita o trabalho em equipe e continuidade do ciclo de vida do softer nas sucessões de desenvolvedores 
* Melhor separação de responsabilidade, resultando em facildiade de desacoplar os componentes  
* Facilita a manutenção do código  
* Facilita a escalabilidade da aplicação

### Biblioteca Google Gson para consumo de Json

### Método HttpURLConnection

### Classe Scanner
