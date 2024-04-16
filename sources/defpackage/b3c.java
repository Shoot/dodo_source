package defpackage;

import android.accounts.Account;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.a;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: b3c  reason: default package */
/* loaded from: classes2.dex */
public final class b3c {
    @RecentlyNonNull
    public static final com.google.android.gms.common.api.a<a> a;
    private static final a.g<smc> b;
    private static final a.AbstractC0215a<smc, a> c;
    @RecentlyNonNull
    public static final c3c d;
    @Deprecated
    public static final gbd e;
    public static final xmc f;

    /* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
    /* renamed from: b3c$a */
    /* loaded from: classes2.dex */
    public static final class a implements a.d.InterfaceC0216a {
        public final int a;
        public final int b;
        @RecentlyNonNull
        public final Account c;
        final boolean d;

        /* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
        /* renamed from: b3c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0064a {
            private int a = 3;
            private int b = 1;
            private boolean c = true;

            @RecentlyNonNull
            public a a() {
                return new a(this, null);
            }

            @RecentlyNonNull
            public C0064a b(int i) {
                if (i != 0) {
                    if (i != 0) {
                        if (i != 2 && i != 1 && i != 23 && i != 3) {
                            throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", Integer.valueOf(i)));
                        }
                    } else {
                        i = 0;
                    }
                }
                this.a = i;
                return this;
            }

            @RecentlyNonNull
            public C0064a c(int i) {
                if (i != 0 && i != 1 && i != 2 && i != 3) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", Integer.valueOf(i)));
                }
                this.b = i;
                return this;
            }
        }

        private a(C0064a c0064a) {
            this.a = c0064a.a;
            this.b = c0064a.b;
            this.d = c0064a.c;
            this.c = null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (m57.a(Integer.valueOf(this.a), Integer.valueOf(aVar.a)) && m57.a(Integer.valueOf(this.b), Integer.valueOf(aVar.b)) && m57.a(null, null) && m57.a(Boolean.valueOf(this.d), Boolean.valueOf(aVar.d))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.gms.common.api.a.d.InterfaceC0216a
        @RecentlyNonNull
        public Account g() {
            return null;
        }

        public int hashCode() {
            return m57.b(Integer.valueOf(this.a), Integer.valueOf(this.b), null, Boolean.valueOf(this.d));
        }

        private a() {
            this(new C0064a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ a(coc cocVar) {
            this(new C0064a());
        }

        /* synthetic */ a(C0064a c0064a, coc cocVar) {
            this(c0064a);
        }
    }

    static {
        a.g<smc> gVar = new a.g<>();
        b = gVar;
        coc cocVar = new coc();
        c = cocVar;
        a = new com.google.android.gms.common.api.a<>("Wallet.API", cocVar, gVar);
        e = new gbd();
        d = new knc();
        f = new xmc();
    }

    @RecentlyNonNull
    public static ex7 a(@RecentlyNonNull Context context, @RecentlyNonNull a aVar) {
        return new ex7(context, aVar);
    }
}
