package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: DistanceToDeliveryAddressSuggestionFragment.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lv43;", "Lip6;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Lk79;", "kh", "()Landroid/widget/TextView;", "title", "Landroid/widget/Button;", e.a, "ih", "()Landroid/widget/Button;", "accept", "f", "jh", "reject", "Ly1b;", "g", "Ly1b;", "getListener", "()Ly1b;", "nh", "(Ly1b;)V", "listener", "<init>", "()V", Image.TYPE_HIGH, "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: v43  reason: default package */
/* loaded from: classes4.dex */
public final class v43 extends ip6 {
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private y1b g;
    static final /* synthetic */ je5<Object>[] i = {bc9.f(new ar8(v43.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(v43.class, "accept", "getAccept()Landroid/widget/Button;", 0)), bc9.f(new ar8(v43.class, "reject", "getReject()Landroid/widget/TextView;", 0))};
    public static final a h = new a(null);

    /* compiled from: DistanceToDeliveryAddressSuggestionFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lv43$a;", "", "", "address", "Lv43;", "a", "ADDRESS", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: v43$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v43 a(String str) {
            z65.h(str, "address");
            return (v43) y64.d(new v43(), bi0.c(bi0.d("address", str)));
        }
    }

    public v43() {
        super(R.layout.dialog_address_suggestion);
        this.d = kb0.e(this, R.id.address_title);
        this.e = kb0.e(this, R.id.accept);
        this.f = kb0.e(this, R.id.reject);
    }

    private final Button ih() {
        return (Button) this.e.a(this, i[1]);
    }

    private final TextView jh() {
        return (TextView) this.f.a(this, i[2]);
    }

    private final TextView kh() {
        return (TextView) this.d.a(this, i[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lh(v43 v43Var, View view) {
        z65.h(v43Var, "this$0");
        y1b y1bVar = v43Var.g;
        if (y1bVar != null) {
            y1bVar.b();
        }
        v43Var.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mh(v43 v43Var, View view) {
        z65.h(v43Var, "this$0");
        y1b y1bVar = v43Var.g;
        if (y1bVar != null) {
            y1bVar.a();
        }
        v43Var.dismissAllowingStateLoss();
    }

    public final void nh(y1b y1bVar) {
        this.g = y1bVar;
    }

    @Override // defpackage.ip6, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        TextView kh = kh();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("address")) == null) ? null : null;
        if (obj != null && !(obj instanceof CharSequence)) {
            throw new ClassCastException("Property address has different class type");
        } else if (obj != null) {
            kh.setText((CharSequence) obj);
            ih().setOnClickListener(new View.OnClickListener() { // from class: t43
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    v43.lh(v43.this, view2);
                }
            });
            jh().setOnClickListener(new View.OnClickListener() { // from class: u43
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    v43.mh(v43.this, view2);
                }
            });
        } else {
            throw new IllegalArgumentException("Argument with key = address not found in bundle");
        }
    }
}
