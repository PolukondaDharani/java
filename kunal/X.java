package kunal;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        type(n);
    }
    static void type(int num){
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
    
}
