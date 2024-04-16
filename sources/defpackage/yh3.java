package defpackage;

import defpackage.zh3;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
/* compiled from: EngineFactory.java */
/* renamed from: yh3  reason: default package */
/* loaded from: classes2.dex */
public final class yh3<T_WRAPPER extends zh3<T_ENGINE>, T_ENGINE> {
    private static final Logger b = Logger.getLogger(yh3.class.getName());
    private static final List<Provider> c;
    private static final boolean d;
    public static final yh3<zh3.a, Cipher> e;
    public static final yh3<zh3.e, Mac> f;
    public static final yh3<zh3.g, Signature> g;
    public static final yh3<zh3.f, MessageDigest> h;
    public static final yh3<zh3.b, KeyAgreement> i;
    public static final yh3<zh3.d, KeyPairGenerator> j;
    public static final yh3<zh3.c, KeyFactory> k;
    private final T_WRAPPER a;

    static {
        if (fhb.c()) {
            c = b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            d = false;
        } else if (p1b.b()) {
            c = b("GmsCore_OpenSSL", "AndroidOpenSSL");
            d = true;
        } else {
            c = new ArrayList();
            d = true;
        }
        e = new yh3<>(new zh3.a());
        f = new yh3<>(new zh3.e());
        g = new yh3<>(new zh3.g());
        h = new yh3<>(new zh3.f());
        i = new yh3<>(new zh3.b());
        j = new yh3<>(new zh3.d());
        k = new yh3<>(new zh3.c());
    }

    public yh3(T_WRAPPER t_wrapper) {
        this.a = t_wrapper;
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                b.info(String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public T_ENGINE a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider provider : c) {
            try {
                return (T_ENGINE) this.a.a(str, provider);
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (d) {
            return (T_ENGINE) this.a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
