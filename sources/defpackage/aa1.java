package defpackage;

import java.io.Closeable;
import kotlin.Metadata;
/* compiled from: Closeable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¨\u0006\u0005"}, d2 = {"Ljava/io/Closeable;", "", "cause", "", "a", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
/* renamed from: aa1  reason: default package */
/* loaded from: classes3.dex */
public final class aa1 {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                vl3.a(th, th2);
            }
        }
    }
}
