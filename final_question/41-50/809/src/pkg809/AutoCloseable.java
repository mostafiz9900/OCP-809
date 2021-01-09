package pkg809;

/**
 * Qustion 49
 * @Ansewe: ?
 */
class DataConverter implements AutoCloseable {
    public void copyFlatFilesToTables(){}
    public void close() throws Excption {
        throw new RuntimeException();   // line n1
    }
}


public static void main(String[] args) throws Exception{
    try {DataConvater dc = new DataConverter()) // line n2
{dc.copyFlatFilesToTables();}
}
}