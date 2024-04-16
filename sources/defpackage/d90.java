package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.net.ProtocolException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: BasicDerAdapter.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\tBM\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010!\u001a\u00020\u0005¢\u0006\u0004\b8\u00109J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016Jd\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\b\b\u0002\u0010 \u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010!\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0013\u0010&\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0017\u0010 \u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b \u00102R\u0019\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u0010!\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00101¨\u0006:"}, d2 = {"Ld90;", "T", "Lm03;", "Ln03;", "header", "", "b", "Lo03;", "reader", "a", "(Lo03;)Ljava/lang/Object;", "Lp03;", "writer", "value", "", e.a, "(Lp03;Ljava/lang/Object;)V", "", "tagClass", "", RemoteMessageConst.Notification.TAG, "q", "defaultValue", "n", "(Ljava/lang/Object;)Ld90;", Image.TYPE_HIGH, "hashCode", "", "toString", Action.NAME_ATTRIBUTE, "Ld90$a;", "codec", "isOptional", "typeHint", "i", "(Ljava/lang/String;IJLd90$a;ZLjava/lang/Object;Z)Ld90;", "", "other", "equals", "Ljava/lang/String;", "I", Image.TYPE_MEDIUM, "()I", c.a, "J", "l", "()J", DateTokenConverter.CONVERTER_KEY, "Ld90$a;", "Z", "()Z", "f", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "g", "<init>", "(Ljava/lang/String;IJLd90$a;ZLjava/lang/Object;Z)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: d90  reason: default package */
/* loaded from: classes3.dex */
public final class d90<T> implements m03<T> {
    private final String a;
    private final int b;
    private final long c;
    private final a<T> d;
    private final boolean e;
    private final T f;
    private final boolean g;

    /* compiled from: BasicDerAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Ld90$a;", "T", "", "Lo03;", "reader", "b", "(Lo03;)Ljava/lang/Object;", "Lp03;", "writer", "value", "", "a", "(Lp03;Ljava/lang/Object;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: d90$a */
    /* loaded from: classes3.dex */
    public interface a<T> {
        void a(p03 p03Var, T t);

        T b(o03 o03Var);
    }

    /* compiled from: BasicDerAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Leh0;", "it", "", "a", "(Leh0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d90$b */
    /* loaded from: classes3.dex */
    static final class b extends ej5 implements Function1<eh0, Unit> {
        final /* synthetic */ d90<T> a;
        final /* synthetic */ p03 b;
        final /* synthetic */ T c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d90<T> d90Var, p03 p03Var, T t) {
            super(1);
            this.a = d90Var;
            this.b = p03Var;
            this.c = t;
        }

