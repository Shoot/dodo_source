package defpackage;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
/* compiled from: ActualJvm.jvm.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le3c;", "", "T", "Ljava/lang/ref/WeakReference;", "reference", "<init>", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: e3c  reason: default package */
/* loaded from: classes.dex */
public final class e3c<T> extends WeakReference<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3c(T t) {
        super(t);
        z65.h(t, "reference");
    }
}
