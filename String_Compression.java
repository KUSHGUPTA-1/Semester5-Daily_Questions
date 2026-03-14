class String_Compression {
    public int compress(char[] chars) {
        int n=chars.length;
        int si=0; //start index.
        int i=0; //Read pointer.
        while(i<n){
            int cnt=0; //count.
            char ch=chars[i]; //phela charracter utha liya.
            while(i<n && chars[i]==ch){ //compare kre kitne characters same hai.
                i++; //index badata gya.
                cnt++; //count increment kiya. 
            }
            chars[si++]=ch; //ch ko update kra agar different character mila.
            //Ab mai count ke liye check krunga.
            if(cnt>1){
                String s=String.valueOf(cnt); //Convert the count to string.
                for(char c:s.toCharArray()){
                    chars[si++]=c;
                }
            }
        }
        return si;
        //TC->O(n).
        //SC->O(1).
    }
}