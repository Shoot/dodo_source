package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.hh;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
/* compiled from: AndroidKeysetManager.java */
/* renamed from: ch  reason: default package */
/* loaded from: classes2.dex */
public final class ch {
    private static final String d = "ch";
    private final vg5 a;
    private final l9 b;
    private tg5 c;

    /* compiled from: AndroidKeysetManager.java */
    /* renamed from: ch$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private ug5 a = null;
        private vg5 b = null;
        private String c = null;
        private l9 d = null;
        private boolean e = true;
        private uf5 f = null;
        private KeyStore g = null;
        private tg5 h;

        private tg5 e() throws GeneralSecurityException, IOException {
            l9 l9Var = this.d;
            if (l9Var != null) {
                try {
                    return tg5.j(rg5.j(this.a, l9Var));
                } catch (InvalidProtocolBufferException | GeneralSecurityException e) {
                    Log.w(ch.d, "cannot decrypt keyset: ", e);
                }
            }
            return tg5.j(y81.a(this.a));
        }

        private tg5 f() throws GeneralSecurityException, IOException {
            try {
                return e();
            } catch (FileNotFoundException e) {
                if (Log.isLoggable(ch.d, 4)) {
                    Log.i(ch.d, String.format("keyset not found, will generate a new one. %s", e.getMessage()));
                }
                if (this.f != null) {
                    tg5 a = tg5.i().a(this.f);
                    tg5 h = a.h(a.d().g().Q(0).Q());
                    if (this.d != null) {
                        h.d().l(this.b, this.d);
                    } else {
                        y81.b(h.d(), this.b);
                    }
                    return h;
                }
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }

        private l9 g() throws GeneralSecurityException {
            hh hhVar;
            if (!ch.a()) {
                Log.w(ch.d, "Android Keystore requires at least Android M");
                return null;
            }
            if (this.g != null) {
                hhVar = new hh.b().b(this.g).a();
            } else {
                hhVar = new hh();
            }
            boolean e = hhVar.e(this.c);
            if (!e) {
                try {
                    hh.d(this.c);
                } catch (GeneralSecurityException | ProviderException e2) {
                    Log.w(ch.d, "cannot use Android Keystore, it'll be disabled", e2);
                    return null;
                }
            }
            try {
                return hhVar.b(this.c);
            } catch (GeneralSecurityException | ProviderException e3) {
                if (!e) {
                    Log.w(ch.d, "cannot use Android Keystore, it'll be disabled", e3);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.c), e3);
            }
        }

        public synchronized ch d() throws GeneralSecurityException, IOException {
            try {
                if (this.c != null) {
                    this.d = g();
                }
                this.h = f();
            } catch (Throwable th) {
                throw th;
            }
            return new ch(this);
        }

        public b h(uf5 uf5Var) {
            this.f = uf5Var;
            return this;
        }

        public b i(String str) {
            if (str.startsWith("android-keystore://")) {
                if (this.e) {
                    this.c = str;
                    return this;
                }
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }

        public b j(Context context, String str, String str2) throws IOException {
            if (context != null) {
                if (str != null) {
                    this.a = new wha(context, str, str2);
                    this.b = new xha(context, str, str2);
                    return this;
                }
                throw new IllegalArgumentException("need a keyset name");
            }
            throw new IllegalArgumentException("need an Android context");
        }
    }

    static /* synthetic */ boolean a() {
        return d();
    }

    private static boolean d() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public synchronized rg5 c() throws GeneralSecurityException {
        return this.c.d();
    }

    private ch(b bVar) throws GeneralSecurityException, IOException {
        this.a = bVar.b;
        this.b = bVar.d;
        this.c = bVar.h;
    }
}
