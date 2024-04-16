package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bv2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: AddAddressAutoFormFragmentCheckoutWrapper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lp6;", "Lc70;", "Lw50;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "onBackPressed", "<init>", "()V", Image.TYPE_HIGH, "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: p6  reason: default package */
/* loaded from: classes4.dex */
public final class p6 extends c70 implements w50 {
    public static final a h = new a(null);

    /* compiled from: AddAddressAutoFormFragmentCheckoutWrapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lp6$a;", "", "Lq6;", "data", "Lp6;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: p6$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p6 a(q6 q6Var) {
            z65.h(q6Var, "data");
            return (p6) y64.d(d70.a(new p6(), false), bi0.c(bi0.d("extra_is_from_new_checkout", Boolean.valueOf(q6Var.b())), bi0.d("extra_key_source", q6Var.a())));
        }
    }

    public p6() {
        super(R.layout.fragment_host);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        Object b0;
        List<Fragment> y0 = getChildFragmentManager().y0();
        z65.g(y0, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : y0) {
            if (obj instanceof w50) {
                arrayList.add(obj);
            }
        }
        b0 = sc1.b0(arrayList);
        w50 w50Var = (w50) b0;
        if (w50Var != null) {
            return w50Var.onBackPressed();
        }
        return false;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Object obj2;
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        if (getChildFragmentManager().y0().isEmpty()) {
            p p = getChildFragmentManager().p();
            bv2.c cVar = bv2.k;
            Bundle arguments = getArguments();
            s6 s6Var = null;
            if (arguments == null || (obj = arguments.get("extra_is_from_new_checkout")) == null) {
                obj = null;
            }
            if (obj != null && !(obj instanceof Boolean)) {
                throw new ClassCastException("Property extra_is_from_new_checkout has different class type");
            } else if (obj != null) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Bundle arguments2 = getArguments();
                if (arguments2 != null && (obj2 = arguments2.get("extra_key_source")) != null) {
                    s6Var = obj2;
                }
                if (s6Var != null && !(s6Var instanceof s6)) {
                    throw new ClassCastException("Property extra_key_source has different class type");
                } else if (s6Var != null) {
                    p.b(R.id.fragment_container, cVar.a(new q6(booleanValue, s6Var))).k();
                } else {
                    throw new IllegalArgumentException("Argument with key = extra_key_source not found in bundle");
                }
            } else {
                throw new IllegalArgumentException("Argument with key = extra_is_from_new_checkout not found in bundle");
            }
        }
        ph();
    }
}
