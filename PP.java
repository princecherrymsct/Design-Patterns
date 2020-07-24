using System; namespace ProxyPattern 
{ 

// Abstract class Subject
    public abstract class Subject
    {
        public abstract void DoSomeWork(); 
        
    } 

// concreteSubject class 
    public class ConcreteSubject : Subject
    {
        public override void DoSomeWork()
        {
            Console.WriteLine("ConcreteSubject.DoSomeWork()");
        } 
    } 

// Proxy class
    public class Proxy : Subject
    { 
        Subject cs; public override void DoSomeWork()
    {
    Console.WriteLine("Proxy call happening now..."); //Lazy initialization:We'll not instantiate until the method is called
    if (cs == null)
    {
        cs =new ConcreteSubject();
    } 
    cs.DoSomeWork();
}

class Program
{
    static void Main(string[] args)
    { 
        Console.WriteLine("Proxy Pattern Demo\n");
        Proxy px = new Proxy();
        px.DoSomeWork();
        Console.ReadKey();
    } 
} 

