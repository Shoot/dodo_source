package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.common.RealmModuleWithMigration;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.mk2;
import io.realm.d0;
import io.realm.j0;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: DatabaseModule.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0007¨\u0006\r"}, d2 = {"Lmm2;", "", "Ljk2;", "b", "", DateTokenConverter.CONVERTER_KEY, "Ldm2;", "Lzl2;", c.a, "a", e.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: mm2  reason: default package */
/* loaded from: classes3.dex */
public final class mm2 {
    public static final mm2 a = new mm2();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DatabaseModule.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lmm2$a;", "", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "databaseName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mm2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final a b = new a("CACHE", 0, "cache.realm");
        public static final a c = new a("DEFAULT", 1, "default.realm");
        public static final a d = new a("WITH_MIGRATION", 2, "withMigration.realm");
        private static final /* synthetic */ a[] e;
        private static final /* synthetic */ kj3 f;
        private final String a;

        static {
            a[] a = a();
            e = a;
            f = lj3.a(a);
        }

        private a(String str, int i, String str2) {
            this.a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{b, c, d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }

        public final String i() {
            return this.a;
        }
    }

    private mm2() {
    }

    private final dm2<? extends zl2> a() {
        j0 b = new j0.a().h("cache.realm").e().b();
        z65.e(b);
        return new em2(new g89(b, new h89(b)), new ydb());
    }

    private final jk2 b() {
        Map k;
        Map k2;
        Map k3;
        Map k4;
        d();
        dm2<? extends zl2> c = c();
        dm2<? extends zl2> a2 = a();
        mk2.b bVar = mk2.b.a;
        mk2.a aVar = mk2.a.a;
        k = g86.k(lnb.a(bVar, c), lnb.a(aVar, a2));
        a aVar2 = a.b;
        a aVar3 = a.c;
        k2 = g86.k(lnb.a(aVar2, a2), lnb.a(aVar3, c));
        ik2 ik2Var = new ik2(k, k2);
        jkb jkbVar = new jkb(c);
        jkb jkbVar2 = new jkb(a2);
        k3 = g86.k(lnb.a(bVar, jkbVar), lnb.a(aVar, jkbVar2));
        k4 = g86.k(lnb.a(aVar2, jkbVar2), lnb.a(aVar3, jkbVar));
        return new kk2(ik2Var, new lkb(k3, k4), vpb.a, j89.a);
    }

    private final dm2<? extends zl2> c() {
        j0 r0 = d0.r0();
        z65.e(r0);
        return new em2(new g89(r0, null, 2, null), new ydb());
    }

    private final void d() {
        d0.l(new j0.a().g(new RealmModuleWithMigration(), new Object[0]).h(a.d.i()).i(2L).d().b());
    }

    public final jk2 e() {
        return b();
    }
}
