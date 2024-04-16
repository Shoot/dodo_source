package defpackage;

import android.os.Bundle;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.savedstate.a;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: SavedStateHandleSupport.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u001a"}, d2 = {"Ljt9;", "Landroidx/savedstate/a$c;", "Landroid/os/Bundle;", "a", "", DateTokenConverter.CONVERTER_KEY, "", Action.KEY_ATTRIBUTE, "b", "Landroidx/savedstate/a;", "Landroidx/savedstate/a;", "savedStateRegistry", "", "Z", "restored", c.a, "Landroid/os/Bundle;", "restoredState", "Lkt9;", "Lrn5;", "()Lkt9;", "viewModel", "Lvzb;", "viewModelStoreOwner", "<init>", "(Landroidx/savedstate/a;Lvzb;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jt9  reason: default package */
/* loaded from: classes.dex */
public final class jt9 implements a.c {
    private final androidx.savedstate.a a;
    private boolean b;
    private Bundle c;
    private final rn5 d;

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkt9;", "a", "()Lkt9;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: jt9$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<kt9> {
        final /* synthetic */ vzb a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(vzb vzbVar) {
            super(0);
            this.a = vzbVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final kt9 invoke() {
            return o.e(this.a);
        }
    }

    public jt9(androidx.savedstate.a aVar, vzb vzbVar) {
        rn5 b;
        z65.h(aVar, "savedStateRegistry");
        z65.h(vzbVar, "viewModelStoreOwner");
        this.a = aVar;
        b = yn5.b(new a(vzbVar));
        this.d = b;
    }

    private final kt9 c() {
        return (kt9) this.d.getValue();
    }

    @Override // androidx.savedstate.a.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, n> entry : c().f().entrySet()) {
            String key = entry.getKey();
            Bundle a2 = entry.getValue().c().a();
            if (!z65.c(a2, Bundle.EMPTY)) {
                bundle.putBundle(key, a2);
            }
        }
        this.b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        Bundle bundle;
        z65.h(str, Action.KEY_ATTRIBUTE);
        d();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(str);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.c = null;
        }
        return bundle;
    }

    public final void d() {
        if (!this.b) {
            Bundle b = this.a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (b != null) {
                bundle.putAll(b);
            }
            this.c = bundle;
            this.b = true;
            c();
        }
    }
}
