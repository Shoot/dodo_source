package defpackage;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.appsflyer.f;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
/* compiled from: AndroidKeystoreKmsClient.java */
/* renamed from: hh  reason: default package */
/* loaded from: classes2.dex */
public final class hh implements ch5 {
    private static final String c = "hh";
    private final String a;
    private KeyStore b;

    /* compiled from: AndroidKeystoreKmsClient.java */
    /* renamed from: hh$b */
    /* loaded from: classes2.dex */
    public static final class b {
        String a = null;
        KeyStore b;

        public b() {
            this.b = null;
            if (hh.c()) {
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    this.b = keyStore;
                    keyStore.load(null);
                    return;
                } catch (IOException | GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            }
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }

        public hh a() {
            return new hh(this);
        }

        public b b(KeyStore keyStore) {
            if (keyStore != null) {
                this.b = keyStore;
                return this;
            }
            throw new IllegalArgumentException("val cannot be null");
        }
    }

    static /* synthetic */ boolean c() {
        return f();
    }

    public static void d(String str) throws GeneralSecurityException {
        KeyGenParameterSpec.Builder keySize;
        KeyGenParameterSpec.Builder blockModes;
        KeyGenParameterSpec.Builder encryptionPaddings;
        KeyGenParameterSpec build;
        if (!new hh().e(str)) {
            String b2 = zvb.b("android-keystore://", str);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keySize = f.a(b2, 3).setKeySize(256);
            blockModes = keySize.setBlockModes("GCM");
            encryptionPaddings = blockModes.setEncryptionPaddings("NoPadding");
            build = encryptionPaddings.build();
            keyGenerator.init(build);
            keyGenerator.generateKey();
            return;
        }
        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
    }

    private static boolean f() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    private static l9 g(l9 l9Var) throws GeneralSecurityException {
        byte[] c2 = a49.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(c2, l9Var.a(l9Var.b(c2, bArr), bArr))) {
            return l9Var;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r3.toLowerCase(java.util.Locale.US).startsWith("android-keystore://") != false) goto L14;
     */
    @Override // defpackage.ch5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.a     // Catch: java.lang.Throwable -> Le
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            monitor-exit(r2)
            return r1
        Le:
            r3 = move-exception
            goto L26
        L10:
            java.lang.String r0 = r2.a     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L23
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            monitor-exit(r2)
            return r1
        L26:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh.a(java.lang.String):boolean");
    }

    @Override // defpackage.ch5
    public synchronized l9 b(String str) throws GeneralSecurityException {
        try {
            String str2 = this.a;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.a, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return g(new dh(zvb.b("android-keystore://", str), this.b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean e(String str) throws GeneralSecurityException {
        String str2;
        try {
        } catch (NullPointerException unused) {
            Log.w(c, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.b = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.b.containsAlias(str2);
        }
        return this.b.containsAlias(zvb.b("android-keystore://", str));
    }

    public hh() throws GeneralSecurityException {
        this(new b());
    }

    private hh(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
    }
}
