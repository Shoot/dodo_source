package defpackage;

import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: CommandBuffer.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u001d\u0010\n\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Ljj1;", "Ldv6;", "Lcv6;", "navigator", "", "a", "b", "", "Lhj1;", "commands", DateTokenConverter.CONVERTER_KEY, "([Lhj1;)V", "Lcv6;", "", "Ljava/util/List;", "pendingCommands", "Landroid/os/Handler;", c.a, "Landroid/os/Handler;", "mainHandler", "<init>", "()V", "cicerone"}, k = 1, mv = {1, 5, 1})
/* renamed from: jj1  reason: default package */
/* loaded from: classes2.dex */
public final class jj1 implements dv6 {
    private cv6 a;
    private final List<hj1[]> b = new ArrayList();
    private final Handler c = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(jj1 jj1Var, hj1[] hj1VarArr) {
        Unit unit;
        z65.h(jj1Var, "this$0");
        z65.h(hj1VarArr, "$commands");
        cv6 cv6Var = jj1Var.a;
        if (cv6Var == null) {
            unit = null;
        } else {
            cv6Var.a(hj1VarArr);
            unit = Unit.a;
        }
        if (unit == null) {
            jj1Var.b.add(hj1VarArr);
        }
    }

    @Override // defpackage.dv6
    public void a(cv6 cv6Var) {
        z65.h(cv6Var, "navigator");
        this.a = cv6Var;
        for (hj1[] hj1VarArr : this.b) {
            cv6Var.a(hj1VarArr);
        }
        this.b.clear();
    }

    @Override // defpackage.dv6
    public void b() {
        this.a = null;
    }

    public final void d(final hj1[] hj1VarArr) {
        z65.h(hj1VarArr, "commands");
        this.c.post(new Runnable() { // from class: ij1
            @Override // java.lang.Runnable
            public final void run() {
                jj1.e(jj1.this, hj1VarArr);
            }
        });
    }
}
