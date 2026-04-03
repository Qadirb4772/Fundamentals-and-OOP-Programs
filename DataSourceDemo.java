class DataSourceDemo{
    public static void main(String [] args){
        FileSource file = new FileSource();//creating FileSource
        System.out.println(file.readLine()); //reading from the file Source
        
        KeyboardSource source = new KeyboardSource();//creating a keyboard source
        System.out.println("Your Entered String is = "+source.readLine());//reading from the keyboard source
    }
}
