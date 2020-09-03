# Inheritance in Object-Oriented Programming

## Types of Inheritance
1. Simple (Single) Inheritance.
2. Hierarchical Inheritance.
3. Multiple Inheritance. (NOT ALLOWED IN JAVA!!!!)
4. Multi-level Inheritance.
5. Hybrid Inheritance. (Requires Abstract Classes and/or Interfaces)


## Polymorphism
### Types of Polymorphism
1. Method Overloading
- Changing the behaviour of a method by changing:
- either the number of parameters OR
- the type of the parameters

2. Method Overriding
- Changing the behaviour of a method with calling it with different objects.


--- 
## Binding
It is the associating of a method call to its method body.
It has the following two types:

### Static Binding
When the binding  is performed by the compiler, at the compile-time, it is known as
`static binding` or `early binding`.
Binding for all static, private, and final methods is done at compile time.

### Dynamic Binding
It is also called `late-binding`. The compiler is not able to resolve the method call 
at compile time. Ex - method overriding.


## Dynamic Method Dispatch
- It is a mechanism by which we can achieve runtime polymorphism for
overridden methods in Java.

- It is implemented with the help of a reference variable of the Parent Class (SuperClass).

- The reference variable of the parent class can refer to the reference value
of an object of the Child Class (SubClass).

- There can be many subclasses inherited from a superclass.

- Each subclass will have its own version of the overridden method.

- The compiler will use the Dynamic Method Dispatch concept to find the correct
 version of the overridden method that should be executed.