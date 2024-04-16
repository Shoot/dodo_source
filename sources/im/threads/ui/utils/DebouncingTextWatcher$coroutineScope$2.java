package im.threads.ui.utils;

import android.view.View;
import androidx.lifecycle.d;
import im.threads.ui.extensions.UiExtensionsKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: DebouncingTextWatcher.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lip5;", "invoke", "()Lip5;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes3.dex */
final class DebouncingTextWatcher$coroutineScope$2 extends ej5 implements Function0<ip5> {
    final /* synthetic */ WeakReference<View> $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebouncingTextWatcher$coroutineScope$2(WeakReference<View> weakReference) {
        super(0);
        this.$view = weakReference;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ip5 invoke() {
        d lifecycle;
        View view = this.$view.get();
        if (view == null || (lifecycle = UiExtensionsKt.lifecycle(view)) == null) {
            return null;
        }
        return lp5.a(lifecycle);
    }
}
