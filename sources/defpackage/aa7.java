package defpackage;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import defpackage.s7c;
/* compiled from: OneTimeWorkRequest.java */
/* renamed from: aa7  reason: default package */
/* loaded from: classes.dex */
public final class aa7 extends s7c {
    aa7(a aVar) {
        super(aVar.b, aVar.c, aVar.d);
    }

    @NonNull
    public static aa7 d(@NonNull Class<? extends ListenableWorker> cls) {
        return new a(cls).b();
    }

    /* compiled from: OneTimeWorkRequest.java */
    /* renamed from: aa7$a */
    /* loaded from: classes.dex */
    public static final class a extends s7c.a<a, aa7> {
        public a(@NonNull Class<? extends ListenableWorker> cls) {
            super(cls);
            this.c.d = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.s7c.a
        @NonNull
        /* renamed from: i */
        public aa7 c() {
            if (this.a && Build.VERSION.SDK_INT >= 23 && this.c.j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new aa7(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.s7c.a
        @NonNull
        /* renamed from: j */
        public a d() {
            return this;
        }
    }
}
