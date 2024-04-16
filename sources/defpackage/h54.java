package defpackage;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.formbuilder.impl.FormController;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FormBuilder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\u0018\b\u0002\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001d\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\u0002R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u000f\u0010\u0013R2\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u0017\u0010\u001b¨\u0006\u001f"}, d2 = {"Lh54;", "", "Le54;", "a", "Lkotlin/Function1;", "", "fieldPopulator", "b", "Lj54;", "Lj54;", "creator", "Ln54;", "Ln54;", "formInflater", "Landroid/view/View;", c.a, "Landroid/view/View;", "getContainer", "()Landroid/view/View;", "(Landroid/view/View;)V", "container", "", "Lcom/dodopizza/formbuilder/impl/ReadyToSubmit;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function1;", "getOnReadyToSubmit", "()Lkotlin/jvm/functions/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "onReadyToSubmit", "<init>", "(Lj54;Ln54;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h54  reason: default package */
/* loaded from: classes.dex */
public final class h54 {
    private j54 a;
    private n54 b;
    private View c;
    private Function1<? super Boolean, Unit> d;

    public h54(j54 j54Var, n54 n54Var, View view, Function1<? super Boolean, Unit> function1) {
        z65.h(j54Var, "creator");
        z65.h(n54Var, "formInflater");
        z65.h(function1, "onReadyToSubmit");
        this.a = j54Var;
        this.b = n54Var;
        this.c = view;
        this.d = function1;
    }

    public final e54 a() {
        vp2 a = this.a.a();
        View view = this.c;
        if (view != null) {
            this.b.a(view, a);
        }
        FormController formController = new FormController(a, new wp2(a));
        formController.f(this.d);
        return formController;
    }

    public final e54 b(Function1<? super h54, Unit> function1) {
        z65.h(function1, "fieldPopulator");
        function1.invoke(this);
        return a();
    }

    public final void c(View view) {
        this.c = view;
    }

    public final void d(Function1<? super Boolean, Unit> function1) {
        z65.h(function1, "<set-?>");
        this.d = function1;
    }

    public /* synthetic */ h54(j54 j54Var, n54 n54Var, View view, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j54Var, (i & 2) != 0 ? new dq5() : n54Var, (i & 4) != 0 ? null : view, (i & 8) != 0 ? e07.a : function1);
    }
}
