package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002J\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u0019\u0010 \"\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR0\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(0'j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*RW\u00101\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050,j\b\u0012\u0004\u0012\u00020\u0005`-0'j\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050,j\b\u0012\u0004\u0012\u00020\u0005`-`)8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\"\u00100R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u0005028F¢\u0006\u0006\u001a\u0004\b.\u0010\u001c¨\u00066"}, d2 = {"Lqx7;", "", "", Action.KEY_ATTRIBUTE, "dataKey", "Lgf5;", DateTokenConverter.CONVERTER_KEY, "keyInfo", "", Image.TYPE_HIGH, RemoteMessageConst.FROM, RemoteMessageConst.TO, "", "k", "count", "j", "insertIndex", "i", "group", "newCount", "n", Image.TYPE_MEDIUM, "g", "o", "", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "keyInfos", "I", e.a, "()I", "startIndex", c.a, "l", "(I)V", "groupIndex", "usedKeys", "Ljava/util/HashMap;", "Loi4;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "groupInfos", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "f", "Lrn5;", "()Ljava/util/HashMap;", "keyMap", "", "used", "<init>", "(Ljava/util/List;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: qx7  reason: default package */
/* loaded from: classes.dex */
public final class qx7 {
    private final List<gf5> a;
    private final int b;
    private int c;
    private final List<gf5> d;
    private final HashMap<Integer, oi4> e;
    private final rn5 f;

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0000j\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004`\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/util/HashMap;", "", "Ljava/util/LinkedHashSet;", "Lgf5;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "a", "()Ljava/util/HashMap;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: qx7$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<HashMap<Object, LinkedHashSet<gf5>>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final HashMap<Object, LinkedHashSet<gf5>> invoke() {
            HashMap<Object, LinkedHashSet<gf5>> L;
            Object E;
            L = tn1.L();
            qx7 qx7Var = qx7.this;
            int size = qx7Var.b().size();
            for (int i = 0; i < size; i++) {
                gf5 gf5Var = qx7Var.b().get(i);
                E = tn1.E(gf5Var);
                tn1.O(L, E, gf5Var);
            }
            return L;
        }
    }

    public qx7(List<gf5> list, int i) {
        rn5 b;
        z65.h(list, "keyInfos");
        this.a = list;
        this.b = i;
        if (i >= 0) {
            this.d = new ArrayList();
            HashMap<Integer, oi4> hashMap = new HashMap<>();
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                gf5 gf5Var = this.a.get(i3);
                hashMap.put(Integer.valueOf(gf5Var.b()), new oi4(i3, i2, gf5Var.c()));
                i2 += gf5Var.c();
            }
            this.e = hashMap;
            b = yn5.b(new a());
            this.f = b;
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    public final int a() {
        return this.c;
    }

    public final List<gf5> b() {
        return this.a;
    }

    public final HashMap<Object, LinkedHashSet<gf5>> c() {
        return (HashMap) this.f.getValue();
    }

    public final gf5 d(int i, Object obj) {
        Object valueOf;
        Object N;
        if (obj != null) {
            valueOf = new x95(Integer.valueOf(i), obj);
        } else {
            valueOf = Integer.valueOf(i);
        }
        N = tn1.N(c(), valueOf);
        return (gf5) N;
    }

    public final int e() {
        return this.b;
    }

    public final List<gf5> f() {
        return this.d;
    }

    public final int g(gf5 gf5Var) {
        z65.h(gf5Var, "keyInfo");
        oi4 oi4Var = this.e.get(Integer.valueOf(gf5Var.b()));
        if (oi4Var != null) {
            return oi4Var.b();
        }
        return -1;
    }

    public final boolean h(gf5 gf5Var) {
        z65.h(gf5Var, "keyInfo");
        return this.d.add(gf5Var);
    }

    public final void i(gf5 gf5Var, int i) {
        z65.h(gf5Var, "keyInfo");
        this.e.put(Integer.valueOf(gf5Var.b()), new oi4(-1, i, 0));
    }

    public final void j(int i, int i2, int i3) {
        if (i > i2) {
            Collection<oi4> values = this.e.values();
            z65.g(values, "groupInfos.values");
            for (oi4 oi4Var : values) {
                int b = oi4Var.b();
                if (i <= b && b < i + i3) {
                    oi4Var.e((b - i) + i2);
                } else if (i2 <= b && b < i) {
                    oi4Var.e(b + i3);
                }
            }
        } else if (i2 > i) {
            Collection<oi4> values2 = this.e.values();
            z65.g(values2, "groupInfos.values");
            for (oi4 oi4Var2 : values2) {
                int b2 = oi4Var2.b();
                if (i <= b2 && b2 < i + i3) {
                    oi4Var2.e((b2 - i) + i2);
                } else if (i + 1 <= b2 && b2 < i2) {
                    oi4Var2.e(b2 - i3);
                }
            }
        }
    }

    public final void k(int i, int i2) {
        if (i > i2) {
            Collection<oi4> values = this.e.values();
            z65.g(values, "groupInfos.values");
            for (oi4 oi4Var : values) {
                int c = oi4Var.c();
                if (c == i) {
                    oi4Var.f(i2);
                } else if (i2 <= c && c < i) {
                    oi4Var.f(c + 1);
                }
            }
        } else if (i2 > i) {
            Collection<oi4> values2 = this.e.values();
            z65.g(values2, "groupInfos.values");
            for (oi4 oi4Var2 : values2) {
                int c2 = oi4Var2.c();
                if (c2 == i) {
                    oi4Var2.f(i2);
                } else if (i + 1 <= c2 && c2 < i2) {
                    oi4Var2.f(c2 - 1);
                }
            }
        }
    }

    public final void l(int i) {
        this.c = i;
    }

    public final int m(gf5 gf5Var) {
        z65.h(gf5Var, "keyInfo");
        oi4 oi4Var = this.e.get(Integer.valueOf(gf5Var.b()));
        if (oi4Var != null) {
            return oi4Var.c();
        }
        return -1;
    }

    public final boolean n(int i, int i2) {
        int b;
        oi4 oi4Var = this.e.get(Integer.valueOf(i));
        if (oi4Var != null) {
            int b2 = oi4Var.b();
            int a2 = i2 - oi4Var.a();
            oi4Var.d(i2);
            if (a2 != 0) {
                Collection<oi4> values = this.e.values();
                z65.g(values, "groupInfos.values");
                for (oi4 oi4Var2 : values) {
                    if (oi4Var2.b() >= b2 && !z65.c(oi4Var2, oi4Var) && (b = oi4Var2.b() + a2) >= 0) {
                        oi4Var2.e(b);
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final int o(gf5 gf5Var) {
        z65.h(gf5Var, "keyInfo");
        oi4 oi4Var = this.e.get(Integer.valueOf(gf5Var.b()));
        if (oi4Var != null) {
            return oi4Var.a();
        }
        return gf5Var.c();
    }
}
