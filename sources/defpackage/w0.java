package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Applier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\t\u001a\u00020\u0004H$R\u0017\u0010\u000e\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R*\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00008\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0015\u0010\u0006¨\u0006\u0018"}, d2 = {"Lw0;", "T", "Lwp;", "node", "", "g", "(Ljava/lang/Object;)V", "i", "clear", "k", "a", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "root", "", "b", "Ljava/util/List;", "stack", "<set-?>", c.a, "l", "current", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: w0  reason: default package */
/* loaded from: classes.dex */
public abstract class w0<T> implements wp<T> {
    private final T a;
    private final List<T> b = new ArrayList();
    private T c;

    public w0(T t) {
        this.a = t;
        this.c = t;
    }

    @Override // defpackage.wp
    public T b() {
        return this.c;
    }

    @Override // defpackage.wp
    public final void clear() {
        this.b.clear();
        l(this.a);
        k();
    }

    @Override // defpackage.wp
    public /* synthetic */ void e() {
        vp.b(this);
    }

    @Override // defpackage.wp
    public void g(T t) {
        this.b.add(b());
        l(t);
    }

    @Override // defpackage.wp
    public /* synthetic */ void h() {
        vp.a(this);
    }

    @Override // defpackage.wp
    public void i() {
        if (!this.b.isEmpty()) {
            List<T> list = this.b;
            l(list.remove(list.size() - 1));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final T j() {
        return this.a;
    }

    protected abstract void k();

    protected void l(T t) {
        this.c = t;
    }
}
