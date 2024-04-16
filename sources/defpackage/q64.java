package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PermissionImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001b\u0010\f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lq64;", "Loy7;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lp64;", DateTokenConverter.CONVERTER_KEY, e.a, "Lny7;", "a", "Lrn5;", "f", "()Lp64;", "permissionFragmentImplementation", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "b", "permissions_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: q64  reason: default package */
/* loaded from: classes2.dex */
public final class q64 implements oy7 {
    public static final a b = new a(null);
    private final rn5 a;

    /* compiled from: PermissionImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lq64$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "permissions_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: q64$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PermissionImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp64;", "a", "()Lp64;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: q64$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function0<p64> {
        final /* synthetic */ FragmentManager b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FragmentManager fragmentManager) {
            super(0);
            this.b = fragmentManager;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final p64 invoke() {
            p64 e = q64.this.e(this.b);
            if (e == null) {
                return q64.this.d(this.b);
            }
            return e;
        }
    }

    public q64(FragmentManager fragmentManager) {
        rn5 b2;
        z65.h(fragmentManager, "fragmentManager");
        b2 = yn5.b(new b(fragmentManager));
        this.a = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p64 d(FragmentManager fragmentManager) {
        p64 p64Var = new p64();
        fragmentManager.p().f(p64Var, "FragmentPermissionImplementation").m();
        return p64Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p64 e(FragmentManager fragmentManager) {
        Fragment l0 = fragmentManager.l0("FragmentPermissionImplementation");
        if (l0 instanceof p64) {
            return (p64) l0;
        }
        return null;
    }

    private final p64 f() {
        return (p64) this.a.getValue();
    }

    @Override // defpackage.oy7
    public ny7 a() {
        return f();
    }
}