        public final void a(eh0 eh0Var) {
            z65.h(eh0Var, "it");
            ((d90) this.a).d.a(this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(eh0 eh0Var) {
            a(eh0Var);
            return Unit.a;
        }
    }

    public d90(String str, int i, long j, a<T> aVar, boolean z, T t, boolean z2) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(aVar, "codec");
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = aVar;
        this.e = z;
        this.f = t;
        this.g = z2;
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (j < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d90 j(d90 d90Var, String str, int i, long j, a aVar, boolean z, Object obj, boolean z2, int i2, Object obj2) {
        String str2;
        int i3;
        long j2;
        a<T> aVar2;
        boolean z3;
        T t;
        boolean z4;
        if ((i2 & 1) != 0) {
            str2 = d90Var.a;
        } else {
            str2 = str;
        }
        if ((i2 & 2) != 0) {
            i3 = d90Var.b;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            j2 = d90Var.c;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            aVar2 = d90Var.d;
        } else {
            aVar2 = aVar;
        }
        if ((i2 & 16) != 0) {
            z3 = d90Var.e;
        } else {
            z3 = z;
        }
        if ((i2 & 32) != 0) {
            t = d90Var.f;
        } else {
            t = obj;
        }
        if ((i2 & 64) != 0) {
            z4 = d90Var.g;
        } else {
            z4 = z2;
        }
        return d90Var.i(str2, i3, j2, aVar2, z3, t, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d90 o(d90 d90Var, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return d90Var.n(obj);
    }

    public static /* synthetic */ d90 r(d90 d90Var, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 128;
        }
        return d90Var.q(i, j);
    }

    @Override // defpackage.m03
    public T a(o03 o03Var) {
        n03 n03Var;
        long j;
        boolean z;
        long j2;
        List list;
        List list2;
        long i;
        List list3;
        long i2;
        z65.h(o03Var, "reader");
        n03 m = o03Var.m();
        if (m != null && m.d() == this.b && m.c() == this.c) {
            String str = this.a;
            if (o03Var.l()) {
                n03Var = o03Var.g;
                z65.e(n03Var);
                o03Var.g = null;
                j = o03Var.c;
                z = o03Var.f;
                if (n03Var.b() != -1) {
                    i2 = o03Var.i();
                    j2 = i2 + n03Var.b();
                } else {
                    j2 = -1;
                }
                if (j == -1 || j2 <= j) {
                    o03Var.c = j2;
                    o03Var.f = n03Var.a();
                    if (str != null) {
                        list3 = o03Var.e;
                        list3.add(str);
                    }
                    try {
                        T b2 = this.d.b(o03Var);
                        if (j2 != -1) {
                            i = o03Var.i();
                            if (i > j2) {
                                throw new ProtocolException("unexpected byte count at " + o03Var);
                            }
                        }
                        if (this.g) {
                            o03Var.x(b2);
                        }
                        return b2;
                    } finally {
                        o03Var.g = null;
                        o03Var.c = j;
                        o03Var.f = z;
                        if (str != null) {
                            list = o03Var.e;
                            list2 = o03Var.e;
                            list.remove(list2.size() - 1);
                        }
                    }
                }
                throw new ProtocolException("enclosed object too large");
            }
            throw new ProtocolException("expected a value");
        } else if (this.e) {
            return this.f;
        } else {
            throw new ProtocolException("expected " + this + " but was " + m + " at " + o03Var);
        }
    }

    @Override // defpackage.m03
    public boolean b(n03 n03Var) {
        z65.h(n03Var, "header");
        if (n03Var.d() == this.b && n03Var.c() == this.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.m03
    public /* synthetic */ d90 c(int i, long j, Boolean bool) {
        return l03.e(this, i, j, bool);
    }

    @Override // defpackage.m03
    public /* synthetic */ d90 d(String str, int i, long j) {
        return l03.a(this, str, i, j);
    }

    @Override // defpackage.m03
    public void e(p03 p03Var, T t) {
        z65.h(p03Var, "writer");
        if (this.g) {
            p03Var.c(t);
        }
        if (this.e && z65.c(t, this.f)) {
            return;
        }
        p03Var.f(this.a, this.b, this.c, new b(this, p03Var, t));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d90)) {
            return false;
        }
        d90 d90Var = (d90) obj;
        if (z65.c(this.a, d90Var.a) && this.b == d90Var.b && this.c == d90Var.c && z65.c(this.d, d90Var.d) && this.e == d90Var.e && z65.c(this.f, d90Var.f) && this.g == d90Var.g) {
            return true;
        }
        return false;
    }

    public /* synthetic */ d90 g() {
        return l03.b(this);
    }

    public final d90<T> h() {
        return j(this, null, 0, 0L, null, false, null, true, 63, null);
    }

    public int hashCode() {
        int i;
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b) * 31) + ((int) this.c)) * 31) + this.d.hashCode()) * 31) + (this.e ? 1 : 0)) * 31;
        T t = this.f;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        return ((hashCode + i) * 31) + (this.g ? 1 : 0);
    }

    public final d90<T> i(String str, int i, long j, a<T> aVar, boolean z, T t, boolean z2) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(aVar, "codec");
        return new d90<>(str, i, j, aVar, z, t, z2);
    }

    public /* synthetic */ Object k(lk0 lk0Var) {
        return l03.c(this, lk0Var);
    }

    public final long l() {
        return this.c;
    }

    public final int m() {
        return this.b;
    }

    public final d90<T> n(T t) {
        return j(this, null, 0, 0L, null, true, t, false, 79, null);
    }

    public /* synthetic */ lk0 p(Object obj) {
        return l03.d(this, obj);
    }

    public final d90<T> q(int i, long j) {
        return j(this, null, i, j, null, false, null, false, 121, null);
    }

    public String toString() {
        return this.a + " [" + this.b + '/' + this.c + ']';
    }

    public /* synthetic */ d90(String str, int i, long j, a aVar, boolean z, Object obj, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, j, aVar, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : obj, (i2 & 64) != 0 ? false : z2);
    }
}
