package io.realm;

import com.inappstory.sdk.stories.statistic.StatisticManager;
import io.realm.internal.OsList;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes3.dex */
public final class l0<T> extends u<T> {
    private final String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(a aVar, OsList osList, Class<T> cls, String str) {
        super(aVar, osList, cls);
        this.d = str;
    }

    @Override // io.realm.u
    public void c(Object obj) {
        o89 o89Var = (o89) obj;
        boolean a = f.a(this.a, o89Var, this.d, StatisticManager.LIST);
        if (f.d(this.a, o89Var)) {
            if (!(obj instanceof DynamicRealmObject)) {
                f.e((d0) this.a, o89Var, this.b.n());
                return;
            }
            throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
        }
        if (a) {
            o89Var = f.b(this.a, o89Var);
        }
        this.b.k(((r89) o89Var).a().g().E0());
    }

    @Override // io.realm.u
    protected void e(Object obj) {
        if (obj != null) {
            if (obj instanceof o89) {
                return;
            }
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.String", obj.getClass().getName()));
        }
        throw new IllegalArgumentException("RealmList does not accept null values.");
    }

    @Override // io.realm.u
    public T g(int i) {
        return (T) this.a.r(this.c, this.d, this.b.r(i));
    }

    @Override // io.realm.u
    protected void i(int i) {
        throw new RuntimeException("Should not reach here.");
    }

    @Override // io.realm.u
    public void j(int i, Object obj) {
        d(i);
        o89 o89Var = (o89) obj;
        boolean a = f.a(this.a, o89Var, this.d, StatisticManager.LIST);
        if (f.d(this.a, o89Var)) {
            if (!(obj instanceof DynamicRealmObject)) {
                f.e((d0) this.a, o89Var, this.b.o(i));
                return;
            }
            throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
        }
        if (a) {
            o89Var = f.b(this.a, o89Var);
        }
        this.b.D(i, ((r89) o89Var).a().g().E0());
    }

    @Override // io.realm.u
    protected void p(int i) {
        throw new RuntimeException("Should not reach here.");
    }

    @Override // io.realm.u
    protected void q(int i, Object obj) {
        o89 o89Var = (o89) obj;
        boolean a = f.a(this.a, o89Var, this.d, StatisticManager.LIST);
        if (f.d(this.a, o89Var)) {
            if (!(obj instanceof DynamicRealmObject)) {
                f.e((d0) this.a, o89Var, this.b.p(i));
                return;
            }
            throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
        }
        if (a) {
            o89Var = f.b(this.a, o89Var);
        }
        this.b.U(i, ((r89) o89Var).a().g().E0());
    }
}
