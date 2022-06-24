package hiding;
public class WorkerTest {
    public static void main(String[] args) {
        Worker workerJang = new Worker();
        //workerJang.companyID 접근 불가.
        workerJang.setCompanyID(1004);
        workerJang.setName("장그래");

        System.out.println(workerJang.getCompanyID());
        System.out.println(workerJang.getName());
    }
}