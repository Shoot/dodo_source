package ru.dodopizza.app.presentation.debugtools;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.huawei.hms.opendevice.c;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpAppCompatDialogFragment;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.debugtools.DebugPreferenceFragment;
/* compiled from: DebugFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0010J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u000f\u0010\u000f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lru/dodopizza/app/presentation/debugtools/a;", "Lmoxy/MvpAppCompatDialogFragment;", "Llm1;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "", "onActivityCreated", "hh", "()V", "gh", "Lkm1;", "b", "Lkm1;", "getComponentDependenciesRegistry", "()Lkm1;", "componentDependenciesRegistry", "<init>", c.a, "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class a extends MvpAppCompatDialogFragment implements lm1 {
    public static final C0563a c = new C0563a(null);
    private final km1 b = eu2.d(this);

    /* compiled from: DebugFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/debugtools/a$a;", "", "", "EXTRA_MODE", "Ljava/lang/String;", "<init>", "()V", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.debugtools.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0563a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DebugFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/debugtools/a$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.debugtools.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0564a {
            public static final EnumC0564a a = new EnumC0564a("DEFAULT", 0);
            public static final EnumC0564a b = new EnumC0564a("ENVIRONMENT", 1);
            public static final EnumC0564a c = new EnumC0564a("FEATURE_TOGGLE", 2);
            private static final /* synthetic */ EnumC0564a[] d;
            private static final /* synthetic */ kj3 e;

            static {
                EnumC0564a[] a2 = a();
                d = a2;
                e = lj3.a(a2);
            }

            private EnumC0564a(String str, int i) {
            }

            private static final /* synthetic */ EnumC0564a[] a() {
                return new EnumC0564a[]{a, b, c};
            }

            public static EnumC0564a valueOf(String str) {
                return (EnumC0564a) Enum.valueOf(EnumC0564a.class, str);
            }

            public static EnumC0564a[] values() {
                return (EnumC0564a[]) d.clone();
            }
        }

        private C0563a() {
        }

        public /* synthetic */ C0563a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.lm1
    public km1 getComponentDependenciesRegistry() {
        return this.b;
    }

    public final void gh() {
        requireActivity().getSupportFragmentManager().p().u(R.id.main_fragment_container, i13.c.a()).i("design-system").k();
        dismiss();
    }

    public final void hh() {
        BottomSheetBehavior B;
        Dialog requireDialog = requireDialog();
        z65.f(requireDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        View findViewById = ((com.google.android.material.bottomsheet.a) requireDialog).findViewById(R.id.design_bottom_sheet);
        if (findViewById != null && (B = BottomSheetBehavior.B(findViewById)) != null) {
            B.f0(3);
        }
        getChildFragmentManager().p().u(R.id.debug_fragment_container, new hib()).i(UUID.randomUUID().toString()).k();
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        p p = getChildFragmentManager().p();
        DebugPreferenceFragment.a aVar = DebugPreferenceFragment.x;
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("extra_mode")) == null) ? null : null;
        if (obj != null && !(obj instanceof C0563a.EnumC0564a)) {
            throw new ClassCastException("Property extra_mode has different class type");
        } else if (obj != null) {
            p.u(R.id.debug_fragment_container, aVar.a((C0563a.EnumC0564a) obj)).k();
        } else {
            throw new IllegalArgumentException("Argument with key = extra_mode not found in bundle");
        }
    }

    @Override // defpackage.kn, androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.debug_fragment, viewGroup, false);
    }
}
