package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Task.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\bR\"\u0010\u001d\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lx6b;", "", "", "f", "Lj7b;", "queue", "", e.a, "(Lj7b;)V", "", "toString", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "", "Z", "()Z", "cancelable", c.a, "Lj7b;", DateTokenConverter.CONVERTER_KEY, "()Lj7b;", "setQueue$okhttp", "J", "()J", "g", "(J)V", "nextExecuteNanoTime", "<init>", "(Ljava/lang/String;Z)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: x6b  reason: default package */
/* loaded from: classes3.dex */
public abstract class x6b {
    private final String a;
    private final boolean b;
    private j7b c;
    private long d;

    public x6b(String str, boolean z) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        this.a = str;
        this.b = z;
        this.d = -1L;
    }

    public final boolean a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final long c() {
        return this.d;
    }

    public final j7b d() {
        return this.c;
    }

    public final void e(j7b j7bVar) {
        z65.h(j7bVar, "queue");
        j7b j7bVar2 = this.c;
        if (j7bVar2 == j7bVar) {
            return;
        }
        if (j7bVar2 == null) {
            this.c = j7bVar;
            return;
        }
        throw new IllegalStateException("task is in multiple queues".toString());
    }

    public abstract long f();

    public final void g(long j) {
        this.d = j;
    }

    public String toString() {
        return this.a;
    }

    public /* synthetic */ x6b(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
