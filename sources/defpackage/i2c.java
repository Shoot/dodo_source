package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.volley.e;
import defpackage.a33;
import java.io.File;
/* compiled from: Volley.java */
/* renamed from: i2c  reason: default package */
/* loaded from: classes.dex */
public class i2c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Volley.java */
    /* renamed from: i2c$a */
    /* loaded from: classes.dex */
    public class a implements a33.c {
        private File a = null;
        final /* synthetic */ Context b;

        a(Context context) {
            this.b = context;
        }

        @Override // defpackage.a33.c
        public File get() {
            if (this.a == null) {
                this.a = new File(this.b.getCacheDir(), "volley");
            }
            return this.a;
        }
    }

    @NonNull
    public static e a(Context context) {
        return b(context, null);
    }

    @NonNull
    public static e b(Context context, n70 n70Var) {
        n90 n90Var;
        if (n70Var == null) {
            n90Var = new n90(new br4());
        } else {
            n90Var = new n90(n70Var);
        }
        return c(context, n90Var);
    }

    @NonNull
    private static e c(Context context, sv6 sv6Var) {
        e eVar = new e(new a33(new a(context.getApplicationContext())), sv6Var);
        eVar.h();
        return eVar;
    }
}
