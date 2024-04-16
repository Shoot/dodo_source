package defpackage;

import androidx.annotation.NonNull;
import defpackage.cr7;
import defpackage.s86;
import defpackage.w86;
import defpackage.y86;
import defpackage.z86;
/* compiled from: MarkwonPlugin.java */
/* renamed from: v86  reason: default package */
/* loaded from: classes3.dex */
public interface v86 {

    /* compiled from: MarkwonPlugin.java */
    /* renamed from: v86$a */
    /* loaded from: classes3.dex */
    public interface a<P extends v86> {
        void apply(@NonNull P p);
    }

    /* compiled from: MarkwonPlugin.java */
    /* renamed from: v86$b */
    /* loaded from: classes3.dex */
    public interface b {
        <P extends v86> void a(@NonNull Class<P> cls, @NonNull a<? super P> aVar);
    }

    void afterRender(@NonNull jz6 jz6Var, @NonNull z86 z86Var);

    void beforeRender(@NonNull jz6 jz6Var);

    void configure(@NonNull b bVar);

    void configureConfiguration(@NonNull s86.b bVar);

    void configureParser(@NonNull cr7.a aVar);

    void configureSpansFactory(@NonNull w86.a aVar);

    void configureTheme(@NonNull y86.a aVar);

    void configureVisitor(@NonNull z86.b bVar);

    @NonNull
    String processMarkdown(@NonNull String str);
}
