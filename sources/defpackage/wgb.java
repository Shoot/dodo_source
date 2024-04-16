package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: Timed.java */
/* renamed from: wgb  reason: default package */
/* loaded from: classes3.dex */
public final class wgb<T> {
    final T a;
    final long b;
    final TimeUnit c;

    public wgb(T t, long j, TimeUnit timeUnit) {
        this.a = t;
        this.b = j;
        this.c = (TimeUnit) x47.e(timeUnit, "unit is null");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wgb)) {
            return false;
        }
        wgb wgbVar = (wgb) obj;
        if (!x47.c(this.a, wgbVar.a) || this.b != wgbVar.b || !x47.c(this.c, wgbVar.c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        T t = this.a;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        long j = this.b;
        return (((i * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.b + ", unit=" + this.c + ", value=" + this.a + "]";
    }
}
