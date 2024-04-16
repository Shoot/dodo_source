package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import kotlin.Metadata;
/* compiled from: PersistentOrderedSet.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013B\t\b\u0016¢\u0006\u0004\b\u0012\u0010\u0014B\u0013\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0015J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0016"}, d2 = {"Luq5;", "", "newNext", e.a, "newPrevious", "f", "a", "Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "previous", "b", c.a, StatisticManager.NEXT, "", "()Z", "hasNext", "hasPrevious", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "()V", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: uq5  reason: default package */
/* loaded from: classes.dex */
public final class uq5 {
    private final Object a;
    private final Object b;

    public uq5(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean a() {
        if (this.b != vh3.a) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.a != vh3.a) {
            return true;
        }
        return false;
    }

    public final Object c() {
        return this.b;
    }

    public final Object d() {
        return this.a;
    }

    public final uq5 e(Object obj) {
        return new uq5(this.a, obj);
    }

    public final uq5 f(Object obj) {
        return new uq5(obj, this.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public uq5() {
        /*
            r1 = this;
            vh3 r0 = defpackage.vh3.a
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq5.<init>():void");
    }

    public uq5(Object obj) {
        this(obj, vh3.a);
    }
}
