package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConstraintsCommandHandler.java */
/* loaded from: classes.dex */
public class c {
    private static final String e = nx5.f("ConstraintsCmdHandler");
    private final Context a;
    private final int b;
    private final e c;
    private final v6c d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(@NonNull Context context, int i, @NonNull e eVar) {
        this.a = context;
        this.b = i;
        this.c = eVar;
        this.d = new v6c(context, eVar.f(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        List<WorkSpec> d = this.c.g().t().M().d();
        ConstraintProxy.a(this.a, d);
        this.d.d(d);
        ArrayList<WorkSpec> arrayList = new ArrayList(d.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (WorkSpec workSpec : d) {
            String str = workSpec.a;
            if (currentTimeMillis >= workSpec.a() && (!workSpec.b() || this.d.c(str))) {
                arrayList.add(workSpec);
            }
        }
        for (WorkSpec workSpec2 : arrayList) {
            String str2 = workSpec2.a;
            Intent b = b.b(this.a, str2);
            nx5.c().a(e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.c;
            eVar.k(new e.b(eVar, b, this.b));
        }
        this.d.e();
    }
}
