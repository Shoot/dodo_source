package defpackage;

import kotlin.Metadata;
/* compiled from: KotlinReflectionNotSupportedError.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljh5;", "Ljava/lang/Error;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: jh5  reason: default package */
/* loaded from: classes3.dex */
public class jh5 extends Error {
    public jh5() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
