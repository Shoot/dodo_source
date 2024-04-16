package defpackage;

import androidx.annotation.NonNull;
import defpackage.po3;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: SafeKeyGenerator.java */
/* renamed from: ws9  reason: default package */
/* loaded from: classes.dex */
public class ws9 {
    private final i36<se5, String> a = new i36<>(1000);
    private final jf8<b> b = po3.d(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    /* renamed from: ws9$a */
    /* loaded from: classes.dex */
    class a implements po3.d<b> {
        a() {
        }

        @Override // defpackage.po3.d
        /* renamed from: b */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeKeyGenerator.java */
    /* renamed from: ws9$b */
    /* loaded from: classes.dex */
    public static final class b implements po3.f {
        final MessageDigest a;
        private final eva b = eva.a();

        b(MessageDigest messageDigest) {
            this.a = messageDigest;
        }

        @Override // defpackage.po3.f
        @NonNull
        public eva g() {
            return this.b;
        }
    }

    private String a(se5 se5Var) {
        b bVar = (b) eh8.d(this.b.b());
        try {
            se5Var.b(bVar.a);
            return vub.y(bVar.a.digest());
        } finally {
            this.b.a(bVar);
        }
    }

    public String b(se5 se5Var) {
        String g;
        synchronized (this.a) {
            g = this.a.g(se5Var);
        }
        if (g == null) {
            g = a(se5Var);
        }
        synchronized (this.a) {
            this.a.k(se5Var, g);
        }
        return g;
    }
}
