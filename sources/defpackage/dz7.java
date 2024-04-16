package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.umb;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersistentHashMap.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u0000 +*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001,B#\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\u0012\u0006\u0010!\u001a\u00020\u001d¢\u0006\u0004\b)\u0010*J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005H\u0002J\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\bH\u0001J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015H\u0016R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006-"}, d2 = {"Ldz7;", "K", "V", "Lo1;", "Ltz7;", "Lax4;", "", "o", "", e.a, Action.KEY_ATTRIBUTE, "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "t", "(Ljava/lang/Object;Ljava/lang/Object;)Ldz7;", "u", "(Ljava/lang/Object;)Ldz7;", "Lfz7;", "n", "Lumb;", DateTokenConverter.CONVERTER_KEY, "Lumb;", "q", "()Lumb;", "node", "", "I", Image.TYPE_HIGH, "()I", "size", "p", "()Lax4;", "keys", "Lvw4;", Image.TYPE_SMALL, "()Lvw4;", "values", "<init>", "(Lumb;I)V", "f", "a", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: dz7  reason: default package */
/* loaded from: classes.dex */
public class dz7<K, V> extends o1<K, V> implements tz7<K, V> {
    public static final a f = new a(null);
    private static final dz7 g = new dz7(umb.e.a(), 0);
    private final umb<K, V> d;
    private final int e;

    /* compiled from: PersistentHashMap.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Ldz7$a;", "", "K", "V", "Ldz7;", "a", "()Ldz7;", "", "EMPTY", "Ldz7;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: dz7$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <K, V> dz7<K, V> a() {
            dz7<K, V> dz7Var = dz7.g;
            z65.f(dz7Var, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dz7Var;
        }
    }

    public dz7(umb<K, V> umbVar, int i) {
        z65.h(umbVar, "node");
        this.d = umbVar;
        this.e = i;
    }

    private final ax4<Map.Entry<K, V>> o() {
        return new nz7(this);
    }

    @Override // defpackage.o1, java.util.Map
    public boolean containsKey(K k) {
        int i;
        umb<K, V> umbVar = this.d;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return umbVar.k(i, k, 0);
    }

    @Override // defpackage.o1
    public final Set<Map.Entry<K, V>> e() {
        return o();
    }

    @Override // defpackage.o1, java.util.Map
    public V get(K k) {
        int i;
        umb<K, V> umbVar = this.d;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return umbVar.o(i, k, 0);
    }

    @Override // defpackage.o1
    public int h() {
        return this.e;
    }

    @Override // defpackage.tz7, defpackage.bz7
    /* renamed from: n */
    public fz7<K, V> f() {
        return new fz7<>(this);
    }

    @Override // defpackage.o1
    /* renamed from: p */
    public ax4<K> g() {
        return new pz7(this);
    }

    public final umb<K, V> q() {
        return this.d;
    }

    @Override // defpackage.o1
    /* renamed from: s */
    public vw4<V> i() {
        return new rz7(this);
    }

    public dz7<K, V> t(K k, V v) {
        int i;
        umb<K, V> umbVar = this.d;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        umb.b<K, V> P = umbVar.P(i, k, v, 0);
        if (P == null) {
            return this;
        }
        return new dz7<>(P.a(), size() + P.b());
    }

    public dz7<K, V> u(K k) {
        int i;
        umb<K, V> umbVar = this.d;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        umb<K, V> Q = umbVar.Q(i, k, 0);
        if (this.d == Q) {
            return this;
        }
        if (Q == null) {
            return f.a();
        }
        return new dz7<>(Q, size() - 1);
    }
}
