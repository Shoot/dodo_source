package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Llx1;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "", "N", "J", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: lx1  reason: default package */
/* loaded from: classes3.dex */
public interface lx1 extends CoroutineContext.Element {
    public static final a J = a.a;

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llx1$a;", "Lkotlin/coroutines/CoroutineContext$b;", "Llx1;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: lx1$a */
    /* loaded from: classes3.dex */
    public static final class a implements CoroutineContext.b<lx1> {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    void N(CoroutineContext coroutineContext, Throwable th);
}
