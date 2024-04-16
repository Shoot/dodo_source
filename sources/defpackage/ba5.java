package defpackage;

import defpackage.cb5;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: JsonAppend.java */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ba5  reason: default package */
/* loaded from: classes2.dex */
public @interface ba5 {

    /* compiled from: JsonAppend.java */
    /* renamed from: ba5$a */
    /* loaded from: classes2.dex */
    public @interface a {
        cb5.a include() default cb5.a.NON_NULL;

        String propName() default "";

        String propNamespace() default "";

        boolean required() default false;

        String value();
    }

    /* compiled from: JsonAppend.java */
    /* renamed from: ba5$b */
    /* loaded from: classes2.dex */
    public @interface b {
        cb5.a include() default cb5.a.NON_NULL;

        String name() default "";

        String namespace() default "";

        boolean required() default false;

        Class<?> type() default Object.class;

        Class<? extends q1c> value();
    }

    a[] attrs() default {};

    boolean prepend() default false;

    b[] props() default {};
}
