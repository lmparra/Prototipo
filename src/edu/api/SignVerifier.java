package edu.api;

import java.io.File;

/**
 *
 * This interface represents an abstraction of needed functionalities to verify 
 * a file signed.
 * 
 * @author David Camilo Nova
 * @author Luis Fernando Muñoz
 */
public interface SignVerifier {
    /**
     *
     * Receive a file signed and then verify it with the public certificate and its 
     * external sign
     * 
     * @param file
     *        {@link File} <code>File</code> to verify
     * @param publicCert
     *        {@link File} <code>File</code> Public certificate
     * @param externalSign
     *        {@link File} External signature of <code>File</code> signed
     * @return {@link boolean}
     *         Returns true if the signature has validity or false in another way
     */
    public boolean verify(File file, File publicCert, File externalSign);
    /**
     *
     * Receive a file signed and then verify it. The file should contain the signature
     * and the certificate
     * 
     * @param file
     *        {@link File} <code>File</code> to verify
     * @return {@link boolean}
     *         Returns true if the signature has validity or false in another way
     */
    public boolean verify(File file);
}
