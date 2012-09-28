class Exercise6 {
    public static void main(String[] args) {
        String[] lines = new String[999];
        if(args.length > 0) {
            int count=0;
            while(!Console.endOfFile() && count<lines.length) {
                lines[count] = Console.readString();
                count++;
            }
            for(int i=0; i<count; i++) {
                if(lines[i].indexOf(args[0]) > 0) System.out.println(lines[i]);
            }
        } else {
            System.out.println("Syntax Error!");
            System.out.println("java Exercise6 Pattern");
        }
    }
}