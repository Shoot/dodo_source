package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.R;
/* compiled from: AutoCompleteTextView.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0003H\u0014J\b\u0010\t\u001a\u00020\u0003H\u0014J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0018\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010$¨\u0006("}, d2 = {"Lt00;", "Landroid/widget/FrameLayout;", "Lr00;", "", "g", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "i", "onAttachedToWindow", "onDetachedFromWindow", "", "Lss3;", "items", "setItems", "", "text", "setText", DateTokenConverter.CONVERTER_KEY, "", "enabled", "setInputEnabled", "b", c.a, "Lls3;", "presenter", "a", "La63;", "La63;", "getInputText", "()La63;", "setInputText", "(La63;)V", "inputText", "Lq00;", "Lq00;", "Lp00;", "Lp00;", "adapter", "<init>", "(Landroid/content/Context;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: t00  reason: default package */
/* loaded from: classes4.dex */
public final class t00 extends FrameLayout implements r00 {
    public a63 a;
    private q00 b;
    private p00 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoCompleteTextView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: t00$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends m94 implements Function1<String, Unit> {
        a(Object obj) {
            super(1, obj, q00.class, "changeText", "changeText(Ljava/lang/String;)V", 0);
        }

        public final void b(String str) {
            z65.h(str, "p0");
            ((q00) this.receiver).s(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            b(str);
            return Unit.a;
        }
    }

    /* compiled from: AutoCompleteTextView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"t00$b", "Lnma;", "Landroid/view/View;", "v", "", DateTokenConverter.CONVERTER_KEY, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t00$b */
    /* loaded from: classes4.dex */
    public static final class b extends nma {
        b() {
        }

        @Override // defpackage.nma
        public void d(View view) {
            z65.h(view, "v");
            q00 q00Var = t00.this.b;
            if (q00Var == null) {
                z65.z("presenter");
                q00Var = null;
            }
            q00Var.t();
            t00.this.getInputText().requestFocus();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t00(Context context) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        i(context);
    }

    private final void g() {
        Context context = getContext();
        z65.g(context, "getContext(...)");
        this.c = new p00(context, R.layout.address_dropdown, R.id.item, new ArrayList());
        getInputText().setAdapter(this.c);
        AutoCompleteTextView editText = getInputText().getEditText();
        z65.g(editText, "getEditText(...)");
        q00 q00Var = this.b;
        if (q00Var == null) {
            z65.z("presenter");
            q00Var = null;
        }
        e97.a(editText, new a(q00Var));
        getInputText().setOnClearListener(new b());
        getInputText().getEditText().setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: s00
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                t00.h(t00.this, adapterView, view, i, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(t00 t00Var, AdapterView adapterView, View view, int i, long j) {
        ss3 ss3Var;
        z65.h(t00Var, "this$0");
        p00 p00Var = t00Var.c;
        if (p00Var != null && (ss3Var = (ss3) p00Var.getItem(i)) != null) {
            q00 q00Var = t00Var.b;
            if (q00Var == null) {
                z65.z("presenter");
                q00Var = null;
            }
            q00Var.v(ss3Var);
        }
    }

    @Override // defpackage.us3
    public void a(ls3 ls3Var) {
        z65.h(ls3Var, "presenter");
        if (ls3Var instanceof q00) {
            this.b = (q00) ls3Var;
        }
    }

    @Override // defpackage.us3
    public void b() {
        Context context = getContext();
        q00 q00Var = null;
        if (context != null) {
            a63 inputText = getInputText();
            q00 q00Var2 = this.b;
            if (q00Var2 == null) {
                z65.z("presenter");
                q00Var2 = null;
            }
            inputText.setHint(context.getString(q00Var2.c().b()));
        }
        q00 q00Var3 = this.b;
        if (q00Var3 == null) {
            z65.z("presenter");
            q00Var3 = null;
        }
        if (q00Var3.c().a()) {
            AutoCompleteTextView editText = getInputText().getEditText();
            z65.g(editText, "getEditText(...)");
            gg5.d(editText);
        }
        q00 q00Var4 = this.b;
        if (q00Var4 == null) {
            z65.z("presenter");
        } else {
            q00Var = q00Var4;
        }
        if (q00Var.c().f()) {
            getInputText().setIsShowClearButton(true);
        }
    }

    @Override // defpackage.us3
    public void c() {
        getInputText().requestFocus();
    }

    @Override // defpackage.r00
    public void d() {
        getInputText().setText("");
    }

    public final a63 getInputText() {
        a63 a63Var = this.a;
        if (a63Var != null) {
            return a63Var;
        }
        z65.z("inputText");
        return null;
    }

    public final void i(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        setInputText(new a63(context, null));
        addView(getInputText());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        q00 q00Var = this.b;
        if (q00Var == null) {
            z65.z("presenter");
            q00Var = null;
        }
        q00Var.i(this);
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q00 q00Var = this.b;
        if (q00Var == null) {
            z65.z("presenter");
            q00Var = null;
        }
        q00Var.k();
    }

    @Override // defpackage.r00
    public void setInputEnabled(boolean z) {
        getInputText().setEnabled(z);
    }

    public final void setInputText(a63 a63Var) {
        z65.h(a63Var, "<set-?>");
        this.a = a63Var;
    }

    @Override // defpackage.r00
    public void setItems(List<? extends ss3> list) {
        z65.h(list, "items");
        p00 p00Var = this.c;
        if (p00Var != null) {
            p00Var.b(list);
        }
    }

    @Override // defpackage.r00
    public void setText(String str) {
        z65.h(str, "text");
        getInputText().setText(str);
    }
}
