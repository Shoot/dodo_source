package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.p;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.d;
/* compiled from: DeliveryLocationDetailsFragmentCheckoutWrapper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lqx2;", "Lc70;", "Lw50;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "onBackPressed", "<init>", "()V", Image.TYPE_HIGH, "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: qx2  reason: default package */
/* loaded from: classes4.dex */
public final class qx2 extends c70 implements w50 {
    public static final a h = new a(null);

    /* compiled from: DeliveryLocationDetailsFragmentCheckoutWrapper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lqx2$a;", "", "Lrx2;", "data", "Lqx2;", "a", "", "EXTRA_KEY_ARGUMENTS", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qx2$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qx2 a(rx2 rx2Var) {
            z65.h(rx2Var, "data");
            return (qx2) y64.d(d70.a(new qx2(), false), bi0.c(bi0.d("extra_key_arguments", rx2Var)));
        }
    }

    public qx2() {
        super(R.layout.fragment_host);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        return x50.a(this);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        if (getChildFragmentManager().y0().isEmpty()) {
            p p = getChildFragmentManager().p();
            d.a aVar = d.m;
            Bundle arguments = getArguments();
            Object obj = (arguments == null || (obj = arguments.get("extra_key_arguments")) == null) ? null : null;
            if (obj != null && !(obj instanceof rx2)) {
                throw new ClassCastException("Property extra_key_arguments has different class type");
            } else if (obj != null) {
                p.b(R.id.fragment_container, aVar.a((rx2) obj)).k();
            } else {
                throw new IllegalArgumentException("Argument with key = extra_key_arguments not found in bundle");
            }
        }
        ph();
    }
}
