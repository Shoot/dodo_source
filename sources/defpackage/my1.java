package defpackage;

import defpackage.tmb;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
/* compiled from: CountryFilter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lmy1;", "Lly1;", "", "Lay1;", "countries", "a", "Lyhb;", "Lyhb;", "toggleService", "<init>", "(Lyhb;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: my1  reason: default package */
/* loaded from: classes4.dex */
public final class my1 implements ly1 {
    private final yhb a;

    /* compiled from: CountryFilter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lay1;", tmb.c.COUNTRY_JSON_NAME, "", "a", "(Lay1;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: my1$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<ay1, Boolean> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(ay1 ay1Var) {
            boolean z;
            z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
            if (ay1Var.m() == yy1.e) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: CountryFilter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lay1;", tmb.c.COUNTRY_JSON_NAME, "", "a", "(Lay1;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: my1$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<ay1, Boolean> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(ay1 ay1Var) {
            Boolean bool;
            whb a;
            z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
            bq3 a2 = bq3.c.a(ay1Var.getName());
            if (a2 != null && (a = my1.this.a.a(a2)) != null) {
                bool = Boolean.valueOf(a.a());
            } else {
                bool = null;
            }
            return (Boolean) mh5.c(bool, Boolean.TRUE);
        }
    }

    public my1(yhb yhbVar) {
        z65.h(yhbVar, "toggleService");
        this.a = yhbVar;
    }

    @Override // defpackage.ly1
    public Collection<ay1> a(Collection<ay1> collection) {
        Sequence P;
        Sequence j;
        Sequence j2;
        List s;
        z65.h(collection, "countries");
        P = sc1.P(collection);
        j = dca.j(P, a.a);
        j2 = dca.j(j, new b());
        s = dca.s(j2);
        return s;
    }
}
