public class Gray_Code {
    public List<Integer> grayCode(int n) {
        List<Integer> result=new ArrayList<>();
        int size=(int)Math.pow(2,n);
        for(int i=0;i<size;i++){
            result.add(i^i/2);
        }
        return result;
    }
}
