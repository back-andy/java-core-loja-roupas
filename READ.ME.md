## Decisões de Arquitetura e Aprendizados

Nesta etapa, realizei a migração de uma lógica **Imperativa** para uma abordagem **Declarativa/Funcional**, focada em escalabilidade e desacoplamento. Abaixo estão os pilares dessa mudança:

### 1. Reutilização via Generics (`<T>`)
Substituí implementações rígidas por uma estrutura genérica. Ao criar um **ServicoGenerico<T>**, permiti que qualquer nova entidade do sistema herde um **CRUD completo** sem qualquer duplicação de código, tornando o sistema altamente escalável.

### 2. Filtro Inteligente com **Predicate** (Princípio Open/Closed)
Implementei a busca de dados utilizando **Predicate<T>**, permitindo que o serviço funcione como um "juiz" que apenas aplica regras, sem precisar conhecê-las de antemão.

* **Na prática:** Em vez de métodos fixos como `buscarPorTamanho`, o serviço recebe um critério de aprovação. Ele percorre a lista e pergunta ao critério: *"Este item deve ser incluído?"*.
* **SOLID:** Isso respeita o princípio **Open/Closed**, pois o código do serviço está **fechado para alteração** (não precisa ser mexido para novos filtros), mas está **aberto para extensão** (quem chama define a regra via Lambda).

### 3. Ação Desacoplada com **Consumer**
A atualização de dados foi desenhada para que o **ServicoGenerico** não precise conhecer os campos internos da entidade (como `setPreco` ou `setNome`).

* **O conceito:** O serviço recebe um **Consumer**, que funciona como um "pacote de instruções". O serviço localiza o objeto e entrega esse pacote para ele.
* **Vantagem:** Quem define a mudança é quem faz a chamada (ex: *"mude o preço para 50"*). Isso mantém o serviço **100% genérico** e as classes protegidas.

### 4. Eficiência com **Stream API**
A adoção de Streams permitiu manipular coleções de forma muito mais legível e performática.

* **Foco no Resultado:** A lógica foca no **"o quê"** o dado deve se tornar e não no **"como"** percorrer a lista manualmente. É o benefício máximo da lógica funcional: código limpo, conciso e menos suscetível a erros de loop.

---

### Próximos Passos
- [ ] Implementar **Optional<T>** para evitar retornos nulos.
- [ ] Criar camada de **DTOs** para proteção das entidades.
- [ ] Desenvolver **Exceptions Personalizadas** para regras de negócio.