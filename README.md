# 👔 Java Core Store Management

Um laboratório de **Engenharia de Software** focado em desconstruir o funcionamento de frameworks modernos (como o Spring) utilizando apenas Java Core. O objetivo aqui foi trocar a conveniência das abstrações prontas pelo domínio da implementação manual.

## 🧠 Pilares da Arquitetura (Migração Imperativa -> Funcional)

### 1. Reutilização via Generics (<T>)
Substituí implementações rígidas por uma estrutura genérica. Ao criar um `ServicoGenerico`, permiti que qualquer nova entidade do sistema herde um CRUD completo sem qualquer duplicação de código, tornando o sistema altamente escalável.

### 2. Filtro Inteligente com Predicate (Princípio Open/Closed)
Implementei a busca de dados utilizando `Predicate`. Na prática, o serviço funciona como um "juiz" que apenas aplica regras. 
* **SOLID:** O código está fechado para alteração, mas aberto para extensão (quem chama define a regra via Lambda).

### 3. Ação Desacoplada com Consumer
A atualização de dados foi desenhada para que o `ServicoGenerico` não precise conhecer campos internos. O serviço localiza o objeto e entrega um "pacote de instruções" (`Consumer`), mantendo o desacoplamento total.

### 4. Eficiência com Stream API
Adoção de lógica declarativa para focar no "o quê" o dado deve se tornar, resultando em um código limpo, performático e menos suscetível a erros de loop manuais.

## 🛠 Tecnologias e Conceitos
- **Linguagem:** Java 25
- **Padrões:** Repository Pattern, Service Pattern, DTO (Data Transfer Object).
- **Recursos:** Lambdas, Stream API, Generics, Enums.

## 📌 Próximos Passos (Backlog)
- [ ] Implementar **Optional** para evitar retornos nulos.
- [ ] Refinar a camada de **DTOs** para proteção total das entidades.
- [ ] Desenvolver **Exceptions Personalizadas** para regras de negócio.
