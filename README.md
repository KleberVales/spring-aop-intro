# 🧩 spring-aop-intro

Projeto criado para demonstrar a aplicação prática de **Aspect-Oriented Programming (AOP)** com o Spring Framework.

---

## 🎯 Objetivos do projeto

- Entender o que é AOP e como o Spring aplica esse paradigma
- Utilizar `@Aspect`, `@Before`, `@After`, `@Around` e `@Pointcut`
- Demonstrar o uso de proxies e o conceito de *cross-cutting concerns*
- Medir o tempo de execução de métodos sem alterar a lógica de negócio

---

## 🧠 Conceitos aplicados

| Conceito         | Descrição                                                                 |
|------------------|---------------------------------------------------------------------------|
| **Aspect**       | Classe com lógica transversal, marcada com `@Aspect`                      |
| **Advice**       | Ação executada em um ponto específico (ex: antes ou depois de um método)  |
| **Join Point**   | Ponto de execução onde um Advice pode ser aplicado                        |
| **Pointcut**     | Expressão que define quais métodos serão interceptados                    |
| **Weaving**      | Processo de aplicar o aspecto ao código original via proxies              |

---

## 📁 Estrutura do projeto

```text
spring-aop-intro/
└── src/
└── main/
├── java/com.example.springaop/
│ ├── SpringAopIntroApplication.java
│ ├── service/
│ │ └── UserService.java
│ └── aspect/
│ └── LoggingAspect.java
└── resources/
└── application.yml (opcional)
```

---

## 🔄 Fluxograma lógico de execução AOP

```plaintext
             +-----------------------------+
             |   Método chamado no bean    |
             |   UserService.registerUser  |
             +-----------------------------+
                          |
                          v
             +-----------------------------+
             |  Proxy do Spring intercepta |
             |     a chamada via AOP       |
             +-----------------------------+
              |         |           |
              |         |           |
              |         |           |
              v         v           v
     +-----------+  +-----------+  +--------------+
     | @Before   |  | @Around   |  | @After       |
     | Executado |  | Mede tempo|  | Executado    |
     | antes     |  | executa o |  | após o método|
     | do método |  | método    |  | original     |
     +-----------+  +-----------+  +--------------+
                          |
                          v
               +---------------------------+
               | registerUser() executado  |
               +---------------------------+

```

## 🔧 Tecnologias utilizadas

- Java 21
- Spring Boot 3.5.x
- Spring AOP
- Gradle (Kotlin DSL)
- IntelliJ IDEA

---

## ▶️ Como executar o projeto

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/spring-aop-intro.git
cd spring-aop-intro
```

2. Execute com Gradle:

```bash
./gradlew bootRun
```

## 🖥️ Saída esperada no console

```text
🔍 [BEFORE] Iniciando método de serviço...
👤 Registrando usuário: kleber.vales
✅ [AFTER] Método de serviço finalizado.
⏱️ [AROUND] Tempo de execução: 502ms
```

---

**Kleber Vales**  

*Back-end Software Engineer*  
Java + Spring Boot | Cloud & DevOps | Git & GitHub | Scrum | JUnit | Hibernate  

Bacharel em Ciência da Computação  
MBA em Desenvolvimento de Software (Cursando)

