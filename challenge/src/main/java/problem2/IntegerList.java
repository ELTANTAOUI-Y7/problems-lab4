package problem2;

public class IntegerList
{
    int[] list;
    int currentSize; //the current size of the list
    int count; //the current number of integers in the list

    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        currentSize=size;
        count=size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    public void increaseSize(){
        currentSize*=2;
        int[] newList = new int[currentSize];
        System.arraycopy(list,0,newList,0,list.length);
        list=newList;


    }
    public void addElement(int newVal){
        if (count<currentSize){
            list[count]=newVal;
            count++;
        }
        else{
            increaseSize();
            addElement(newVal);
        }
    }
    public void removeFirst(int newVal){
        int id=-1;
        for(int i=0; i<list.length; i++){
            if(list[i]==newVal){
                id=i;
                break; // break the loop
            }
        }
        if (id!=-1){
            count--;
            for(int i=id; i<count; i++){
                list[i]=list[i+1];
            }
        }

    }
    public void removeALL(int newVal){
        int id=-1;
        for(int i=0; i<list.length; i++){
            if(list[i]==newVal){
                id=i;
                if (id!=-1){
                    count--;
                    for(int j=id; j<count; j++){
                        list[j]=list[j+1];
                    }
                }
            }
        }
    }
}