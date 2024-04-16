package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.x0;
/* loaded from: classes3.dex */
public class PKIXCertPath extends CertPath {
    static final List certPathEncodings;
    private List certificates;
    private final d95 helper;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        certPathEncodings = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PKIXCertPath(InputStream inputStream, String str) throws CertificateException {
        super("X.509");
        u40 u40Var = new u40();
        this.helper = u40Var;
        try {
            if (!str.equalsIgnoreCase("PkiPath")) {
                if (!str.equalsIgnoreCase("PKCS7") && !str.equalsIgnoreCase("PEM")) {
                    throw new CertificateException("unsupported encoding: " + str);
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.certificates = new ArrayList();
                java.security.cert.CertificateFactory b = u40Var.b("X.509");
                while (true) {
                    Certificate generateCertificate = b.generateCertificate(bufferedInputStream);
                    if (generateCertificate == null) {
                        break;
                    }
                    this.certificates.add(generateCertificate);
                }
            } else {
                n l = new h(inputStream).l();
                if (!(l instanceof p)) {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
                Enumeration G = ((p) l).G();
                this.certificates = new ArrayList();
                java.security.cert.CertificateFactory b2 = u40Var.b("X.509");
                while (G.hasMoreElements()) {
                    this.certificates.add(0, b2.generateCertificate(new ByteArrayInputStream(((h0) G.nextElement()).f().p("DER"))));
                }
            }
            this.certificates = sortCerts(this.certificates);
        } catch (IOException e) {
            throw new CertificateException("IOException throw while decoding CertPath:\n" + e.toString());
        } catch (NoSuchProviderException e2) {
            throw new CertificateException("BouncyCastle provider not found while trying to get a CertificateFactory:\n" + e2.toString());
        }
    }

    private List sortCerts(List list) {
        if (list.size() < 2) {
            return list;
        }
        X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
        for (int i = 1; i != list.size(); i++) {
            if (issuerX500Principal.equals(((X509Certificate) list.get(i)).getSubjectX500Principal())) {
                issuerX500Principal = ((X509Certificate) list.get(i)).getIssuerX500Principal();
            } else {
                ArrayList arrayList = new ArrayList(list.size());
                ArrayList arrayList2 = new ArrayList(list);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                    X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                    int i3 = 0;
                    while (true) {
                        if (i3 != list.size()) {
                            if (((X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                                break;
                            }
                            i3++;
                        } else {
                            arrayList.add(x509Certificate);
                            list.remove(i2);
                            break;
                        }
                    }
                }
                if (arrayList.size() > 1) {
                    return arrayList2;
                }
                for (int i4 = 0; i4 != arrayList.size(); i4++) {
                    X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i4)).getIssuerX500Principal();
                    int i5 = 0;
                    while (true) {
                        if (i5 < list.size()) {
                            X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                            if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                                arrayList.add(x509Certificate2);
                                list.remove(i5);
                                break;
                            }
                            i5++;
                        }
                    }
                }
                if (list.size() > 0) {
                    return arrayList2;
                }
                return arrayList;
            }
        }
        return list;
    }

    private n toASN1Object(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new h(x509Certificate.getEncoded()).l();
        } catch (Exception e) {
            throw new CertificateEncodingException("Exception while encoding certificate: " + e.toString());
        }
    }

    private byte[] toDEREncoded(h0 h0Var) throws CertificateEncodingException {
        try {
            return h0Var.f().p("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException("Exception thrown: " + e);
        }
    }

    @Override // java.security.cert.CertPath
    public List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.certificates));
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded() throws CertificateEncodingException {
        Iterator encodings = getEncodings();
        if (encodings.hasNext()) {
            Object next = encodings.next();
            if (next instanceof String) {
                return getEncoded((String) next);
            }
            return null;
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public Iterator getEncodings() {
        return certPathEncodings.iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PKIXCertPath(List list) {
        super("X.509");
        this.helper = new u40();
        this.certificates = sortCerts(new ArrayList(list));
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded(String str) throws CertificateEncodingException {
        if (str.equalsIgnoreCase("PkiPath")) {
            d dVar = new d();
            List list = this.certificates;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                dVar.a(toASN1Object((X509Certificate) listIterator.previous()));
            }
            return toDEREncoded(new w0(dVar));
        }
        int i = 0;
        if (str.equalsIgnoreCase("PKCS7")) {
            kt1 kt1Var = new kt1(co7.L0, null);
            d dVar2 = new d();
            while (i != this.certificates.size()) {
                dVar2.a(toASN1Object((X509Certificate) this.certificates.get(i)));
                i++;
            }
            return toDEREncoded(new kt1(co7.M0, new mka(new i(1L), new x0(), kt1Var, new x0(dVar2), null, new x0())));
        } else if (!str.equalsIgnoreCase("PEM")) {
            throw new CertificateEncodingException("unsupported encoding: " + str);
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            px7 px7Var = new px7(new OutputStreamWriter(byteArrayOutputStream));
            while (i != this.certificates.size()) {
                try {
                    px7Var.b(new lx7("CERTIFICATE", ((X509Certificate) this.certificates.get(i)).getEncoded()));
                    i++;
                } catch (Exception unused) {
                    throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                }
            }
            px7Var.close();
            return byteArrayOutputStream.toByteArray();
        }
    }
}
