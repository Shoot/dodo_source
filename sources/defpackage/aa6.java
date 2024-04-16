package defpackage;

import android.widget.Checkable;
import defpackage.aa6;
/* compiled from: MaterialCheckable.java */
/* renamed from: aa6  reason: default package */
/* loaded from: classes2.dex */
public interface aa6<T extends aa6<T>> extends Checkable {

    /* compiled from: MaterialCheckable.java */
    /* renamed from: aa6$a */
    /* loaded from: classes2.dex */
    public interface a<C> {
        void a(C c, boolean z);
    }

    int getId();

    void setInternalOnCheckedChangeListener(a<T> aVar);
}
