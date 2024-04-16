package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: ForwardingSource.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u000f\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0013"}, d2 = {"Ly54;", "Lpqa;", "Lyg0;", "sink", "", "byteCount", "read", "Lxgb;", "timeout", "", "close", "", "toString", "-deprecated_delegate", "()Lpqa;", "delegate", "Lpqa;", "<init>", "(Lpqa;)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: y54  reason: default package */
/* loaded from: classes3.dex */
public abstract class y54 implements pqa {
    private final pqa delegate;

    public y54(pqa pqaVar) {
        z65.h(pqaVar, "delegate");
        this.delegate = pqaVar;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final pqa m64deprecated_delegate() {
        return this.delegate;
    }

    @Override // defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final pqa delegate() {
        return this.delegate;
    }

    @Override // defpackage.pqa
    public long read(yg0 yg0Var, long j) throws IOException {
        z65.h(yg0Var, "sink");
        return this.delegate.read(yg0Var, j);
    }

    @Override // defpackage.pqa
    public xgb timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.delegate + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
