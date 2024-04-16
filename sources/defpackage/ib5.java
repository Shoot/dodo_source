package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: JsonNaming.java */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ib5  reason: default package */
/* loaded from: classes2.dex */
public @interface ib5 {
    Class<? extends wq8> value() default wq8.class;
}
