package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: OptionalHandlerFactory.java */
/* renamed from: ub7  reason: default package */
/* loaded from: classes2.dex */
public class ub7 implements Serializable {
    private static final Class<?> c;
    private static final Class<?> d;
    private static final s85 e;
    public static final ub7 f;
    private final Map<String, String> a;
    private final Map<String, Object> b;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:6:0x0006
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            r0 = 0
            java.lang.Class<org.w3c.dom.Node> r1 = org.w3c.dom.Node.class
            java.lang.Class<org.w3c.dom.Document> r2 = org.w3c.dom.Document.class
            goto L8
        L6:
            r1 = r0
        L7:
            r2 = r0
        L8:
            defpackage.ub7.c = r1
            defpackage.ub7.d = r2
            s85 r0 = defpackage.s85.b()     // Catch: java.lang.Throwable -> L10
        L10:
            defpackage.ub7.e = r0
            ub7 r0 = new ub7
            r0.<init>()
            defpackage.ub7.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub7.<clinit>():void");
    }

    protected ub7() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        hashMap.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap2.put("java.sql.Timestamp", wm2.f);
        hashMap2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        hashMap2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        hashMap2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        hashMap2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    private boolean a(Class<?> cls, Class<?> cls2) {
        if (cls2 != null && cls2.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    private boolean c(Class<?> cls, String str) {
        do {
            cls = cls.getSuperclass();
            if (cls == null || cls == Object.class) {
                return false;
            }
        } while (!cls.getName().startsWith(str));
        return true;
    }

    private Object d(Class<?> cls, y85 y85Var) {
        try {
            return q81.k(cls, false);
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to create instance of `" + cls.getName() + "` for handling values of type " + q81.D(y85Var) + ", problem: (" + th.getClass().getName() + ") " + th.getMessage());
        }
    }

    private Object e(String str, y85 y85Var) {
        try {
            return d(Class.forName(str), y85Var);
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to find class `" + str + "` for handling values of type " + q81.D(y85Var) + ", problem: (" + th.getClass().getName() + ") " + th.getMessage());
        }
    }

    public gc5<?> b(pca pcaVar, y85 y85Var, fa0 fa0Var) {
        Object e2;
        gc5<?> a;
        Class<?> u = y85Var.u();
        if (a(u, c)) {
            return (gc5) e("com.fasterxml.jackson.databind.ext.DOMSerializer", y85Var);
        }
        s85 s85Var = e;
        if (s85Var != null && (a = s85Var.a(u)) != null) {
            return a;
        }
        String name = u.getName();
        Object obj = this.b.get(name);
        if (obj != null) {
            if (obj instanceof gc5) {
                return (gc5) obj;
            }
            return (gc5) e((String) obj, y85Var);
        } else if ((!name.startsWith("javax.xml.") && !c(u, "javax.xml.")) || (e2 = e("com.fasterxml.jackson.databind.ext.CoreXMLSerializers", y85Var)) == null) {
            return null;
        } else {
            return ((cda) e2).d(pcaVar, y85Var, fa0Var);
        }
    }
}
