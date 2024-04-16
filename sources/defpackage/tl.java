package defpackage;

import java.lang.annotation.Annotation;
/* compiled from: Annotations.java */
/* renamed from: tl  reason: default package */
/* loaded from: classes2.dex */
public interface tl {
    <A extends Annotation> A a(Class<A> cls);

    boolean b(Class<?> cls);

    boolean c(Class<? extends Annotation>[] clsArr);

    int size();
}
