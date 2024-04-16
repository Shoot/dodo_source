package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
/* compiled from: TextInputService.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R(\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lqbb;", "", "Lqc8;", "a", "Lqc8;", "platformTextInputService", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/text/AtomicReference;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "_currentInputSession", "<init>", "(Lqc8;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: qbb  reason: default package */
/* loaded from: classes.dex */
public class qbb {
    private final qc8 a;
    private final AtomicReference<Object> b;

    public qbb(qc8 qc8Var) {
        z65.h(qc8Var, "platformTextInputService");
        this.a = qc8Var;
        this.b = new AtomicReference<>(null);
    }
}
