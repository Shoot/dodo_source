package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: InputMethodManager.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Ls35;", "Lr35;", "Landroid/view/View;", "a", "Landroid/view/View;", "view", "Landroid/view/inputmethod/InputMethodManager;", "b", "Lrn5;", "getImm", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "Liqa;", c.a, "Liqa;", "softwareKeyboardControllerCompat", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: s35  reason: default package */
/* loaded from: classes.dex */
public final class s35 implements r35 {
    private final View a;
    private final rn5 b;
    private final iqa c;

    /* compiled from: InputMethodManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/InputMethodManager;", "a", "()Landroid/view/inputmethod/InputMethodManager;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: s35$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<InputMethodManager> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InputMethodManager invoke() {
            Object systemService = s35.this.a.getContext().getSystemService("input_method");
            z65.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public s35(View view) {
        rn5 a2;
        z65.h(view, "view");
        this.a = view;
        a2 = yn5.a(fo5.c, new a());
        this.b = a2;
        this.c = new iqa(view);
    }
}
