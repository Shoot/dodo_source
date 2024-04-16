package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent;
/* compiled from: SelectPizzeriaFragmentCheckoutWrapper.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lv7a;", "Lc70;", "Lw50;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "onBackPressed", "Ly7a;", Image.TYPE_HIGH, "Ly7a;", "sh", "()Ly7a;", "setSelectPizzeriaFragmentProvider", "(Ly7a;)V", "selectPizzeriaFragmentProvider", "<init>", "()V", "i", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: v7a  reason: default package */
/* loaded from: classes4.dex */
public final class v7a extends c70 implements w50 {
    public static final a i = new a(null);
    public y7a h;

    /* compiled from: SelectPizzeriaFragmentCheckoutWrapper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lv7a$a;", "", "Lg9a;", "data", "Lv7a;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: v7a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v7a a(g9a g9aVar) {
            z65.h(g9aVar, "data");
            return (v7a) y64.d(d70.a(new v7a(), false), bi0.c(bi0.d("extra_key_data", g9aVar)));
        }
    }

    public v7a() {
        super(R.layout.fragment_host);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        ((CheckoutComponent) getComponentDependenciesRegistry().a(bc9.b(CheckoutComponent.class))).R1().a(this);
        super.onAttach(context);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        Object obj;
        List<Fragment> y0 = getChildFragmentManager().y0();
        z65.g(y0, "getFragments(...)");
        Iterator<T> it = y0.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Fragment) obj) instanceof w50) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != null) {
            return ((w50) fragment).onBackPressed();
        }
        return false;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        if (getChildFragmentManager().y0().isEmpty()) {
            y7a sh = sh();
            Bundle arguments = getArguments();
            Object obj = (arguments == null || (obj = arguments.get("extra_key_data")) == null) ? null : null;
            if (obj != null && !(obj instanceof g9a)) {
                throw new ClassCastException("Property extra_key_data has different class type");
            } else if (obj != null) {
                getChildFragmentManager().p().b(R.id.fragment_container, sh.a((g9a) obj)).k();
            } else {
                throw new IllegalArgumentException("Argument with key = extra_key_data not found in bundle");
            }
        }
        ph();
    }

    public final y7a sh() {
        y7a y7aVar = this.h;
        if (y7aVar != null) {
            return y7aVar;
        }
        z65.z("selectPizzeriaFragmentProvider");
        return null;
    }
}
