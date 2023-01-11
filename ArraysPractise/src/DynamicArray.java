public class DynamicArray {
    private static final int DEFAULT_CAP=16;
    public int[] arr;
    public int len;
    public int capacity;

    DynamicArray(int capacity)
    {
        if(capacity<0)
        {
            throw new IllegalArgumentException("Illegal Capacity : "+capacity);
        }
        this.capacity=capacity;
        arr = new int[capacity];
    }
    public int size()
    {
        return len;
    }
    public boolean isEmpty()
    {
        return len==0;
    }
    public int get(int index)
    {
        return arr[index];
    }
    public void set(int index,int value)
    {
        arr[index]=value;
    }
    public void add(int value)
    {
        if(len+1>=capacity)
        {
            capacity=2*capacity;
            int new_arr[] = new int[capacity];
            for(int i=0;i<len;i++)
            {
                new_arr[i]=arr[i];
            }
            arr=new_arr;
        }
        arr[len++]=value;
    }
    public void removeAt(int indexValue)
    {
        if(indexValue<0 && indexValue<len)
        {
            throw new IllegalArgumentException("invalid index value");
        }
        int new_Arr[] = new int[len-1];
        int j=0;
        for(int i=0;i<len;i++)
        {
            if(i==indexValue)
            {
                j--;
            }
            else
            {
                new_Arr[j++]=arr[i];
            }
        }
        arr=new_Arr;
        capacity=len;
        len--;
    }
    public boolean remove(int value)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==value)
            {
                removeAt(i);
                return true;
            }
        }
        return false;
    }
    public String toString()
    {
        StringBuilder sb= new StringBuilder(len).append("[");
        for(int i=0;i<len;i++)
        {
            sb.append(arr[i]+",");
        }
        return sb.append("]").toString();
    }
    public static void main(String[] args) throws Exception {
        DynamicArray  DA= new DynamicArray(10);
        DA.add(23);
        DA.add(40);
        DA.add(10);
        DA.add(12);
        DA.add(13);
        DA.add(19);
        DA.add(20);
        DA.add(30);
        DA.add(100);
        DA.add(20);
        DA.add(200);
        DA.add(109);
        DA.set(0, 20);
        DA.remove(109);
        System.out.println(DA.toString());
        System.out.println(DA.get(1));
    }
}
