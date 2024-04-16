package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
/* compiled from: Timeout.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "Ll95;", "a", "Ll95;", "coroutine", "", "message", "<init>", "(Ljava/lang/String;Ll95;)V", "(Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class TimeoutCancellationException extends CancellationException {
    public final transient l95 a;

    public TimeoutCancellationException(String str, l95 l95Var) {
        super(str);
        this.a = l95Var;
    }

    public TimeoutCancellationException(String str) {
        this(str, null);
    }
}
