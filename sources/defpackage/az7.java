package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bz7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersistentCompositionLocalMap.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\u0013\bB3\u0012\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0014"}, d2 = {"Laz7;", "Ldz7;", "Llo1;", "", "Lcua;", "Lbz7;", "T", Action.KEY_ATTRIBUTE, "b", "(Llo1;)Ljava/lang/Object;", "Laz7$a;", "x", "Lumb;", "node", "", "size", "<init>", "(Lumb;I)V", Image.TYPE_HIGH, "a", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: az7  reason: default package */
/* loaded from: classes.dex */
public final class az7 extends dz7<lo1<Object>, cua<? extends Object>> implements bz7 {
    public static final b h = new b(null);
    private static final az7 i;

    /* compiled from: PersistentCompositionLocalMap.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rJ\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000e\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Laz7$a;", "Lfz7;", "Llo1;", "", "Lcua;", "Lbz7$a;", "Laz7;", "o", "g", "Laz7;", "getMap$runtime_release", "()Laz7;", "setMap$runtime_release", "(Laz7;)V", "map", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: az7$a */
    /* loaded from: classes.dex */
    public static final class a extends fz7<lo1<Object>, cua<? extends Object>> implements bz7.a {
        private az7 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(az7 az7Var) {
            super(az7Var);
            z65.h(az7Var, "map");
            this.g = az7Var;
        }

        @Override // defpackage.fz7, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof lo1)) {
                return false;
            }
            return p((lo1) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof cua)) {
                return false;
            }
            return q((cua) obj);
        }

        @Override // defpackage.fz7, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof lo1)) {
                return null;
            }
            return s((lo1) obj);
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof lo1)) {
                return obj2;
            }
            return t((lo1) obj, (cua) obj2);
        }

        @Override // defpackage.fz7
        /* renamed from: o */
        public az7 g() {
            az7 az7Var;
            if (i() == this.g.q()) {
                az7Var = this.g;
            } else {
                m(new hq6());
                az7Var = new az7(i(), size());
            }
            this.g = az7Var;
            return az7Var;
        }

        public /* bridge */ boolean p(lo1<Object> lo1Var) {
            return super.containsKey(lo1Var);
        }

        public /* bridge */ boolean q(cua<? extends Object> cuaVar) {
            return super.containsValue(cuaVar);
        }

        @Override // defpackage.fz7, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof lo1)) {
                return null;
            }
            return u((lo1) obj);
        }

        public /* bridge */ cua<Object> s(lo1<Object> lo1Var) {
            return (cua) super.get(lo1Var);
        }

        public /* bridge */ cua<Object> t(lo1<Object> lo1Var, cua<? extends Object> cuaVar) {
            return (cua) super.getOrDefault(lo1Var, cuaVar);
        }

        public /* bridge */ cua<Object> u(lo1<Object> lo1Var) {
            return (cua) super.remove(lo1Var);
        }
    }

    /* compiled from: PersistentCompositionLocalMap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR\u001d\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Laz7$b;", "", "Laz7;", "Empty", "Laz7;", "a", "()Laz7;", "getEmpty$annotations", "()V", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: az7$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final az7 a() {
            return az7.i;
        }
    }

    static {
        umb a2 = umb.e.a();
        z65.f(a2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>");
        i = new az7(a2, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az7(umb<lo1<Object>, cua<Object>> umbVar, int i2) {
        super(umbVar, i2);
        z65.h(umbVar, "node");
    }

    public /* bridge */ cua<Object> A(lo1<Object> lo1Var) {
        return (cua) super.get(lo1Var);
    }

    public /* bridge */ cua<Object> B(lo1<Object> lo1Var, cua<? extends Object> cuaVar) {
        return (cua) super.getOrDefault(lo1Var, cuaVar);
    }

    @Override // defpackage.po1
    public <T> T b(lo1<T> lo1Var) {
        z65.h(lo1Var, Action.KEY_ATTRIBUTE);
        return (T) qo1.d(this, lo1Var);
    }

    @Override // defpackage.dz7, defpackage.o1, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof lo1)) {
            return false;
        }
        return y((lo1) obj);
    }

    @Override // defpackage.o1, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof cua)) {
            return false;
        }
        return z((cua) obj);
    }

    @Override // defpackage.dz7, defpackage.o1, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof lo1)) {
            return null;
        }
        return A((lo1) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof lo1)) {
            return obj2;
        }
        return B((lo1) obj, (cua) obj2);
    }

    @Override // defpackage.dz7
    /* renamed from: x */
    public a n() {
        return new a(this);
    }

    public /* bridge */ boolean y(lo1<Object> lo1Var) {
        return super.containsKey(lo1Var);
    }

    public /* bridge */ boolean z(cua<? extends Object> cuaVar) {
        return super.containsValue(cuaVar);
    }
}
