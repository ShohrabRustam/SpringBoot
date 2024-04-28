# SpringBoot
SpringBoot Framework 
Spring Features:
  1. POJO
  2. Dependency Injunction
  3. MVC
  4. Security
  5. Batch
  6. Data
  7. AOP etc.
     
Spring boot gives us a production-ready application
it provides us with embedded servers
  APP->OS->Hardware

spring-boot-started-web
spring-boot-started-jdbc


Dependency Injection: Dependency injection (DI) is a process whereby objects define their dependencies (that is, the other objects with which they work) only through constructor arguments, arguments to a factory method, or properties that are set on the object instance after it is constructed or returned from a factory method. The container then injects those dependencies when it creates the bean. This process is fundamentally the inverse (hence the name, Inversion of Control) of the bean itself controlling the instantiation or location of its dependencies on its own by using direct construction of classes or the Service Locator pattern.

ex: 
//class Laptop{
   // HardDrive obj = new HitachiHD();
//}
@component
class HitachiHD implements HardDrive{
........
......
}

DI exists in two major variants: Constructor-based dependency injection and Setter-based dependency injection.

