package defpackage;

import android.view.ViewTreeObserver;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: ListenerWithState.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R+\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Llr5;", "", "", "isKeyboardVisible", "", "a", "", "toString", "", "hashCode", "other", "equals", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", c.a, "()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "layoutListener", "Ljg5;", "b", "Ljg5;", "()Ljg5;", "keyboardListener", "<set-?>", "Ll79;", DateTokenConverter.CONVERTER_KEY, "()Z", e.a, "(Z)V", "state", "<init>", "(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Ljg5;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lr5  reason: default package */
/* loaded from: classes4.dex */
public final class lr5 {
    static final /* synthetic */ je5<Object>[] d = {bc9.d(new wq6(lr5.class, "state", "getState()Z", 0))};
    private final ViewTreeObserver.OnGlobalLayoutListener a;
    private final jg5 b;
    private final l79 c;

    /* compiled from: Delegates.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"lr5$a", "La67;", "Lje5;", "property", "oldValue", "newValue", "", c.a, "(Lje5;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lr5$a */
    /* loaded from: classes4.dex */
    public static final class a extends a67<Boolean> {
        final /* synthetic */ lr5 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, lr5 lr5Var) {
            super(obj);
            this.b = lr5Var;
        }

        @Override // defpackage.a67
        protected void c(je5<?> je5Var, Boolean bool, Boolean bool2) {
            z65.h(je5Var, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            this.b.b().a(booleanValue);
        }
    }

    public lr5(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, jg5 jg5Var) {
        z65.h(onGlobalLayoutListener, "layoutListener");
        z65.h(jg5Var, "keyboardListener");
        this.a = onGlobalLayoutListener;
        this.b = jg5Var;
        cu2 cu2Var = cu2.a;
        this.c = new a(Boolean.FALSE, this);
    }

    private final boolean d() {
        return ((Boolean) this.c.a(this, d[0])).booleanValue();
    }

    private final void e(boolean z) {
        this.c.b(this, d[0], Boolean.valueOf(z));
    }

    public final void a(boolean z) {
        if (d() != z) {
            e(z);
        }
    }

    public final jg5 b() {
        return this.b;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr5)) {
            return false;
        }
        lr5 lr5Var = (lr5) obj;
        if (z65.c(this.a, lr5Var.a) && z65.c(this.b, lr5Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.a;
        jg5 jg5Var = this.b;
        return "ListenerWithState(layoutListener=" + onGlobalLayoutListener + ", keyboardListener=" + jg5Var + ")";
    }
}
