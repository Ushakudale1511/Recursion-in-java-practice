class example1{
    static void p(){//recrsion function is called itself
        System.out.println("hello");
        p();
    }
    public static void main ( String []args){
        p();

    }
}