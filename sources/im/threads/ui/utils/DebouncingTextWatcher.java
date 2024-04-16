package im.threads.ui.utils;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import defpackage.l95;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: DebouncingTextWatcher.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B+\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b!\u0010\"J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\"\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lim/threads/ui/utils/DebouncingTextWatcher;", "Landroid/text/TextWatcher;", "", "p0", "", "p1", "p2", "p3", "", "beforeTextChanged", "onTextChanged", "Landroid/text/Editable;", "editable", "afterTextChanged", "Lkotlin/Function1;", "", "onDebouncingQueryTextChange", "Lkotlin/jvm/functions/Function1;", "", "debouncePeriod", "J", "Lip5;", "coroutineScope$delegate", "Lrn5;", "getCoroutineScope", "()Lip5;", "coroutineScope", "Ll95;", "textWatcherJob", "Ll95;", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "view", "<init>", "(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function1;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class DebouncingTextWatcher implements TextWatcher {
    private final rn5 coroutineScope$delegate;
    private long debouncePeriod;
    private final Function1<String, Unit> onDebouncingQueryTextChange;
    private l95 textWatcherJob;

    /* JADX WARN: Multi-variable type inference failed */
    public DebouncingTextWatcher(WeakReference<View> weakReference, Function1<? super String, Unit> function1) {
        rn5 b;
        z65.h(weakReference, "view");
        z65.h(function1, "onDebouncingQueryTextChange");
        this.onDebouncingQueryTextChange = function1;
        this.debouncePeriod = 500L;
        b = yn5.b(new DebouncingTextWatcher$coroutineScope$2(weakReference));
        this.coroutineScope$delegate = b;
    }

    private final ip5 getCoroutineScope() {
        return (ip5) this.coroutineScope$delegate.getValue();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        String str;
        if (editable != null) {
            str = editable.toString();
        } else {
            str = null;
        }
        l95 l95Var = this.textWatcherJob;
        if (l95Var != null) {
            l95.a.a(l95Var, null, 1, null);
        }
        ip5 coroutineScope = getCoroutineScope();
        this.textWatcherJob = coroutineScope != null ? sh0.d(coroutineScope, null, null, new DebouncingTextWatcher$afterTextChanged$1(str, this, null), 3, null) : null;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
