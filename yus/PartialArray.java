
public class PartialArray
{
    int[] values;
    public PartialArray(){
        this.values = new int[100];
        for (this.currentSize = 0;
            this.currentSize<20;
            this.currentSize++){
                this.values[this.CurrentSize] = 
                    this.currentSize*this.currentSize;
            }
    }
    public void remove(int pos){
        for (int i = pos +1;
            i<this.currentSize;
            i++)
            {
                this.value[i-1] = this.values[i];
                
            }
            this.currentSize--;
    }


}