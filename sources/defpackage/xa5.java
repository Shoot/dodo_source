package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: JsonIdentityInfo.java */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: xa5  reason: default package */
/* loaded from: classes2.dex */
public @interface xa5 {
    Class<? extends y47<?>> generator();

    String property() default "@id";

    Class<Object> resolver() default nla.class;

    Class<?> scope() default Object.class;
}
