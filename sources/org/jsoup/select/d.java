package org.jsoup.select;
/* compiled from: NodeFilter.java */
/* loaded from: classes3.dex */
public interface d {

    /* compiled from: NodeFilter.java */
    /* loaded from: classes3.dex */
    public enum a {
        CONTINUE,
        SKIP_CHILDREN,
        SKIP_ENTIRELY,
        REMOVE,
        STOP
    }

    a a(kz6 kz6Var, int i);

    a b(kz6 kz6Var, int i);
}
