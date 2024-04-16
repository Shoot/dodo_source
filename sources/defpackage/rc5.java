package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: JsonTypeInfo.java */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: rc5  reason: default package */
/* loaded from: classes2.dex */
public @interface rc5 {

    /* compiled from: JsonTypeInfo.java */
    /* renamed from: rc5$a */
    /* loaded from: classes2.dex */
    public enum a {
        PROPERTY,
        WRAPPER_OBJECT,
        WRAPPER_ARRAY,
        EXTERNAL_PROPERTY,
        EXISTING_PROPERTY
    }

    /* compiled from: JsonTypeInfo.java */
    /* renamed from: rc5$b */
    /* loaded from: classes2.dex */
    public enum b {
        NONE(null),
        CLASS("@class"),
        MINIMAL_CLASS("@c"),
        NAME("@type"),
        DEDUCTION(null),
        CUSTOM(null);
        
        private final String a;

        b(String str) {
            this.a = str;
        }

        public String a() {
            return this.a;
        }
    }

    /* compiled from: JsonTypeInfo.java */
    @Deprecated
    /* renamed from: rc5$c */
    /* loaded from: classes2.dex */
    public static abstract class c {
    }

    Class<?> defaultImpl() default rc5.class;

    a include() default a.PROPERTY;

    String property() default "";

    b use();

    boolean visible() default false;
}
