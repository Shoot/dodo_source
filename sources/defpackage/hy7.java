package defpackage;

import android.app.Activity;
import android.os.Looper;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: PermissionCheckerImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lhy7;", "Lfy7;", "Lmy7;", "", "permission", "Lry7;", e.a, "Landroid/app/Activity;", "activity", "", c.a, "b", "a", "Landroid/app/Activity;", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hy7  reason: default package */
/* loaded from: classes4.dex */
public final class hy7 implements fy7, my7 {
    private Activity a;

    /* compiled from: PermissionCheckerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lry7;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.infrastracture.utils.PermissionCheckerImpl$getPermissionStatus$1", f = "PermissionCheckerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hy7$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super ry7>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super ry7> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return hy7.this.e(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ry7 e(String str) {
        ry7 Pb;
        Activity activity = this.a;
        if (activity == null || (Pb = ey7.P2.Pb(activity, str)) == null) {
            return ry7.DENIED;
        }
        return Pb;
    }

    @Override // defpackage.fy7
    public ry7 a(String str) {
        z65.h(str, "permission");
        if (z65.c(Looper.myLooper(), Looper.getMainLooper())) {
            return e(str);
        }
        return (ry7) qh0.e(v33.c(), new a(str, null));
    }

    @Override // defpackage.my7
    public void b(Activity activity) {
        z65.h(activity, "activity");
        if (z65.c(this.a, activity)) {
            this.a = null;
        }
    }

    @Override // defpackage.my7
    public void c(Activity activity) {
        z65.h(activity, "activity");
        this.a = activity;
    }
}
