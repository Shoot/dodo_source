package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
/* compiled from: EngineWrapper.java */
/* renamed from: zh3  reason: default package */
/* loaded from: classes2.dex */
public interface zh3<T> {

    /* compiled from: EngineWrapper.java */
    /* renamed from: zh3$a */
    /* loaded from: classes2.dex */
    public static class a implements zh3<Cipher> {
        @Override // defpackage.zh3
        /* renamed from: b */
        public Cipher a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return Cipher.getInstance(str);
            }
            return Cipher.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper.java */
    /* renamed from: zh3$b */
    /* loaded from: classes2.dex */
    public static class b implements zh3<KeyAgreement> {
        @Override // defpackage.zh3
        /* renamed from: b */
        public KeyAgreement a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return KeyAgreement.getInstance(str);
            }
            return KeyAgreement.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper.java */
    /* renamed from: zh3$c */
    /* loaded from: classes2.dex */
    public static class c implements zh3<KeyFactory> {
        @Override // defpackage.zh3
        /* renamed from: b */
        public KeyFactory a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return KeyFactory.getInstance(str);
            }
            return KeyFactory.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper.java */
    /* renamed from: zh3$d */
    /* loaded from: classes2.dex */
    public static class d implements zh3<KeyPairGenerator> {
        @Override // defpackage.zh3
        /* renamed from: b */
        public KeyPairGenerator a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return KeyPairGenerator.getInstance(str);
            }
            return KeyPairGenerator.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper.java */
    /* renamed from: zh3$e */
    /* loaded from: classes2.dex */
    public static class e implements zh3<Mac> {
        @Override // defpackage.zh3
        /* renamed from: b */
        public Mac a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return Mac.getInstance(str);
            }
            return Mac.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper.java */
    /* renamed from: zh3$f */
    /* loaded from: classes2.dex */
    public static class f implements zh3<MessageDigest> {
        @Override // defpackage.zh3
        /* renamed from: b */
        public MessageDigest a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return MessageDigest.getInstance(str);
            }
            return MessageDigest.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper.java */
    /* renamed from: zh3$g */
    /* loaded from: classes2.dex */
    public static class g implements zh3<Signature> {
        @Override // defpackage.zh3
        /* renamed from: b */
        public Signature a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return Signature.getInstance(str);
            }
            return Signature.getInstance(str, provider);
        }
    }

    T a(String str, Provider provider) throws GeneralSecurityException;
}
