# Lambdas
Since JDK8.
## Motivation
One issue with anonymous classes is that if the implementation of your anonymous class is very simple, such as **an interface that contains only one method**, then the syntax of anonymous classes may seem unwieldy and unclear. In these cases, you're usually **trying to pass functionality as an argument to another method**, such as what action should be taken when someone clicks a button. Lambda expressions enable you to do this, to **treat functionality as method argument, or code as data**.

# Use Case
Suppose that you are creating a social networking application. You want to create a feature that enables an administrator to perform any kind of action, such as sending a message, on members of the social networking application that satisfy certain criteria. 

Suppose that members of this social networking application are represented by the following Person class:

~~~
public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        // ...
    }

    public void printPerson() {
        // ...
    }
}
~~~

Suppose that the members of your social networking application are stored in a List<Person> instance.

This section begins with a naive approach to this use case. It improves upon this approach with local and anonymous classes, and then finishes with an efficient and concise approach using lambda expressions.

### Approach 1: Create Methods That Search for Members That Match One Characteristic

One simplistic approach is to create several methods; each method searches for members that match one characteristic, such as gender or age. The following method prints members that are older than a specified age:

~~~
public static void printPersonOlderThan(List<Person> persons, int age){
        for(Person person: persons){
            if(person.getAge() > age){
                person.printPerson();
            }
        }
    }
~~~

This approach can potentially make your application brittle, You would have to rewrite a lot of your API to accommodate any new requirement,this approach is unnecessarily restrictive; what if you wanted to print members younger than a certain age, for example?

### Approach 2: Specify Search Criteria Code in a Local Class

To specify the search criteria, you implement the CheckPerson interface:

~~~
public interface CheckPerson {
    public boolean test(Person p);
}
~~~

The following class implements the CheckPerson interface by specifying an implementation for the method test. 

~~~
public class CheckPersonEligibleForSelectiveService implements CheckPerson{
    @Override
    public boolean test(Person p) {
        return p.getGender() == Person.Sex.MALE
                && p.getAge() > 18
                && p.getAge() < 28;
    }
}
~~~

The following method takes list of persons and check criteria to search for specific persons.

~~~
public static void printElligiblePersons(List<Person> persons, CheckPerson tester){
        for(Person person: persons){
            if(tester.test(person)){
                person.printPerson();
            }
        }
    }
~~~

To use this class, you create a new instance of it and invoke the printPersons method:

~~~
printElligiblePersons(persons, new CheckPersonEligibleForSelectiveService());
~~~

### Approach 3: Specify Search Criteria Code in an Anonymous Class

Since the `CheckPerson` is rather a simple interface, we can use anonymous class to do away with local class like `CheckPersonEligibleForSelectiveService`.

One of the arguments of the following invocation of the method `printElligiblePersons` is an anonymous class that filters members that are eligible:

~~~
printElligiblePersons(persons, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.getGender() == Person.Sex.MALE
                        && p.getAge() > 18
                        && p.getAge() < 28;
            }
        });
~~~


### Approach 4: Specify Search Criteria Code with a Lambda Expression
But before proceeding on to that, we need to check

#### Syntax of Lambda expressions
~~~
(person) -> person.getGender() == Person.Sex.MALE
                             && person.getAge() > 18
                             && person.getAge() < 28
~~~

1. A comma-separated list of formal parameters enclosed in parentheses. 
**Note**:
* You can omit the data type of the parameters in a lambda expression, as it is inferred. This explained later following the example.
* you can omit the parentheses if there is only one parameter.
2. The arrow token, `->` seperating the formal parameters and method body.
3. A body, which consists of a single expression or a statement block.

**Note that a lambda expression looks a lot like a method declaration; you can consider lambda expressions as anonymous methods—methods without a name.**




We can replace the anonymous class also with a lambda expression this can be done as follows:

~~~
printElligiblePersons(persons,
                (person) -> person.getGender() == Person.Sex.MALE
                             && person.getAge() > 18
                             && person.getAge() < 28);
~~~

**Short note on Type-Inference:**

Here one thing that can be confusing is what is **`person`** type?. However, JDK reverse engineers the type, which is to say that, the method declaration of **`printElligiblePersons`** has second parameter as, **`CheckPerson`**, which is this interface:

~~~
public interface CheckPerson {
    public boolean test(Person p);
}
~~~

The lambda expression caters to provide implementation for this interface, and hence it basically represents the abstract method of **`test`**, which takes instance of **`Person`** class as parameter, hence compiler _**infers**_ person to be of type **`Person.class`**.
You can access all the APIs of Person class in the lambda expression's body following **`->`** token. For example, **`person.getAge()`**

**Aha! Moment**

This is also partially the reason, why lambda expression can be used to instantiate implementations of functional interfaces. Functional interfaces by definition have one and only one abstract method. Hence when we instantiate any implementations of these simple interfaces, we can use lambda expressions. These lambda expression basically become the method body of that one abstract method, and formal parameters directly relate to that one abstract method's parameters.

### Approach 5: Use Standard Functional Interfaces with Lambda Expressions

As we have learnt that we can use lambda experssions to instantiate implementations of functional interfaces. We can simplify this further by removing entire fleet of anonymous classes, local classes and interfaces. We can corelate our usecase to find if any of the existing functional interfaces could be of use to us. In our example, **`Predicate`** functional interface, does right that.

Predicate's contain a abstract method **`test`**, which takes in a generic parmeter and returns **`boolean`** true/false

~~~
 /**
     * Evaluates this predicate on the given argument.
     *
     * @param t the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
    boolean test(T t);
~~~


**Lambdas are now extensively used in streams() starting JDK 8**

** A few
 



         

