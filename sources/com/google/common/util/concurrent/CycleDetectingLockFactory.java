package com.google.common.util.concurrent;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
public class CycleDetectingLockFactory {
    private static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, c>> a = new s66().l().i();
    private static final Logger b = Logger.getLogger(CycleDetectingLockFactory.class.getName());
    private static final ThreadLocal<ArrayList<c>> c = new a();

    /* loaded from: classes2.dex */
    public static final class PotentialDeadlockException extends b {
        private final b c;

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb = new StringBuilder(message);
            for (Throwable th = this.c; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }
    }

    /* loaded from: classes2.dex */
    class a extends ThreadLocal<ArrayList<c>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList<c> initialValue() {
            return mr5.h(3);
        }
    }

    /* loaded from: classes2.dex */
    private static class b extends IllegalStateException {
        static final StackTraceElement[] a = new StackTraceElement[0];
        static final zw4<String> b = zw4.l0(CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());
    }

    /* loaded from: classes2.dex */
    private static class c {
    }
}
