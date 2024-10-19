package org.fastsped.interfaces;

import org.fastsped.model.EfdIcmsIpi;

import java.io.File;

public interface GenerateEfd {

    byte[] generateEfd(EfdIcmsIpi efdIcmsIpi);

    String generateEfdString(EfdIcmsIpi efdIcmsIpi);


    File generateEfdToFile(EfdIcmsIpi efdIcmsIpi,  String path);


    void generateEfdFileInDirectory(EfdIcmsIpi efdIcmsIpi, String path);

}
