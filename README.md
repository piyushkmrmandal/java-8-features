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

# Method Reference
• Introduced as part of Java 8 and its purpose is to simplify the
implementation Functional Interfaces.
• Shortcut for writing the Lambda Expressions.
• Refer a method in a class.

# Syntax of Method Reference
ClassName::instance-methodName
ClassName::static-methodName
Instance::methodName

Where to use Method Reference?
• Lambda expressions referring to a method directly.
Using Lambda:
Function<String,String> toUpperCaseLambda = (s)->s.toUpperCase();
Using Method Reference:
Function<String,String> toUpperCaseMethodRefernce =
String::toUpperCase;

# Constructor Reference
• Introduced as part of Java 1.8
Syntax:
Classname::new

Example:
Supplier<Student> studentSupplier = Student::new;
Invalid:
Student student = Student::new; // compilation issue
  
#  Lambdas and Local Variables
What is a Local variable ?
• Any variable that is declared inside a method is called a local
variable.
• Lambdas have some restrictions on using local variables:
• Not allowed to use the same the local variable name as
lambda parameters or inside the lambda body.
• Not allowed re-assign a value to a local variable.
• No restrictions on instance variables.

# Local Variables – Not Allowed
Repeated Variable Name:
• Variable i is declared in the same scope and used as a parameter
in Lambda.
• You cannot use the same variable as a lambda parameter or inside
the lambda body.
Same Variable as Input:
int i=0; //Repeated varibale name not allowed
Consumer<Integer> c1 = (i) -> {
System.out.println(i+value);
};
  
• Not allowed to modify the value inside the lamda
int value =4;
Consumer<Integer> c1 = (a) -> {
//value=6; //reassigning not allowed
// System.out.println(i+value);
};

# Effectively Final
• Lambda’s are allowed to use local variables but not allowed to
modify it even though they are not declared final. This concept is
called Effectively Final.
• Not allowed to modify the value inside the lamda
int value =4;
Consumer<Integer> c1 = (a) -> {
//value=6; //reassigning not allowed
// System.out.println(i+value);
};
• Prior to Java 8 , any variable that’s used inside the anonymous
class should be declared final.
  
# Advantages of Effectively Final:
• Easy to perform concurrency operations.
• Promotes Functional Programming and demotes the
Imperative style programming.
