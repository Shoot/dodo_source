package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
/* compiled from: Applier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u001b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001e"}, d2 = {"Lt67;", "N", "Lwp;", "node", "", "g", "(Ljava/lang/Object;)V", "i", "", "index", "instance", DateTokenConverter.CONVERTER_KEY, "(ILjava/lang/Object;)V", "f", "count", "a", RemoteMessageConst.FROM, RemoteMessageConst.TO, c.a, "clear", "Lwp;", "applier", "b", "I", "offset", "nesting", "()Ljava/lang/Object;", "current", "<init>", "(Lwp;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: t67  reason: default package */
/* loaded from: classes.dex */
public final class t67<N> implements wp<N> {
    private final wp<N> a;
    private final int b;
    private int c;

    public t67(wp<N> wpVar, int i) {
        z65.h(wpVar, "applier");
        this.a = wpVar;
        this.b = i;
    }

    @Override // defpackage.wp
    public void a(int i, int i2) {
        int i3;
        wp<N> wpVar = this.a;
        if (this.c == 0) {
            i3 = this.b;
        } else {
            i3 = 0;
        }
        wpVar.a(i + i3, i2);
    }

    @Override // defpackage.wp
    public N b() {
        return this.a.b();
    }

    @Override // defpackage.wp
    public void c(int i, int i2, int i3) {
        int i4;
        if (this.c == 0) {
            i4 = this.b;
        } else {
            i4 = 0;
        }
        this.a.c(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.wp
    public void clear() {
        tn1.w("Clear is not valid on OffsetApplier".toString());
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.wp
    public void d(int i, N n) {
        int i2;
        wp<N> wpVar = this.a;
        if (this.c == 0) {
            i2 = this.b;
        } else {
            i2 = 0;
        }
        wpVar.d(i + i2, n);
    }

    @Override // defpackage.wp
    public /* synthetic */ void e() {
        vp.b(this);
    }

    @Override // defpackage.wp
    public void f(int i, N n) {
        int i2;
        wp<N> wpVar = this.a;
        if (this.c == 0) {
            i2 = this.b;
        } else {
            i2 = 0;
        }
        wpVar.f(i + i2, n);
    }

    @Override // defpackage.wp
    public void g(N n) {
        this.c++;
        this.a.g(n);
    }

    @Override // defpackage.wp
    public /* synthetic */ void h() {
        vp.a(this);
    }

    @Override // defpackage.wp
    public void i() {
        boolean z;
        int i = this.c;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.c = i - 1;
            this.a.i();
            return;
        }
        tn1.w("OffsetApplier up called with no corresponding down".toString());
        throw new KotlinNothingValueException();
    }
}
