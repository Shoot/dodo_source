package defpackage;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
/* renamed from: d95  reason: default package */
/* loaded from: classes3.dex */
public interface d95 {
    Cipher a(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException;

    CertificateFactory b(String str) throws NoSuchProviderException, CertificateException;

    SecretKeyFactory c(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    Signature createSignature(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    KeyFactory d(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    SecureRandom e(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    Mac f(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    AlgorithmParameters g(String str) throws NoSuchAlgorithmException, NoSuchProviderException;
}
