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
/* compiled from: PizzeriaSuggestionDialogFragment.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Ll98;", "Lip6;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Lk79;", "jh", "()Landroid/widget/TextView;", "pizzeriaTitle", "Landroid/widget/Button;", e.a, "ih", "()Landroid/widget/Button;", "accept", "f", "kh", "()Landroid/view/View;", "reject", "Ly1b;", "g", "Ly1b;", "getListener", "()Ly1b;", "nh", "(Ly1b;)V", "listener", "<init>", "()V", Image.TYPE_HIGH, "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: l98  reason: default package */
/* loaded from: classes4.dex */
public final class l98 extends ip6 {
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private y1b g;
    static final /* synthetic */ je5<Object>[] i = {bc9.f(new ar8(l98.class, "pizzeriaTitle", "getPizzeriaTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(l98.class, "accept", "getAccept()Landroid/widget/Button;", 0)), bc9.f(new ar8(l98.class, "reject", "getReject()Landroid/view/View;", 0))};
    public static final a h = new a(null);

    /* compiled from: PizzeriaSuggestionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Ll98$a;", "", "", "address", "Ll98;", "a", "ADDRESS", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: l98$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l98 a(String str) {
            z65.h(str, "address");
            return (l98) y64.d(new l98(), bi0.c(bi0.d("address", str)));
        }
    }

    public l98() {
        super(R.layout.dialog_pizzeria_suggestion);
        this.d = kb0.e(this, R.id.pizzeria_title);
        this.e = kb0.e(this, R.id.accept);
        this.f = kb0.e(this, R.id.reject);
    }

    private final Button ih() {
        return (Button) this.e.a(this, i[1]);
    }

    private final TextView jh() {
        return (TextView) this.d.a(this, i[0]);
    }

    private final View kh() {
        return (View) this.f.a(this, i[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lh(l98 l98Var, View view) {
        z65.h(l98Var, "this$0");
        y1b y1bVar = l98Var.g;
        if (y1bVar != null) {
            y1bVar.b();
        }
        l98Var.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mh(l98 l98Var, View view) {
        z65.h(l98Var, "this$0");
        y1b y1bVar = l98Var.g;
        if (y1bVar != null) {
            y1bVar.a();
        }
        l98Var.dismiss();
    }

    public final void nh(y1b y1bVar) {
        this.g = y1bVar;
    }

    @Override // defpackage.ip6, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        TextView jh = jh();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("address")) == null) ? null : null;
        if (obj != null && !(obj instanceof CharSequence)) {
            throw new ClassCastException("Property address has different class type");
        } else if (obj != null) {
            jh.setText((CharSequence) obj);
            ih().setOnClickListener(new View.OnClickListener() { // from class: j98
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    l98.lh(l98.this, view2);
                }
            });
            kh().setOnClickListener(new View.OnClickListener() { // from class: k98
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    l98.mh(l98.this, view2);
                }
            });
        } else {
            throw new IllegalArgumentException("Argument with key = address not found in bundle");
        }
    }
}
