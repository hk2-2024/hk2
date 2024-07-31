package collection.list;

public class BatchProcessor {
    private final MyList<Integer> list ;

    public BatchProcessor(MyList<Integer> myList) {
        list = myList;
    }
    //코드 변경
    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
//            E i2 = Integer.valueOf(i);
            list.add(0, i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("size : "+size+" "+ (endTime-startTime));
    }
}
