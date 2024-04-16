package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.d90;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DerAdapter.kt */
/* renamed from: l03 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l03 {

    /* compiled from: DerAdapter.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"l03$a", "Ld90$a;", "", "Lp03;", "writer", "value", "", DateTokenConverter.CONVERTER_KEY, "Lo03;", "reader", c.a, "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: l03$a */
    /* loaded from: classes3.dex */
    public static final class a implements d90.a {
        final /* synthetic */ m03 a;

        a(m03 m03Var) {
            this.a = m03Var;
        }

        @Override // defpackage.d90.a
        /* renamed from: c */
        public List b(o03 o03Var) {
            z65.h(o03Var, "reader");
            ArrayList arrayList = new ArrayList();
            while (o03Var.l()) {
                arrayList.add(this.a.a(o03Var));
            }
            return arrayList;
        }

        @Override // defpackage.d90.a
        /* renamed from: d */
        public void a(p03 p03Var, List list) {
            z65.h(p03Var, "writer");
            z65.h(list, "value");
            for (Object obj : list) {
                this.a.e(p03Var, obj);
            }
        }
    }

    /* compiled from: DerAdapter.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"l03$b", "Ld90$a;", "Lo03;", "reader", "b", "(Lo03;)Ljava/lang/Object;", "Lp03;", "writer", "value", "", "a", "(Lp03;Ljava/lang/Object;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: l03$b */
    /* loaded from: classes3.dex */
    public static final class b implements d90.a {
        final /* synthetic */ m03 a;
        final /* synthetic */ Boolean b;

        b(m03 m03Var, Boolean bool) {
            this.a = m03Var;
            this.b = bool;
        }

        @Override // defpackage.d90.a
        public void a(p03 p03Var, Object obj) {
            z65.h(p03Var, "writer");
            this.a.e(p03Var, obj);
            Boolean bool = this.b;
            if (bool != null) {
                p03Var.b(bool.booleanValue());
            }
        }

        @Override // defpackage.d90.a
        public Object b(o03 o03Var) {
            z65.h(o03Var, "reader");
            return this.a.a(o03Var);
        }
    }

    public static d90 a(m03 m03Var, String str, int i, long j) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        return new d90(str, i, j, new a(m03Var), false, null, false, 112, null);
    }

    public static d90 b(m03 m03Var) {
        return m03Var.d("SET OF", 0, 17L);
    }

    public static Object c(m03 m03Var, lk0 lk0Var) {
        z65.h(lk0Var, "byteString");
        return m03Var.a(new o03(new yg0().d0(lk0Var)));
    }

    public static lk0 d(m03 m03Var, Object obj) {
        yg0 yg0Var = new yg0();
        m03Var.e(new p03(yg0Var), obj);
        return yg0Var.v1();
    }

    public static d90 e(m03 m03Var, int i, long j, Boolean bool) {
        return new d90("EXPLICIT", i, j, new b(m03Var, bool), false, null, false, 112, null);
    }

    public static /* synthetic */ d90 f(m03 m03Var, String str, int i, long j, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                str = "SEQUENCE OF";
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                j = 16;
            }
            return m03Var.d(str, i, j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asSequenceOf");
    }

    public static /* synthetic */ d90 g(m03 m03Var, int i, long j, Boolean bool, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 128;
            }
            if ((i2 & 4) != 0) {
                bool = null;
            }
            return m03Var.c(i, j, bool);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withExplicitBox");
    }
}
