package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: AuthorizationCantSendSmsDialog.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lyz;", "Ljn;", "Landroid/widget/TextView;", "a", "Lk79;", "b", "()Landroid/widget/TextView;", "closeButton", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", com.huawei.hms.opendevice.c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: yz  reason: default package */
/* loaded from: classes4.dex */
public final class yz extends jn {
    private final k79 a;
    static final /* synthetic */ je5<Object>[] c = {bc9.f(new ar8(yz.class, "closeButton", "getCloseButton()Landroid/widget/TextView;", 0))};
    public static final c b = new c(null);

    /* compiled from: AuthorizationCantSendSmsDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yz$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<View, Unit> {
        a() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            yz.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AuthorizationCantSendSmsDialog.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lyz$b;", "", "Lyz;", "a", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yz$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private final Context a;

        public b(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            this.a = context;
        }

        public final yz a() {
            return new yz(this.a);
        }
    }

    /* compiled from: AuthorizationCantSendSmsDialog.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lyz$c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lyz;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yz$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final yz a(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            return new b(context).a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz(Context context) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = kb0.b(this, R.id.close_button);
        setContentView(R.layout.authorization_cand_send_sms_layout);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        oma.a(b(), new a());
    }

    private final TextView b() {
        return (TextView) this.a.a(this, c[0]);
    }
}
