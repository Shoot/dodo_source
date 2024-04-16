package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.NonNull;
import defpackage.o34;
import defpackage.w34;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CallbackWithHandler.java */
/* renamed from: om0  reason: default package */
/* loaded from: classes.dex */
public class om0 {
    @NonNull
    private final w34.c a;
    @NonNull
    private final Handler b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CallbackWithHandler.java */
    /* renamed from: om0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ w34.c a;
        final /* synthetic */ Typeface b;

        a(w34.c cVar, Typeface typeface) {
            this.a = cVar;
            this.b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CallbackWithHandler.java */
    /* renamed from: om0$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ w34.c a;
        final /* synthetic */ int b;

        b(w34.c cVar, int i) {
            this.a = cVar;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public om0(@NonNull w34.c cVar, @NonNull Handler handler) {
        this.a = cVar;
        this.b = handler;
    }

    private void a(int i) {
        this.b.post(new b(this.a, i));
    }

    private void c(@NonNull Typeface typeface) {
        this.b.post(new a(this.a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(@NonNull o34.e eVar) {
        if (eVar.a()) {
            c(eVar.a);
        } else {
            a(eVar.b);
        }
    }
}
