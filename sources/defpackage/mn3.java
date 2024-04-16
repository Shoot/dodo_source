package defpackage;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: Expose.java */
@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: mn3  reason: default package */
/* loaded from: classes2.dex */
public @interface mn3 {
    boolean deserialize() default true;

    boolean serialize() default true;
}
