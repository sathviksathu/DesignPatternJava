# Factory method

Factory method is a creational design pattern, which solves the problem of creating product objects without specifying their concrete classes.

In other words, we will be using a **`FactoryClass`** or **`factoryMethod()`** to return us the instantiated object based on some parameter, instead of using new(), the plain old default way to create Java objects.

### When to use?
Whenever we have a vareity in the base class, whose objects are to be created. For instance, in calling plans example, that we have implemented, we have different vareities
like:

**_`public enum PlanType {
     DOMESTIC,
     ROAMING,
     INTERNATIONAL
 }`_**

This is kind of indication that, we will be needing a higher level wrapper to create objects of Plan depending on type.

In other words, when the constructor logic begins to get ugly and more
 specifically, if you need some kind of switch-case or if-else based on some parameter
in the way the object is created.

*This scenario should shout in your face that, we need to use **Factory pattern.***

### How to implement?

1) Define an abstract base class, like **_`Plan`_**.
2) Define concrete class implementations of above declared abstract class, like <br /> **_`DomesticPlan`_**, **_`RoamingPlan`_**, **_`InternationalPlan`_**.
3) Define a Factory method class, which will be responsible for creating objects of Plans, like
**_`PlanFactory`_**.
4) Defina a method inside Factory method class, which takes in a deciding parameter and returns appropriately initialized concrete object of Plan, like
**_`public Plan getPlan(PlanType plan){}`_**
5) In main method, declare an instance of PlanFactory class,like<br />
**_`PlanFactory planFactory = new PlanFactory();`_**<br />
6) Use the **_`getPlan()`_** method of **_`PlanFactory`_** class to instantiate plan of any type like,<br />
**_`Plan domesticPlan = planFactory.getPlan(planType);`_**<br />
**_`Plan roamingPlan = planFactory.getPlan(planType);`_**<br />
**_`Plan internationalPlan = planFactory.getPlan(planType);`_**<br />

_**NOTE**: As you can notice, we assign the object created to abstract class type of **`Plan`**_

#

##### Examples
In PointDemo, we used **`factoryMethod()`**, way of creating objects.<br />
In PlanDemo, we used **`FactoryClass`**, way of creating objects.<br />

#
