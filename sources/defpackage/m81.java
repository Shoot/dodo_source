package defpackage;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: ClassPathResourceMetadataLoader.java */
/* renamed from: m81  reason: default package */
/* loaded from: classes.dex */
public final class m81 implements si6 {
    private static final Logger a = Logger.getLogger(m81.class.getName());

    @Override // defpackage.si6
    public InputStream a(String str) {
        InputStream resourceAsStream = m81.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            a.log(Level.WARNING, String.format("File %s not found", str));
        }
        return resourceAsStream;
    }
}
