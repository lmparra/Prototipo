/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.logica;

import edu.logica.CommandExecutor;
import edu.logica.KeyStoreTools;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/**
 *
 * @author lmparra
 */
public class Prototipo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws Exception {
    // TODO code application logic here
      CertificateFactory certFactory = CertificateFactory.getInstance("X.509");

        FileInputStream fis = new FileInputStream("google.cer");

        Certificate cert = certFactory.generateCertificate(fis);
        fis.close();
        
//        System.out.println(cert);
        
        KeyTools keyTools = new KeyTools();
        KeyPair pair = keyTools.generateKeyPair();
        
        KeyStoreTools kstPrueba = new KeyStoreTools("ksPrueba", "password");
//        kstPrueba.addKey("keys", pair.getPrivate(), "password");
//        Certificate cerGoogle = kstPrueba.getCertificate("google");
        
//        System.out.println(cerGoogle);
  }
}
