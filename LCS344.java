class LCS344 {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while(i<j){
            //swap
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;

        }
        
    }
	public static void main(String[] args){
		char[] s = "Hello World".toCharArray();
		LCS344 obj = new LCS344();
		obj.reverseString(s);
		System.out.println(s);
	}
	
}