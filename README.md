# SpringExpression-language-examp
Spring Expression Language (SpEL), a powerful expression language, used to wire values into bean’s properties. It’s an expression language similar to other ELs, that supports querying and manipulating an object graph at runtime.

Here is the spring beans. You must register your beans using @Component, and specify your expression language using @Value annotation:
In this bean class, the expression language #{beanOrder} assigns "beanOrder" reference to order property, and #{beanOrder.item} assigns beanOrder item name to item property.

```
@Component("paymentGateway")
public class PaymentGateway {

    @Value("#{beanOrder.item}")
    private String itemName;

    @Value("#{beanOrder}")
    private Order order;

```
### OUTPUT:
```
Processing order: Java Book
```
