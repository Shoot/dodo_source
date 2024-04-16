package defpackage;

import com.huawei.hms.push.e;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: Callback.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H&J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lfm0;", "", "Lcm0;", "call", "Ljava/io/IOException;", "Lokio/IOException;", e.a, "", "onFailure", "Lik9;", "response", "onResponse", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: fm0  reason: default package */
/* loaded from: classes3.dex */
public interface fm0 {
    void onFailure(cm0 cm0Var, IOException iOException);

    void onResponse(cm0 cm0Var, ik9 ik9Var) throws IOException;
}
