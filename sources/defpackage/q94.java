package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lq94;", "T", "Loz3;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lzg0;", "onBufferOverflow", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: q94  reason: default package */
/* loaded from: classes3.dex */
public interface q94<T> extends oz3<T> {

    /* compiled from: ChannelFlow.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: q94$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ oz3 a(q94 q94Var, CoroutineContext coroutineContext, int i, zg0 zg0Var, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    coroutineContext = e.a;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    zg0Var = zg0.SUSPEND;
                }
                return q94Var.b(coroutineContext, i, zg0Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    oz3<T> b(CoroutineContext coroutineContext, int i, zg0 zg0Var);
}
