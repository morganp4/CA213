class Exercise6 {
    public static void main(String[] args) {
        String[] lines = new String[999];
        if(args.length > 0) {
            int count=0;
            while(!Console.endOfFile() && count<lines.length) {
                String line = Console.readString();
                if(line.indexOf(args[0]) > 0) {    
                    lines[count] = line;
                    count++;
                }
            }
            for(int i=0; i<count; i++) {
                System.out.println(lines[i]);
            }
        } else {
            System.out.println("Syntax Error!");
            System.out.println("java Exercise6 Pattern");
        }
    }
}