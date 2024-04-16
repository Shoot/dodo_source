package defpackage;

import android.text.style.StrikethroughSpan;
import androidx.annotation.NonNull;
import defpackage.cr7;
import defpackage.w86;
import defpackage.z86;
import java.util.Collections;
/* compiled from: StrikethroughPlugin.java */
/* renamed from: mza  reason: default package */
/* loaded from: classes3.dex */
public class mza extends s1 {

    /* compiled from: StrikethroughPlugin.java */
    /* renamed from: mza$a */
    /* loaded from: classes3.dex */
    class a implements tqa {
        a() {
        }

        @Override // defpackage.tqa
        public Object a(@NonNull s86 s86Var, @NonNull dg9 dg9Var) {
            return new StrikethroughSpan();
        }
    }

    /* compiled from: StrikethroughPlugin.java */
    /* renamed from: mza$b */
    /* loaded from: classes3.dex */
    class b implements z86.c<jza> {
        b() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull jza jzaVar) {
            int length = z86Var.length();
            z86Var.n(jzaVar);
            z86Var.v(jzaVar, length);
        }
    }

    @NonNull
    public static mza a() {
        return new mza();
    }

    @Override // defpackage.s1, defpackage.v86
    public void configureParser(@NonNull cr7.a aVar) {
        aVar.h(Collections.singleton(lza.b()));
    }

    @Override // defpackage.s1, defpackage.v86
    public void configureSpansFactory(@NonNull w86.a aVar) {
        aVar.b(jza.class, new a());
    }

    @Override // defpackage.s1, defpackage.v86
    public void configureVisitor(@NonNull z86.b bVar) {
        bVar.b(jza.class, new b());
    }
}
