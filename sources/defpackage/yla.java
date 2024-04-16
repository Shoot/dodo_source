package defpackage;

import android.content.Context;
import android.widget.EditText;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.dodopizza.android.view.custom.textview.DodoInputText;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: SimpleTextView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0014J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0018"}, d2 = {"Lyla;", "Landroid/widget/FrameLayout;", "Lxla;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", e.a, "onAttachedToWindow", "onDetachedFromWindow", "", "text", "setText", "b", c.a, "Lls3;", "presenter", "a", "Lcom/dodopizza/android/view/custom/textview/DodoInputText;", "Lcom/dodopizza/android/view/custom/textview/DodoInputText;", "inputText", "Lwla;", "Lwla;", "<init>", "(Landroid/content/Context;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: yla  reason: default package */
/* loaded from: classes4.dex */
public final class yla extends FrameLayout implements xla {
    private DodoInputText a;
    private wla b;

    /* compiled from: SimpleTextView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yla$a */
    /* loaded from: classes4.dex */
    /* synthetic */ class a extends m94 implements Function1<String, Unit> {
        a(Object obj) {
            super(1, obj, wla.class, "changeText", "changeText(Ljava/lang/String;)V", 0);
        }

        public final void b(String str) {
            z65.h(str, "p0");
            ((wla) this.receiver).s(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            b(str);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yla(Context context) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        e(context);
    }

    @Override // defpackage.us3
    public void a(ls3 ls3Var) {
        z65.h(ls3Var, "presenter");
        if (ls3Var instanceof wla) {
            this.b = (wla) ls3Var;
        }
    }

    @Override // defpackage.us3
    public void b() {
        Context context = getContext();
        if (context != null) {
            DodoInputText dodoInputText = this.a;
            wla wlaVar = null;
            if (dodoInputText == null) {
                z65.z("inputText");
                dodoInputText = null;
            }
            wla wlaVar2 = this.b;
            if (wlaVar2 == null) {
                z65.z("presenter");
            } else {
                wlaVar = wlaVar2;
            }
            dodoInputText.setHint(context.getString(wlaVar.c().b()));
        }
    }

    @Override // defpackage.us3
    public void c() {
        DodoInputText dodoInputText = this.a;
        if (dodoInputText == null) {
            z65.z("inputText");
            dodoInputText = null;
        }
        dodoInputText.requestFocus();
    }

    public final void e(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        DodoInputText dodoInputText = new DodoInputText(context, null);
        this.a = dodoInputText;
        addView(dodoInputText);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        wla wlaVar = this.b;
        wla wlaVar2 = null;
        if (wlaVar == null) {
            z65.z("presenter");
            wlaVar = null;
        }
        wlaVar.i(this);
        DodoInputText dodoInputText = this.a;
        if (dodoInputText == null) {
            z65.z("inputText");
            dodoInputText = null;
        }
        EditText editText = dodoInputText.getEditText();
        z65.g(editText, "getEditText(...)");
        wla wlaVar3 = this.b;
        if (wlaVar3 == null) {
            z65.z("presenter");
        } else {
            wlaVar2 = wlaVar3;
        }
        e97.a(editText, new a(wlaVar2));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wla wlaVar = this.b;
        if (wlaVar == null) {
            z65.z("presenter");
            wlaVar = null;
        }
        wlaVar.k();
    }

    @Override // defpackage.xla
    public void setText(String str) {
        z65.h(str, "text");
        DodoInputText dodoInputText = this.a;
        if (dodoInputText == null) {
            z65.z("inputText");
            dodoInputText = null;
        }
        dodoInputText.setText(str);
    }
}
