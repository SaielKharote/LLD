
### Facade Design Pattern
https://www.baeldung.com/java-facade-pattern
![img.png](img.png)
#### Here, in Amazon class there are various methods for different operations after order is placed.
#### We are segregating the relevant methods to the relevant classes so that our codebase doesn't become clumsy.
#### The logic for payments, supply chain management, tracking is kept in the particular payment service, scm service, tracking service.
#### We are only calling the methods in our main Amazon class so that the main class doesn't flood with unrelated code/logic
![img_1.png](img_1.png)


### Decorator Design Pattern

##### HTML uses Decorator pattern
![img_2.png](img_2.png)

--------------------------------------------------------

### Usecase Diagram
#### Scaler System
![Use CaseDiagram.png](UseCaseDiagram.png)
