package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
/* compiled from: StreamResetException.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "Lfk3;", "a", "Lfk3;", "errorCode", "<init>", "(Lfk3;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class StreamResetException extends IOException {
    public final fk3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(fk3 fk3Var) {
        super("stream was reset: " + fk3Var);
        z65.h(fk3Var, "errorCode");
        this.a = fk3Var;
    }
}
