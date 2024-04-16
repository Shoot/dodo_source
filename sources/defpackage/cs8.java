package defpackage;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
/* renamed from: cs8  reason: default package */
/* loaded from: classes3.dex */
public class cs8 implements d95 {
    protected final Provider a;

    public cs8(Provider provider) {
        this.a = provider;
    }

    @Override // defpackage.d95
    public Cipher a(String str) throws NoSuchAlgorithmException, NoSuchPaddingException {
        return Cipher.getInstance(str, this.a);
    }

    @Override // defpackage.d95
    public CertificateFactory b(String str) throws CertificateException {
        return CertificateFactory.getInstance(str, this.a);
    }

    @Override // defpackage.d95
    public SecretKeyFactory c(String str) throws NoSuchAlgorithmException {
        return SecretKeyFactory.getInstance(str, this.a);
    }

    @Override // defpackage.d95
    public Signature createSignature(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str, this.a);
    }

    @Override // defpackage.d95
    public KeyFactory d(String str) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(str, this.a);
    }

    @Override // defpackage.d95
    public SecureRandom e(String str) throws NoSuchAlgorithmException {
        return SecureRandom.getInstance(str, this.a);
    }

    @Override // defpackage.d95
    public Mac f(String str) throws NoSuchAlgorithmException {
        return Mac.getInstance(str, this.a);
    }

    @Override // defpackage.d95
    public AlgorithmParameters g(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(str, this.a);
    }
}
