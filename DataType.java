package Ray.Queue;

import java.util.Queue;

public class DataType {
	static final int QUEUELEN = 15;
	Data []data =new Data[QUEUELEN];
	int head;
	int tail;
	
	//--------
	public  DataType init(){
		DataType q;
		//----申请内存
		if((q=new DataType())!=null){
			q.head = 0;
			q.tail = 0;
			return q;
		}else
			return null;
	}
	public int isEmpty(DataType d){
		int temp =0;
		if(d.head==d.tail){
			temp=1;
		}
		return temp;
	}
	public int isFull(DataType d){
		int temp =0;
		if(d.tail==QUEUELEN){
			temp =1;
		}
		return temp;
	}
	public void clear(DataType d){
		d.head = 0;
		d.tail =0;
	}
	public void free(DataType d){
		if(d!=null){
			d = null;
		}
	}
	public int enQueue(DataType d,Data data){
		if(d.tail==QUEUELEN){
			System.out.println("队列已满");
			return 0;
		}else{
			d.data[d.tail++] = data;
			return 1;
		}
		
	}
	
	public Data deQueue(DataType d) {
		if(d.head==d.tail){
			System.out.println("队列为空");
			System.exit(0);
		}else{
			return d.data[head++];
		}
		return null;
	}
	public Data peek(DataType d){
		if(isEmpty(d)==1){
			System.out.println("空队列");
			return null;
		}else
			return d.data[d.head];
	}
	public int len(DataType d){
		return d.tail-d.head;
	}
}
