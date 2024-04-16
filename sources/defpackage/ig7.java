package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.fnb;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: OrderManagerImpl.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a2\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0002¨\u0006\f"}, d2 = {"R", "", "maxAttempts", "", "delayMs", "Lkotlin/Function0;", "action", "Lfnb;", c.a, "ms", "", DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ig7  reason: default package */
/* loaded from: classes4.dex */
public final class ig7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <R> fnb<R> c(int i, long j, Function0<? extends R> function0) {
        R r = null;
        int i2 = 0;
        Exception th = null;
        while (i2 < i) {
            try {
                r = function0.invoke();
                break;
            } catch (Throwable th2) {
                th = th2;
                i2++;
                d(j);
            }
        }
        if (r != null) {
            return new fnb.c(r);
        }
        if (th == null) {
            th = new Exception("Failed to execute action");
        }
        return new fnb.b(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }
}
