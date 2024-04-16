package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: JsonSubTypes.java */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: lc5  reason: default package */
/* loaded from: classes2.dex */
public @interface lc5 {

    /* compiled from: JsonSubTypes.java */
    /* renamed from: lc5$a */
    /* loaded from: classes2.dex */
    public @interface a {
        String name() default "";

        String[] names() default {};

        Class<?> value();
    }

    a[] value();
}
