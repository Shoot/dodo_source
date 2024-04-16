package defpackage;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
/* renamed from: nq2  reason: default package */
/* loaded from: classes3.dex */
public class nq2 implements d95 {
    @Override // defpackage.d95
    public Cipher a(String str) throws NoSuchAlgorithmException, NoSuchPaddingException {
        return Cipher.getInstance(str);
    }

    @Override // defpackage.d95
    public CertificateFactory b(String str) throws CertificateException {
        return CertificateFactory.getInstance(str);
    }

    @Override // defpackage.d95
    public SecretKeyFactory c(String str) throws NoSuchAlgorithmException {
        return SecretKeyFactory.getInstance(str);
    }

    @Override // defpackage.d95
    public Signature createSignature(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str);
    }

    @Override // defpackage.d95
    public KeyFactory d(String str) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(str);
    }

    @Override // defpackage.d95
    public SecureRandom e(String str) throws NoSuchAlgorithmException {
        return SecureRandom.getInstance(str);
    }

    @Override // defpackage.d95
    public Mac f(String str) throws NoSuchAlgorithmException {
        return Mac.getInstance(str);
    }

    @Override // defpackage.d95
    public AlgorithmParameters g(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(str);
    }
}
