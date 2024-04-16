package defpackage;

import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: ActualAndroid.android.kt */
@Metadata(d1 = {"\u0000H\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0007H\u0000\u001a\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000\"!\u0010\u0019\u001a\u00020\u00138FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016*\f\b\u0000\u0010\u001b\"\u00020\u001a2\u00020\u001a¨\u0006\u001c"}, d2 = {"T", "value", "Lppa;", "policy", "Lmpa;", c.a, "(Ljava/lang/Object;Lppa;)Lmpa;", "", "Lnq6;", "b", "", "Llq6;", "a", "", "message", "", e.a, "", DateTokenConverter.CONVERTER_KEY, "Lno6;", "Lrn5;", "getDefaultMonotonicFrameClock", "()Lno6;", "getDefaultMonotonicFrameClock$annotations", "()V", "DefaultMonotonicFrameClock", "", "CheckResult", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: e6  reason: default package */
/* loaded from: classes.dex */
public final class e6 {
    private static final rn5 a = xn5.b(a.a);

    /* compiled from: ActualAndroid.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lno6;", "a", "()Lno6;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e6$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<no6> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final no6 invoke() {
            if (Looper.getMainLooper() != null) {
                return ip2.a;
            }
            return wx9.a;
        }
    }

    public static final lq6 a(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }

    public static final nq6 b(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }

    public static final <T> mpa<T> c(T t, ppa<T> ppaVar) {
        z65.h(ppaVar, "policy");
        return new ParcelableSnapshotMutableState(t, ppaVar);
    }

    public static final void d(String str, Throwable th) {
        z65.h(str, "message");
        z65.h(th, e.a);
        Log.e("ComposeInternal", str, th);
    }
}
