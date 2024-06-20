package org.fastsped.efdIcmsIpi;

import org.fastsped.efdIcmsIpi.model.EfdIcmsIpi;

import java.io.File;

public interface GenerateEfd {

    byte[] generateEfd(EfdIcmsIpi efdIcmsIpi);
    String generateEfdString(EfdIcmsIpi efdIcmsIpi);
    File generateEfdToFile(EfdIcmsIpi efdIcmsIpi);
    void generateEfdFileInDirectory(EfdIcmsIpi efdIcmsIpi, String path);

}
