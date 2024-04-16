package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import androidx.annotation.NonNull;
/* compiled from: MenuPresenter.java */
/* loaded from: classes.dex */
public interface j {

    /* compiled from: MenuPresenter.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(@NonNull e eVar, boolean z);

        boolean b(@NonNull e eVar);
    }

    void a(e eVar, boolean z);

    boolean d(e eVar, g gVar);

    void e(a aVar);

    void f(Parcelable parcelable);

    boolean g(m mVar);

    int getId();

    Parcelable h();

    void i(boolean z);

    boolean j();

    boolean k(e eVar, g gVar);

    void l(Context context, e eVar);
}
