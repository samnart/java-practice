class GenericDemo
{
    public static <T> void reverse(T[] data)
    {
        int low = 0, high = data.length - 1;
        while (low < high)
        {
            T temp = data[low];
            data[low++] = data[high];
            data[high--] = temp;
        }
    }
}




//public class Portfolio<T>
//{
//    T[] data;
//    public Portfolio(int capacity)
//    {
////        data = new T[capacity];
//        data = (T[]) new Object()[capacity];
//    }
//    public T get(int index)
//    {
//        return data[index];
//    }
//    public void set(int index, T element)
//    {
//        data[index] = element;
//    }
//}









//class ObjectPair
//{
//    Object first;
//    Object second;
//
//    public ObjectPair(Object a, Object b)
//    {
//        first = a;
//        second = b;
//    }
//
//    public Object getFirst()
//    {
//        return first;
//    }
//
//    public Object getSecond()
//    {
//        return second;
//    }
//}

//class Pair<A, B>
//{
//    A first;
//    B second;
//
//    public Pair(A a, B b)
//    {
//        first = a;
//        second = b;
//    }
//
//    public A getFirst()
//    {
//        return first;
//    }
//
//    public B getSecond()
//    {
//        return second;
//    }
//}

//public class Main
//{
//    public static void main(String[] args)
//    {
//        bid = new Pair<String, Double>("ORCL", 32.07);

//        ObjectPair bid = new ObjectPair("ORCL", 32.07);
//        System.out.println(bid.getFirst() + " " + bid.getSecond());








//        int n = DEFAULT;
//        try
//        {
//            n = Integer.parseInt(args[0]);
//            if (n <= 0)
//            {
//                System.out.println("n must be positive. Using default.");
//                n = DEFAULT;
//            }
//        } catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("No argument specified for n. Using default");
//        } catch (NumberFormatException e)
//        {
//            System.out.println("Invalid integer argument. Uing default.");
//        }
//    }
//}