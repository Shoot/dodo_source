package im.threads.business.extensions;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: MutableLazy.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lim/threads/business/extensions/MutableLazy;", "T", "Lrn5;", "", "reset", "", "isInitialized", "Lkotlin/Function0;", "initializer", "Lkotlin/jvm/functions/Function0;", "cached", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class MutableLazy<T> implements rn5<T> {
    private T cached;
    private final Function0<T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableLazy(Function0<? extends T> function0) {
        z65.h(function0, "initializer");
        this.initializer = function0;
    }

    @Override // defpackage.rn5
    public T getValue() {
        if (this.cached == null) {
            this.cached = this.initializer.invoke();
        }
        return this.cached;
    }

    @Override // defpackage.rn5
    public boolean isInitialized() {
        if (this.cached != null) {
            return true;
        }
        return false;
    }

    public final void reset() {
        this.cached = null;
    }
}
