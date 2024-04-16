package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CommonDialog.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 #2\u00020\u0001:\u0002$\u0014B\u0007¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u001c¨\u0006%"}, d2 = {"Ltj1;", "Landroidx/fragment/app/c;", "", "html", "Landroid/text/Spanned;", "gh", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroid/widget/TextView;", "b", "Lk79;", "jh", "()Landroid/widget/TextView;", "tvText", "Landroid/widget/Button;", com.huawei.hms.opendevice.c.a, "hh", "()Landroid/widget/Button;", "btnCancel", DateTokenConverter.CONVERTER_KEY, "ih", "btnConfirm", "<init>", "()V", e.a, "a", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tj1  reason: default package */
/* loaded from: classes.dex */
public final class tj1 extends androidx.fragment.app.c {
    private final k79 b = kb0.e(this, vx8.p);
    private final k79 c = kb0.e(this, vx8.b);
    private final k79 d = kb0.e(this, vx8.confirm);
    static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(tj1.class, "tvText", "getTvText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tj1.class, "btnCancel", "getBtnCancel()Landroid/widget/Button;", 0)), bc9.f(new ar8(tj1.class, "btnConfirm", "getBtnConfirm()Landroid/widget/Button;", 0))};
    public static final b e = new b(null);

    /* compiled from: CommonDialog.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Ltj1$a;", "", "", "id", "", "O8", "onCancel", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: tj1$a */
    /* loaded from: classes.dex */
    public interface a {
        void O8(String str);

        void onCancel(String str);
    }

    /* compiled from: CommonDialog.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J4\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Ltj1$b;", "", "", "text", "cancelText", "confirmText", "resultId", "Ltj1;", "a", "", "cancelable", "b", "CANCEL", "Ljava/lang/String;", "CANCELABLE", "CONFIRM", "RESULT_ID", "TEXT", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: tj1$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final tj1 a(String str, String str2, String str3, String str4) {
            z65.h(str, "text");
            z65.h(str4, "resultId");
            return (tj1) y64.d(new tj1(), bi0.c(bi0.d("html", str), bi0.d("cancel", str2), bi0.d("confirm", str3), bi0.d("result_id", str4), bi0.d("cancelable", Boolean.TRUE)));
        }

        public final tj1 b(String str, String str2, String str3, String str4, boolean z) {
            z65.h(str, "text");
            z65.h(str4, "resultId");
            return (tj1) y64.d(new tj1(), bi0.c(bi0.d("html", str), bi0.d("cancel", str2), bi0.d("confirm", str3), bi0.d("result_id", str4), bi0.d("cancelable", Boolean.valueOf(z))));
        }
    }

    /* compiled from: CommonDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tj1$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.b = str;
        }

        public final void a(View view) {
            a aVar;
            z65.h(view, "it");
            tj1.this.dismiss();
            Fragment parentFragment = tj1.this.getParentFragment();
            if (parentFragment instanceof a) {
                aVar = (a) parentFragment;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.O8(this.b);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: CommonDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tj1$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.b = str;
        }

        public final void a(View view) {
            a aVar;
            z65.h(view, "it");
            tj1.this.dismiss();
            Fragment parentFragment = tj1.this.getParentFragment();
            if (parentFragment instanceof a) {
                aVar = (a) parentFragment;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.onCancel(this.b);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    private final Spanned gh(String str) {
        Spanned a2 = vp4.a(str, 0);
        z65.g(a2, "fromHtml(...)");
        return a2;
    }

    private final Button hh() {
        return (Button) this.c.a(this, f[1]);
    }

    private final Button ih() {
        return (Button) this.d.a(this, f[2]);
    }

    private final TextView jh() {
        return (TextView) this.b.a(this, f[0]);
    }

    @Override // androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        z65.g(onCreateDialog, "onCreateDialog(...)");
        onCreateDialog.requestWindowFeature(1);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        return layoutInflater.inflate(sz8.common_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Object obj2;
        Object obj3;
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str = "";
        String str2 = (arguments == null || (str2 = arguments.get("html")) == null) ? "" : "";
        if (str2 instanceof String) {
            Spanned gh = gh((String) str2);
            Bundle arguments2 = getArguments();
            String str3 = (arguments2 == null || (str3 = arguments2.get("cancel")) == null) ? "" : "";
            if (str3 instanceof String) {
                String str4 = (String) str3;
                Bundle arguments3 = getArguments();
                if (arguments3 != null && (obj3 = arguments3.get("confirm")) != null) {
                    str = obj3;
                }
                if (str instanceof String) {
                    String str5 = str;
                    Bundle arguments4 = getArguments();
                    Boolean bool = null;
                    if (arguments4 == null || (obj = arguments4.get("result_id")) == null) {
                        obj = null;
                    }
                    if (obj != null && !(obj instanceof String)) {
                        throw new ClassCastException("Property result_id has different class type");
                    } else if (obj != null) {
                        String str6 = (String) obj;
                        Bundle arguments5 = getArguments();
                        if (arguments5 != null && (obj2 = arguments5.get("cancelable")) != null) {
                            bool = obj2;
                        }
                        if (bool != null && !(bool instanceof Boolean)) {
                            throw new ClassCastException("Property cancelable has different class type");
                        } else if (bool != null) {
                            boolean booleanValue = bool.booleanValue();
                            jh().setText(gh);
                            if (str4.length() > 0) {
                                hh().setText(str4);
                            } else {
                                hh().setVisibility(8);
                            }
                            if (str5.length() > 0) {
                                ih().setText(str5);
                            } else {
                                ih().setVisibility(8);
                            }
                            oma.a(ih(), new c(str6));
                            oma.a(hh(), new d(str6));
                            setCancelable(booleanValue);
                            return;
                        } else {
                            throw new IllegalArgumentException("Argument with key = cancelable not found in bundle");
                        }
                    } else {
                        throw new IllegalArgumentException("Argument with key = result_id not found in bundle");
                    }
                }
                throw new ClassCastException("Property confirm has different class type");
            }
            throw new ClassCastException("Property cancel has different class type");
        }
        throw new ClassCastException("Property html has different class type");
    }
}
