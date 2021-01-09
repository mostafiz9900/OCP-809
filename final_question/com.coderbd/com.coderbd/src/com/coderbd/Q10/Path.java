
package com.coderbd.Q10;

import java.nio.file.Paths;

public class Path {
    public static void main(String[] args) {
        Path path1=(Path) Paths.get("/software/.././sys/reademe.txt");
        Path path2=path1.normalized();
        Path path3=path1.relativize(path2);
        System.out.println(path1.getNameCount());
        System.out.println(" : "+path2.getNameCount());
        System.out.println(" : "+path3.getNameCount());
        
    }

    private Path normalized() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Path relativize(Path path2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean getNameCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
