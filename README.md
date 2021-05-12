# java-8-features
Project to showcase all the newly introduced features of Java 8


# Why Java 8 ?
• Most popular and widely accepted language in the world.
• Java creators wanted to introduce the Functional features such
as:
• Lambdas
• Streams
• Optional and etc.,
• Technological advancements with the mobile/laptops/systems.
• New Java 8 features simplify the concurrency operations.


# Functional Programming:
• Embraces creating Immutable objects.
• More concise and readable code.
• Using functions/methods as first class citizens.
Example:
Function<String,String> addSomeString = (name) ->
name.toUpperCase().concat("default");
• Write code using Declarative approach.

# Imperative Style of Programming
• Focuses on how to perform the operations.
• Embraces Object mutability.
• This style of programming lists the step by step of instructions on how
to achieve an objective.
• We write the code on what needs to be done in each step.
• Imperative style is used with classic Object Oriented Programming.

# Declarative Style of Programming
• Focuses on what is the result you want.
• Embraces Object immutability.
• Analogous to SQL (Structured Query Languague).
• Use the functions that are already part of the library to achieve an
objective.
• Functional Programming uses the concept of declarative programming.

# What is Lambda Expression?
• Lambda is equivalent to a function (method) without a name.
• Lambda’s are also referred as Anonymous functions.
• Method parameters
• Method Body
• Return Type
• Lambdas are not tied to any class like a regular method.
• Lambda can also be assigned to variable and passed around.

# Syntax of the Lambda Expression
Lambda Expression:
( ) -> { }


# Usages of Lambda
• Lambda is mainly used to implement Functional Interfaces(SAM).

# Lambda in Practice ( Things to keep in
Mind)
( ) -> Single Statement or Expression; // curly braces are not
needed.
( )-> { <Multiple Statements> }; // curly braces are needed for
multiple //statements
  
# Functional Interfaces
• Exists since Java 1.0
Definition:
• A Functional Interface(SAM) is an interface that has exactly one abstract
method.
@FunctionalInterface:
• This annotation is introduced as part of the JDK 1.8.
• Optional annotation to signify an interface as Functional Interface.

# New Functional Interfaces in Java8
• Consumer – BiConsumer
• Predicate - BiPredicate
• Function – BiFunction, UnaryOperator, BinaryOperator
• Supplier
