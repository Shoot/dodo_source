package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: JsonCreator.java */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: fa5  reason: default package */
/* loaded from: classes2.dex */
public @interface fa5 {

    /* compiled from: JsonCreator.java */
    /* renamed from: fa5$a */
    /* loaded from: classes2.dex */
    public enum a {
        DEFAULT,
        DELEGATING,
        PROPERTIES,
        DISABLED
    }

    a mode() default a.DEFAULT;
}
