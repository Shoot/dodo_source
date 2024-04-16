package defpackage;

import defpackage.gc5;
import defpackage.lw1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: JsonSerialize.java */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: fc5  reason: default package */
/* loaded from: classes2.dex */
public @interface fc5 {

    /* compiled from: JsonSerialize.java */
    @Deprecated
    /* renamed from: fc5$a */
    /* loaded from: classes2.dex */
    public enum a {
        ALWAYS,
        NON_NULL,
        NON_DEFAULT,
        NON_EMPTY,
        DEFAULT_INCLUSION
    }

    /* compiled from: JsonSerialize.java */
    /* renamed from: fc5$b */
    /* loaded from: classes2.dex */
    public enum b {
        DYNAMIC,
        STATIC,
        DEFAULT_TYPING
    }

    Class<?> as() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends lw1> contentConverter() default lw1.a.class;

    Class<? extends gc5> contentUsing() default gc5.a.class;

    Class<? extends lw1> converter() default lw1.a.class;

    @Deprecated
    a include() default a.DEFAULT_INCLUSION;

    Class<?> keyAs() default Void.class;

    Class<? extends gc5> keyUsing() default gc5.a.class;

    Class<? extends gc5> nullsUsing() default gc5.a.class;

    b typing() default b.DEFAULT_TYPING;

    Class<? extends gc5> using() default gc5.a.class;
}
