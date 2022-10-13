# Singleton

## Conceitos

* Apenas uma instância criada
* Garante o controle do recurso
* Lazy loaded

**Exemplos**:
* Runtime
* Logger
* Spring beans (default scope)
* Gerenciadores gráficos

## Design

* A classe é responsável pelo seu ciclo de vida
* Static por natureza
* Precisa ser thread safe
* Private instace
* Private constructor
* Nenhum parametro obrigatório

### Pitfalls

* Alta utilização sem critério
* Mais dificil para testar
* Caso não seja cuidadoso, pode não ser thread safe
