package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
/* compiled from: WeakCache.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0013¨\u0006\u0017"}, d2 = {"Ld3c;", "T", "", "", "a", "element", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)V", c.a, "()Ljava/lang/Object;", "Lgr6;", "Ljava/lang/ref/Reference;", "Lgr6;", "values", "Ljava/lang/ref/ReferenceQueue;", "b", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "", "()I", "size", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: d3c  reason: default package */
/* loaded from: classes.dex */
public final class d3c<T> {
    private final gr6<Reference<T>> a = new gr6<>(new Reference[16], 0);
    private final ReferenceQueue<T> b = new ReferenceQueue<>();

    private final void a() {
        Reference<? extends T> poll;
        do {
            poll = this.b.poll();
            if (poll != null) {
                this.a.x(poll);
                continue;
            }
        } while (poll != null);
    }

    public final int b() {
        a();
        return this.a.s();
    }

    public final T c() {
        a();
        while (this.a.v()) {
            gr6<Reference<T>> gr6Var = this.a;
            T t = gr6Var.z(gr6Var.s() - 1).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public final void d(T t) {
        a();
        this.a.b(new WeakReference(t, this.b));
    }
}
