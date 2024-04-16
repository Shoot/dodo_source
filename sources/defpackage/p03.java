package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: DerWriter.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00104\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J2\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\rJ!\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010!\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\bJ\b\u0010$\u001a\u00020\bH\u0016R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\"\u00100\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.\"\u0004\b\u0015\u0010/R(\u00103\u001a\u0004\u0018\u00010\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u00101\"\u0004\b*\u00102¨\u00067"}, d2 = {"Lp03;", "", "Leh0;", DateTokenConverter.CONVERTER_KEY, "", "v", "", "n", "", Action.NAME_ATTRIBUTE, "", "tagClass", RemoteMessageConst.Notification.TAG, "Lkotlin/Function1;", "block", "f", "T", "Lkotlin/Function0;", e.a, "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "b", "i", "Ljava/math/BigInteger;", "value", "g", "j", "Lpb0;", "bitString", Image.TYPE_HIGH, "Llk0;", "byteString", "l", Image.TYPE_MEDIUM, Image.TYPE_SMALL, "k", "toString", "", "a", "Ljava/util/List;", "stack", "typeHintStack", c.a, "path", "Z", "getConstructed", "()Z", "(Z)V", "constructed", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "typeHint", "sink", "<init>", "(Leh0;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: p03  reason: default package */
/* loaded from: classes3.dex */
public final class p03 {
    private final List<eh0> a;
    private final List<Object> b;
    private final List<String> c;
    private boolean d;

    public p03(eh0 eh0Var) {
        List<eh0> r;
        z65.h(eh0Var, "sink");
        r = kc1.r(eh0Var);
        this.a = r;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    private final eh0 d() {
        List<eh0> list = this.a;
        return list.get(list.size() - 1);
    }

    private final void n(long j) {
        int i;
        eh0 d = d();
        int numberOfLeadingZeros = (((70 - Long.numberOfLeadingZeros(j)) / 7) - 1) * 7;
        int c = fp8.c(numberOfLeadingZeros, 0, -7);
        if (c > numberOfLeadingZeros) {
            return;
        }
        while (true) {
            if (numberOfLeadingZeros == 0) {
                i = 0;
            } else {
                i = 128;
            }
            d.V0(i | ((int) ((j >> numberOfLeadingZeros) & 127)));
            if (numberOfLeadingZeros != c) {
                numberOfLeadingZeros -= 7;
            } else {
                return;
            }
        }
    }

    public final Object a() {
        Object l0;
        l0 = sc1.l0(this.b);
        return l0;
    }

    public final void b(boolean z) {
        this.d = z;
    }

    public final void c(Object obj) {
        List<Object> list = this.b;
        list.set(list.size() - 1, obj);
    }

    public final <T> T e(Function0<? extends T> function0) {
        z65.h(function0, "block");
        this.b.add(null);
        try {
            T invoke = function0.invoke();
            List<Object> list = this.b;
            list.remove(list.size() - 1);
            return invoke;
        } catch (Throwable th) {
            this.b.remove(this.b.size() - 1);
            throw th;
        }
    }

    public final void f(String str, int i, long j, Function1<? super eh0, Unit> function1) {
        int i2;
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(function1, "block");
        yg0 yg0Var = new yg0();
        this.a.add(yg0Var);
        this.d = false;
        this.c.add(str);
        try {
            function1.invoke(yg0Var);
            if (this.d) {
                i2 = 32;
            } else {
                i2 = 0;
            }
            this.d = true;
            List<eh0> list = this.a;
            list.remove(list.size() - 1);
            List<String> list2 = this.c;
            list2.remove(list2.size() - 1);
            eh0 d = d();
            if (j < 31) {
                d.V0(i | i2 | ((int) j));
            } else {
                d.V0(i | i2 | 31);
                n(j);
            }
            long P = yg0Var.P();
            if (P < 128) {
                d.V0((int) P);
            } else {
                int numberOfLeadingZeros = (71 - Long.numberOfLeadingZeros(P)) / 8;
                d.V0(numberOfLeadingZeros | 128);
                int i3 = (numberOfLeadingZeros - 1) * 8;
                int c = fp8.c(i3, 0, -8);
                if (c <= i3) {
                    while (true) {
                        d.V0((int) (P >> i3));
                        if (i3 == c) {
                            break;
                        }
                        i3 -= 8;
                    }
                }
            }
            d.a1(yg0Var);
        } catch (Throwable th) {
            List<eh0> list3 = this.a;
            list3.remove(list3.size() - 1);
            List<String> list4 = this.c;
            list4.remove(list4.size() - 1);
            throw th;
        }
    }

    public final void g(BigInteger bigInteger) {
        z65.h(bigInteger, "value");
        eh0 d = d();
        byte[] byteArray = bigInteger.toByteArray();
        z65.g(byteArray, "toByteArray(...)");
        d.v0(byteArray);
    }

    public final void h(pb0 pb0Var) {
        z65.h(pb0Var, "bitString");
        eh0 d = d();
        d.V0(pb0Var.b());
        d.d0(pb0Var.a());
    }

    public final void i(boolean z) {
        int i;
        eh0 d = d();
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        d.V0(i);
    }

    public final void j(long j) {
        int numberOfLeadingZeros;
        eh0 d = d();
        if (j < 0) {
            numberOfLeadingZeros = Long.numberOfLeadingZeros(~j);
        } else {
            numberOfLeadingZeros = Long.numberOfLeadingZeros(j);
        }
        int i = ((((65 - numberOfLeadingZeros) + 7) / 8) - 1) * 8;
        int c = fp8.c(i, 0, -8);
        if (c > i) {
            return;
        }
        while (true) {
            d.V0((int) (j >> i));
            if (i != c) {
                i -= 8;
            } else {
                return;
            }
        }
    }

    public final void k(String str) {
        z65.h(str, Image.TYPE_SMALL);
        yg0 a0 = new yg0().a0(str);
        long b1 = a0.b1();
        if (a0.readByte() == 46) {
            n((b1 * 40) + a0.b1());
            while (!a0.U0()) {
                if (a0.readByte() == 46) {
                    n(a0.b1());
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void l(lk0 lk0Var) {
        z65.h(lk0Var, "byteString");
        d().d0(lk0Var);
    }

    public final void m(String str) {
        z65.h(str, "value");
        d().a0(str);
    }

    public String toString() {
        String i0;
        i0 = sc1.i0(this.c, " / ", null, null, 0, null, null, 62, null);
        return i0;
    }
}
