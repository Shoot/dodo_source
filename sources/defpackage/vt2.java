package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
/* compiled from: Delay.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, d2 = {"Lvt2;", "", "", "timeMillis", "Lfn0;", "", "continuation", Image.TYPE_MEDIUM, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lf43;", Image.TYPE_SMALL, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: vt2  reason: default package */
/* loaded from: classes3.dex */
public interface vt2 {

    /* compiled from: Delay.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: vt2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static f43 a(vt2 vt2Var, long j, Runnable runnable, CoroutineContext coroutineContext) {
            return rp2.a().s(j, runnable, coroutineContext);
        }
    }

    void m(long j, fn0<? super Unit> fn0Var);

    f43 s(long j, Runnable runnable, CoroutineContext coroutineContext);
}
