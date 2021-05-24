># **Software Architecture Design**

```
Name: Younten Tshering
email_ID: yountentshering@jnec.edu.bt
```

>## **Key Concept**:

No single architecture is best! Quality attribute will define it and we should accept the drawback and prioritize the quality.

All **patterns**, strive for separation of concerns and removing dependencies because reducing software complexity mean higher chance to make changes and add features which is economic value at the end.

Therefore, software architecture increases reusability, save time and money in future perspective.
>## **Information:** 

Try to **increase cohesion** (by separating based on responsibilities) and **reduce coupling** (by using design patterns and refactoring)

>## Important dependencies:

1. **Spring Web** - provides controllers and MVC support (making web interface)
2. **H2** → dependency for generating in-memory database for quick testing.
3. **Spring JPA** → dependency for supporting many common calls to database without writing a bunch of SQL queries (Object Relational Mapping (**ORM**) mapping tool)
4. **Lombok (builder)** → ability to get setters and getters, without getting any boilerplate code
5. **Java Mail Sender** → simple api for sending email 
6. **Spring Security** → provides built-in authentication/authorization
7. **Rest Repositories** → provides automatic restful ontrollers
8. **Validation** → provides table validation such as @Email
9. **Spring Session** → provides session support

>### Aside from these dependencies, additional dependencies from maven repositories:

- **Tomcat jasper** → allows us to work with .jsp files.
- **Jackson dataformat xml** → allows our RESTful API to work with XML, instead of only json files
- **JSTL** → a jsp tagging library for looping and conditional logic
- **Money-api and moneta** → for working with currency file

> Method while coding:

1. Start with model,
2. dao or repo,
3. services, 
4. localconverter, 
5. controller and view,
6. Refactored the code.

----------------------------------------------Thank You---------------------------------------------------------------