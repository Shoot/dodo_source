package org.bouncycastle.jcajce.provider.keystore.bc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes3.dex */
public class BcKeyStoreSpi extends KeyStoreSpi {
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    private static final String KEY_CIPHER = "PBEWithSHAAnd3-KeyTripleDES-CBC";
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    private static final int KEY_SALT_SIZE = 20;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 1024;
    static final int NULL = 0;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final String STORE_CIPHER = "PBEWithSHAAndTwofish-CBC";
    private static final int STORE_SALT_SIZE = 20;
    private static final int STORE_VERSION = 2;
    protected int version;
    protected Hashtable table = new Hashtable();
    protected SecureRandom random = b32.b();
    private final d95 helper = new u40();

    /* loaded from: classes3.dex */
    private static class BCKeyStoreException extends KeyStoreException {
        private final Exception cause;

        public BCKeyStoreException(String str, Exception exc) {
            super(str);
            this.cause = exc;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* loaded from: classes3.dex */
    public static class BouncyCastleStore extends BcKeyStoreSpi {
        public BouncyCastleStore() {
            super(1);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi, java.security.KeyStoreSpi
        public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
            String str;
            this.table.clear();
            if (inputStream == null) {
                return;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            int readInt = dataInputStream.readInt();
            if (readInt != 2 && readInt != 0 && readInt != 1) {
                throw new IOException("Wrong version of key store.");
            }
            int readInt2 = dataInputStream.readInt();
            byte[] bArr = new byte[readInt2];
            if (readInt2 == 20) {
                dataInputStream.readFully(bArr);
                int readInt3 = dataInputStream.readInt();
                if (readInt3 >= 0 && readInt3 <= 65536) {
                    if (readInt == 0) {
                        str = "OldPBEWithSHAAndTwofish-CBC";
                    } else {
                        str = BcKeyStoreSpi.STORE_CIPHER;
                    }
                    s71 s71Var = new s71(dataInputStream, makePBECipher(str, 2, cArr, bArr, readInt3));
                    bq9 bq9Var = new bq9();
                    loadStore(new h23(s71Var, bq9Var));
                    byte[] bArr2 = new byte[bq9Var.getDigestSize()];
                    bq9Var.doFinal(bArr2, 0);
                    byte[] bArr3 = new byte[bq9Var.getDigestSize()];
                    aza.c(s71Var, bArr3);
                    if (tr.u(bArr2, bArr3)) {
                        return;
                    }
                    this.table.clear();
                    throw new IOException("KeyStore integrity check failed.");
                }
                throw new IOException("Key store corrupted.");
            }
            throw new IOException("Key store corrupted.");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi, java.security.KeyStoreSpi
        public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            byte[] bArr = new byte[20];
            int nextInt = (this.random.nextInt() & 1023) + BcKeyStoreSpi.MIN_ITERATIONS;
            this.random.nextBytes(bArr);
            dataOutputStream.writeInt(this.version);
            dataOutputStream.writeInt(20);
            dataOutputStream.write(bArr);
            dataOutputStream.writeInt(nextInt);
            u71 u71Var = new u71(dataOutputStream, makePBECipher(BcKeyStoreSpi.STORE_CIPHER, 1, cArr, bArr, nextInt));
            i23 i23Var = new i23(new bq9());
            saveStore(new h8b(u71Var, i23Var));
            u71Var.write(i23Var.a());
            u71Var.close();
        }
    }

    /* loaded from: classes3.dex */
    public static class Std extends BcKeyStoreSpi {
        public Std() {
            super(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class StoreEntry {
        String alias;
        Certificate[] certChain;
        Date date;
        Object obj;
        int type;

        StoreEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws Exception {
            this.date = new Date();
            this.type = 4;
            this.alias = str;
            this.certChain = certificateArr;
            byte[] bArr = new byte[20];
            BcKeyStoreSpi.this.random.nextBytes(bArr);
            int nextInt = (BcKeyStoreSpi.this.random.nextInt() & 1023) + BcKeyStoreSpi.MIN_ITERATIONS;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(20);
            dataOutputStream.write(bArr);
            dataOutputStream.writeInt(nextInt);
            DataOutputStream dataOutputStream2 = new DataOutputStream(new u71(dataOutputStream, BcKeyStoreSpi.this.makePBECipher(BcKeyStoreSpi.KEY_CIPHER, 1, cArr, bArr, nextInt)));
            BcKeyStoreSpi.this.encodeKey(key, dataOutputStream2);
            dataOutputStream2.close();
            this.obj = byteArrayOutputStream.toByteArray();
        }

        String getAlias() {
            return this.alias;
        }

        Certificate[] getCertificateChain() {
            return this.certChain;
        }

        Date getDate() {
            return this.date;
        }

        Object getObject() {
            return this.obj;
        }

        int getType() {
            return this.type;
        }

        StoreEntry(String str, Certificate certificate) {
            this.date = new Date();
            this.type = 1;
            this.alias = str;
            this.obj = certificate;
            this.certChain = null;
        }

        Object getObject(char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            Key decodeKey;
            if (cArr == null || cArr.length == 0) {
                Object obj = this.obj;
                if (obj instanceof Key) {
                    return obj;
                }
            }
            if (this.type == 4) {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) this.obj));
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    dataInputStream.readFully(bArr);
                    try {
                        return BcKeyStoreSpi.this.decodeKey(new DataInputStream(new s71(dataInputStream, BcKeyStoreSpi.this.makePBECipher(BcKeyStoreSpi.KEY_CIPHER, 2, cArr, bArr, dataInputStream.readInt()))));
                    } catch (Exception unused) {
                        DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) this.obj));
                        byte[] bArr2 = new byte[dataInputStream2.readInt()];
                        dataInputStream2.readFully(bArr2);
                        int readInt = dataInputStream2.readInt();
                        try {
                            decodeKey = BcKeyStoreSpi.this.decodeKey(new DataInputStream(new s71(dataInputStream2, BcKeyStoreSpi.this.makePBECipher("BrokenPBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr2, readInt))));
                        } catch (Exception unused2) {
                            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) this.obj));
                            bArr2 = new byte[dataInputStream3.readInt()];
                            dataInputStream3.readFully(bArr2);
                            readInt = dataInputStream3.readInt();
                            decodeKey = BcKeyStoreSpi.this.decodeKey(new DataInputStream(new s71(dataInputStream3, BcKeyStoreSpi.this.makePBECipher("OldPBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr2, readInt))));
                        }
                        byte[] bArr3 = bArr2;
                        int i = readInt;
                        if (decodeKey != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                            dataOutputStream.writeInt(bArr3.length);
                            dataOutputStream.write(bArr3);
                            dataOutputStream.writeInt(i);
                            DataOutputStream dataOutputStream2 = new DataOutputStream(new u71(dataOutputStream, BcKeyStoreSpi.this.makePBECipher(BcKeyStoreSpi.KEY_CIPHER, 1, cArr, bArr3, i)));
                            BcKeyStoreSpi.this.encodeKey(decodeKey, dataOutputStream2);
                            dataOutputStream2.close();
                            this.obj = byteArrayOutputStream.toByteArray();
                            return decodeKey;
                        }
                        throw new UnrecoverableKeyException("no match");
                    }
                } catch (Exception unused3) {
                    throw new UnrecoverableKeyException("no match");
                }
            }
            throw new RuntimeException("forget something!");
        }

        StoreEntry(String str, Date date, int i, Object obj) {
            new Date();
            this.alias = str;
            this.date = date;
            this.type = i;
            this.obj = obj;
        }

        StoreEntry(String str, Date date, int i, Object obj, Certificate[] certificateArr) {
            new Date();
            this.alias = str;
            this.date = date;
            this.type = i;
            this.obj = obj;
            this.certChain = certificateArr;
        }

        StoreEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            this.date = new Date();
            this.type = 3;
            this.alias = str;
            this.obj = bArr;
            this.certChain = certificateArr;
        }
    }

    /* loaded from: classes3.dex */
    public static class Version1 extends BcKeyStoreSpi {
        public Version1() {
            super(1);
            if (pq8.c("org.bouncycastle.bks.enable_v1")) {
                return;
            }
            throw new IllegalStateException("BKS-V1 not enabled");
        }
    }

    public BcKeyStoreSpi(int i) {
        this.version = i;
    }

    private Certificate decodeCertificate(DataInputStream dataInputStream) throws IOException {
        String readUTF = dataInputStream.readUTF();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        try {
            return this.helper.b(readUTF).generateCertificate(new ByteArrayInputStream(bArr));
        } catch (NoSuchProviderException e) {
            throw new IOException(e.toString());
        } catch (CertificateException e2) {
            throw new IOException(e2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Key decodeKey(DataInputStream dataInputStream) throws IOException {
        KeySpec pKCS8EncodedKeySpec;
        int read = dataInputStream.read();
        String readUTF = dataInputStream.readUTF();
        String readUTF2 = dataInputStream.readUTF();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        if (!readUTF.equals("PKCS#8") && !readUTF.equals("PKCS8")) {
            if (!readUTF.equals("X.509") && !readUTF.equals("X509")) {
                if (readUTF.equals("RAW")) {
                    return new SecretKeySpec(bArr, readUTF2);
                }
                throw new IOException("Key format " + readUTF + " not recognised!");
            }
            pKCS8EncodedKeySpec = new X509EncodedKeySpec(bArr);
        } else {
            pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArr);
        }
        try {
            if (read != 0) {
                if (read != 1) {
                    if (read == 2) {
                        return this.helper.c(readUTF2).generateSecret(pKCS8EncodedKeySpec);
                    }
                    throw new IOException("Key type " + read + " not recognised!");
                }
                return ff0.e(b1b.u(bArr));
            }
            return ff0.d(dk8.u(bArr));
        } catch (Exception e) {
            throw new IOException("Exception creating key: " + e.toString());
        }
    }

    private void encodeCertificate(Certificate certificate, DataOutputStream dataOutputStream) throws IOException {
        try {
            byte[] encoded = certificate.getEncoded();
            dataOutputStream.writeUTF(certificate.getType());
            dataOutputStream.writeInt(encoded.length);
            dataOutputStream.write(encoded);
        } catch (CertificateEncodingException e) {
            throw new IOException(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void encodeKey(Key key, DataOutputStream dataOutputStream) throws IOException {
        int i;
        byte[] encoded = key.getEncoded();
        if (key instanceof PrivateKey) {
            i = 0;
        } else if (key instanceof PublicKey) {
            i = 1;
        } else {
            i = 2;
        }
        dataOutputStream.write(i);
        dataOutputStream.writeUTF(key.getFormat());
        dataOutputStream.writeUTF(key.getAlgorithm());
        dataOutputStream.writeInt(encoded.length);
        dataOutputStream.write(encoded);
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        return this.table.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        if (this.table.get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        if (this.table.get(str) == null) {
            return;
        }
        this.table.remove(str);
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        StoreEntry storeEntry = (StoreEntry) this.table.get(str);
        if (storeEntry != null) {
            if (storeEntry.getType() == 1) {
                return (Certificate) storeEntry.getObject();
            }
            Certificate[] certificateChain = storeEntry.getCertificateChain();
            if (certificateChain != null) {
                return certificateChain[0];
            }
            return null;
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration elements = this.table.elements();
        while (elements.hasMoreElements()) {
            StoreEntry storeEntry = (StoreEntry) elements.nextElement();
            if (storeEntry.getObject() instanceof Certificate) {
                if (((Certificate) storeEntry.getObject()).equals(certificate)) {
                    return storeEntry.getAlias();
                }
            } else {
                Certificate[] certificateChain = storeEntry.getCertificateChain();
                if (certificateChain != null && certificateChain[0].equals(certificate)) {
                    return storeEntry.getAlias();
                }
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        StoreEntry storeEntry = (StoreEntry) this.table.get(str);
        if (storeEntry != null) {
            return storeEntry.getCertificateChain();
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        StoreEntry storeEntry = (StoreEntry) this.table.get(str);
        if (storeEntry != null) {
            return storeEntry.getDate();
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        StoreEntry storeEntry = (StoreEntry) this.table.get(str);
        if (storeEntry != null && storeEntry.getType() != 1) {
            return (Key) storeEntry.getObject(cArr);
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        StoreEntry storeEntry = (StoreEntry) this.table.get(str);
        if (storeEntry != null && storeEntry.getType() == 1) {
            return true;
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        StoreEntry storeEntry = (StoreEntry) this.table.get(str);
        if (storeEntry != null && storeEntry.getType() != 1) {
            return true;
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
        int macSize;
        this.table.clear();
        if (inputStream == null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        int readInt = dataInputStream.readInt();
        if (readInt != 2 && readInt != 0 && readInt != 1) {
            throw new IOException("Wrong version of key store.");
        }
        int readInt2 = dataInputStream.readInt();
        if (readInt2 > 0) {
            byte[] bArr = new byte[readInt2];
            dataInputStream.readFully(bArr);
            int readInt3 = dataInputStream.readInt();
            qj4 qj4Var = new qj4(new bq9());
            if (cArr != null && cArr.length != 0) {
                byte[] a = ym7.a(cArr);
                vn7 vn7Var = new vn7(new bq9());
                vn7Var.g(a, bArr, readInt3);
                if (readInt != 2) {
                    macSize = qj4Var.getMacSize();
                } else {
                    macSize = qj4Var.getMacSize() * 8;
                }
                v71 d = vn7Var.d(macSize);
                tr.y(a, (byte) 0);
                qj4Var.init(d);
                loadStore(new c46(dataInputStream, qj4Var));
                byte[] bArr2 = new byte[qj4Var.getMacSize()];
                qj4Var.doFinal(bArr2, 0);
                byte[] bArr3 = new byte[qj4Var.getMacSize()];
                dataInputStream.readFully(bArr3);
                if (!tr.u(bArr2, bArr3)) {
                    this.table.clear();
                    throw new IOException("KeyStore integrity check failed.");
                }
                return;
            }
            loadStore(dataInputStream);
            dataInputStream.readFully(new byte[qj4Var.getMacSize()]);
            return;
        }
        throw new IOException("Invalid salt detected");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        StoreEntry storeEntry = (StoreEntry) this.table.get(str);
        if (storeEntry != null && storeEntry.getType() != 1) {
            throw new KeyStoreException("key store already has a key entry with alias " + str);
        }
        this.table.put(str, new StoreEntry(str, certificate));
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        if ((key instanceof PrivateKey) && certificateArr == null) {
            throw new KeyStoreException("no certificate chain for private key");
        }
        try {
            this.table.put(str, new StoreEntry(str, key, cArr, certificateArr));
        } catch (Exception e) {
            throw new BCKeyStoreException(e.toString(), e);
        }
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.table.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        int macSize;
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        byte[] bArr = new byte[20];
        int nextInt = (this.random.nextInt() & 1023) + MIN_ITERATIONS;
        this.random.nextBytes(bArr);
        dataOutputStream.writeInt(this.version);
        dataOutputStream.writeInt(20);
        dataOutputStream.write(bArr);
        dataOutputStream.writeInt(nextInt);
        qj4 qj4Var = new qj4(new bq9());
        e46 e46Var = new e46(qj4Var);
        vn7 vn7Var = new vn7(new bq9());
        byte[] a = ym7.a(cArr);
        vn7Var.g(a, bArr, nextInt);
        if (this.version < 2) {
            macSize = qj4Var.getMacSize();
        } else {
            macSize = qj4Var.getMacSize() * 8;
        }
        qj4Var.init(vn7Var.d(macSize));
        for (int i = 0; i != a.length; i++) {
            a[i] = 0;
        }
        saveStore(new h8b(dataOutputStream, e46Var));
        byte[] bArr2 = new byte[qj4Var.getMacSize()];
        qj4Var.doFinal(bArr2, 0);
        dataOutputStream.write(bArr2);
        dataOutputStream.close();
    }

    protected void loadStore(InputStream inputStream) throws IOException {
        Certificate[] certificateArr;
        Hashtable hashtable;
        StoreEntry storeEntry;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        for (int read = dataInputStream.read(); read > 0; read = dataInputStream.read()) {
            String readUTF = dataInputStream.readUTF();
            Date date = new Date(dataInputStream.readLong());
            int readInt = dataInputStream.readInt();
            if (readInt != 0) {
                Certificate[] certificateArr2 = new Certificate[readInt];
                for (int i = 0; i != readInt; i++) {
                    certificateArr2[i] = decodeCertificate(dataInputStream);
                }
                certificateArr = certificateArr2;
            } else {
                certificateArr = null;
            }
            if (read != 1) {
                if (read != 2) {
                    if (read != 3 && read != 4) {
                        throw new IOException("Unknown object type in store.");
                    }
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    dataInputStream.readFully(bArr);
                    this.table.put(readUTF, new StoreEntry(readUTF, date, read, bArr, certificateArr));
                } else {
                    Key decodeKey = decodeKey(dataInputStream);
                    hashtable = this.table;
                    storeEntry = new StoreEntry(readUTF, date, 2, decodeKey, certificateArr);
                }
            } else {
                Certificate decodeCertificate = decodeCertificate(dataInputStream);
                hashtable = this.table;
                storeEntry = new StoreEntry(readUTF, date, 1, decodeCertificate);
            }
            hashtable.put(readUTF, storeEntry);
        }
    }

    protected Cipher makePBECipher(String str, int i, char[] cArr, byte[] bArr, int i2) throws IOException {
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
            SecretKeyFactory c = this.helper.c(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i2);
            Cipher a = this.helper.a(str);
            a.init(i, c.generateSecret(pBEKeySpec), pBEParameterSpec);
            return a;
        } catch (Exception e) {
            throw new IOException("Error initialising store of key store: " + e);
        }
    }

    protected void saveStore(OutputStream outputStream) throws IOException {
        Enumeration elements = this.table.elements();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        while (true) {
            if (elements.hasMoreElements()) {
                StoreEntry storeEntry = (StoreEntry) elements.nextElement();
                dataOutputStream.write(storeEntry.getType());
                dataOutputStream.writeUTF(storeEntry.getAlias());
                dataOutputStream.writeLong(storeEntry.getDate().getTime());
                Certificate[] certificateChain = storeEntry.getCertificateChain();
                if (certificateChain == null) {
                    dataOutputStream.writeInt(0);
                } else {
                    dataOutputStream.writeInt(certificateChain.length);
                    for (int i = 0; i != certificateChain.length; i++) {
                        encodeCertificate(certificateChain[i], dataOutputStream);
                    }
                }
                int type = storeEntry.getType();
                if (type != 1) {
                    if (type != 2) {
                        if (type != 3 && type != 4) {
                            throw new IOException("Unknown object type in store.");
                        }
                        byte[] bArr = (byte[]) storeEntry.getObject();
                        dataOutputStream.writeInt(bArr.length);
                        dataOutputStream.write(bArr);
                    } else {
                        encodeKey((Key) storeEntry.getObject(), dataOutputStream);
                    }
                } else {
                    encodeCertificate((Certificate) storeEntry.getObject(), dataOutputStream);
                }
            } else {
                dataOutputStream.write(0);
                return;
            }
        }
    }

    public void setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        this.table.put(str, new StoreEntry(str, bArr, certificateArr));
    }
}
