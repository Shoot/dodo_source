package io.realm.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface RealmModule {
    boolean allClasses() default false;

    p89 classNamingPolicy() default p89.NO_POLICY;

    Class<?>[] classes() default {};

    p89 fieldNamingPolicy() default p89.NO_POLICY;

    boolean library() default false;
}
