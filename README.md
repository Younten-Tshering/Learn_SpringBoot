># # Software Architecture Design

**Name:** Younten Tshering  
**Email:** yountentshering@jnec.edu.bt

## Key Concept
No single architecture is best! Quality attributes define the choice, so we should accept trade‑offs and prioritize the quality we need most.

All *patterns* strive for separation of concerns and removing dependencies. Reducing software complexity means a higher chance to make changes and add features, which provides economic value at the end.

Therefore, software architecture increases reusability, saving time and money in the future.

## Information
Try to *increase cohesion* (by separating based on responsibilities) and **reduce coupling** (by using design patterns and refactoring).

## Important dependencies
- **Spring Web** – provides controllers and MVC support (making web interface)
- **H2** – dependency for getting an in‑memory database for quick testing
- **Spring JPA** – dependency supporting many common calls to a database without writing a bunch of SQL queries (object relational mapping tool)
- **Lombok (builder)** – ability to get setters and getters without writing boilerplate code
- **Java Mail Sender** – via spring mail API for sending email
- **Spring Security** – provides built‑in authentication/authorization
- **Rest Repositories** – provides automatic RESTful controllers
- **Validation** – provides validation such as `@Email`
- **Spring Session** – provides session support

## Additional dependencies from Maven repositories (for `.jsp` pages)
- **Tomcat jasper** – allows us to work with `.jsp` files
- **Jackson dataformat xml** – allows our RESTful API to work with XML instead of only JSON files
- **JSTL** – a JSP tagging library for looping and conditional logic
- **Money‑api and moneta** – for working with currency files

## Method while coding
1. Start with model
2. Dao or repository
3. Services
4. Local converter
5. Controller and view
6. Refactor the code

---

Thank You---------------------------------------------Thank You---------------------------------------------------------------
